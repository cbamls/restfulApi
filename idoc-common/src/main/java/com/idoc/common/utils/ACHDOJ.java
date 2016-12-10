package com.idoc.common.utils;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/11/28
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */


public class ACHDOJ {
    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ACHDOJ.class);
    private static String session = "";
    private static String userName = "";
    private static String  password = "";
    public List getBlogUrlBaidu(String url) {
        List list = new ArrayList<>();
        String rtn = HttpUtils.getInstance()
                .addHeader("Host", "www.baidu.com")
                .addHeader("User-Agent","Mozilla/5.0 (Windows NT 6.3; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0")
                // .addHeader("Cookie", "BAIDUID=B9B48C6259486551C447660F9C1A7847:FG=1; BIDUPSID=74116AD565D059F5E1C73C534C55FF86; PSTM=1479806655; ispeed_lsm=0; BD_UPN=13314552; ispeed=1; H_PS_PSSID=1443_21655_21127_18133_21455_21409_21554_20929; H_PS_645EC=0faaO%2FNNCER4e9Oeee8zxGbI4eFJMmcUxUHjd%2BJPWWa5FWR5ap5gERlv%2BXY; BD_CK_SAM=1; PSINO=2")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .doGet(url)
                .getContent();
        Pattern p = Pattern.compile("href=\"(http://blog.csdn[^\\s\"]+)\"");
        Matcher m = p.matcher(rtn);
        while(m.find()) {
            System.out.println(m.group(1));
        }
        return list;
    }
    public boolean toLogin() {
        Map<String, String> params = new HashMap<>(2);
        params.put("username", userName);
        params.put("userpass", password);
        params.put("login", "Sign+In");
        HttpUtils.ResponseResult re = HttpUtils.getInstance()
                .doPost("http://acm.hdu.edu.cn/userloginex.php?action=login", params);
        String content = re.getContent();
        session =  re.getCookies().substring(re.getCookies().indexOf("PHPSESSID"));
        return content.length() > 2 ? false : true;
    }
    public String checkSubmit(String name, int problem_id, String flag_run_id, boolean flag, String userCode, String blog_url, String blog_html) {
        HttpUtils.ResponseResult rs = HttpUtils.getInstance()
                .addHeader("Host", "acm.hdu.edu.cn")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0")
                .addHeader("Cookie", session)
                //.addHeader("Cookie", "CNZZDATA1254072405=652775645-1479901221-%7C1480340391; PHPSESSID=639helutvnogr2suru6amds807; exesubmitlang=0")
                .addHeader("Connection", "keep-alive")
                .doPost("http://acm.hdu.edu.cn/status.php");
        //.doGet("http://acm.hrbust.edu.cn/index.php?m=ProblemSet&a=postCode")

        String html = rs.getContent();
        try {
            HttpUtils.getInstance().close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int td;

       while((td = html.indexOf("<a href=\"/showproblem.php?pid=" + problem_id)) == -1) {
           LOGGER.error("无限");
          return "ing," + flag_run_id;
       }
        int td_start = td;
        while(html.indexOf("/viewcode.php?rid=", td_start) == -1) {
            return "ing," + flag_run_id;
        }
        int loc_run_id = html.indexOf("/viewcode.php?rid=", td_start) + "/viewcode.php?rid=".length();
        String cur_run_id = html.substring(loc_run_id, loc_run_id + 8);
        System.out.println("cur_run_id => " + cur_run_id);
       // if(list_run_id.contains(cur_run_id))
        System.out.println("falg_run_id => " + flag_run_id + " cur_run_id => " + cur_run_id);
        while(flag_run_id.equals(cur_run_id) && flag) {
            LOGGER.error("无限循环了");
            return "ing," + cur_run_id;
        }
        int tx = html.indexOf("</font></td><td><a href=\"/showproblem.php?pid=" + problem_id, td - 100);
        int ty = html.indexOf("</font></a></td><td><a href=\"/showproblem.php?pid=" + problem_id, td - 100);
        int loc_right;
        if(tx != -1 && ty != -1) {
            loc_right = Math.min(tx, ty);
        } else if(tx != -1 || ty != -1){
            loc_right = Math.max(tx, ty);
        } else {
            LOGGER.error("能出现 => " + tx  + "  " + ty);
            return "ing";
        }

        int loc_color = html.indexOf("color", loc_right - 50);
        int loc_left = html.indexOf(">", loc_color);
        String judge_result = html.substring(loc_left + 1, loc_right);


        int loc_run_time = html.indexOf("</a></td><td>", td) + "</a></td><td>".length();
        int loc_MS = html.indexOf("MS", loc_run_time);
        int run_time = Integer.parseInt(html.substring(loc_run_time, loc_MS));
        LOGGER.debug("run_time => " + run_time);
        int loc_memory = html.indexOf("K", loc_run_time);
        int memory = 0;
        try {
           memory = Integer.parseInt(html.substring(loc_MS + 11, loc_memory));
       } catch (Exception x) {
           x.printStackTrace();
       }
        LOGGER.debug("memory=> " + memory);

        String re2 = judge_result;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowDate = sdf.format(new Date());
        try {
            if(!judge_result.equals("Accepted")) {
                this.persistent(problem_id, userCode, Integer.parseInt(cur_run_id), run_time, String.valueOf(memory), userName, nowDate, judge_result, blog_url, "" );

            } else {
                this.persistent(problem_id, userCode, Integer.parseInt(cur_run_id), run_time, String.valueOf(memory), userName, nowDate, judge_result, blog_url, blog_html );

            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        LOGGER.debug("judge_result => " + judge_result);
        System.out.println("c =>"+re2);
        if(re2.substring(re2.length() - 3).equals("ing")) {
            return "ing," + cur_run_id;
        } else if(re2.equals("Accepted")) {
            return "Accepted," + cur_run_id;
        } else {
            return "complete," + cur_run_id;
        }
    }
    public String submitCode(String userCode, int problem_id, String  flag_run_id, boolean flag2, String blog_url, String blog_html) {
        Map<String, String> params = new HashMap<>(2);
        params.put("problemid", String.valueOf(problem_id));
        params.put("language", "0");
        params.put("usercode", userCode);
        HttpUtils.ResponseResult rs = HttpUtils.getInstance()
                .addHeader("Host", "acm.hdu.edu.cn")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,****/*//*//**//*//**//**//**//*;q=0.8")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
                .addHeader("Cookie", session)
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.3; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0")
                .addHeader("Connection", "keep-alive")
                .doPost("http://acm.hdu.edu.cn/submit.php?action=submit", params);
                //.doGet("http://acm.hrbust.edu.cn/index.php?m=ProblemSet&a=postCode")

        String rtn = rs.getContent();
        String flag = "ing";
        String [] arr = null;
        int tot = 0;
        while(flag.equals("ing")) {
            if(tot++ == 20) {
                return "b" + arr[1];
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String t = checkSubmit("cbam", problem_id, flag_run_id, flag2, userCode, blog_url, blog_html);
            arr = t.split(",");
            flag = arr[0];
        }
        System.out.println("falg => " + flag);
        if(flag.equals("Accepted")) {
            return "a" + arr[1];
        }
        return "b" + arr[1];
    }

    public List getBlogUrlBiying(String url) {
        List list = new ArrayList<>();
        HttpUtils.ResponseResult rs = HttpUtils.getInstance()
                .addHeader("Host", "cn.bing.com")
                .addHeader("User-Agent","Mozilla/5.0 (Windows NT 6.3; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0")
                //.addHeader("Cookie", "MUID=1C5A4304492967353B4C4ADC4D2964C5; SRCHD=AF=NOFORM; SRCHUID=V=2&GUID=A80CCA430001400A8459A69423BFF3EC; SRCHUSR=DOB=20161129; _SS=SID=0AA5546D02076A360E5E5DB103A66B96&HV=1480387684; _EDGE_S=mkt=zh-cn&SID=0AA5546D02076A360E5E5DB103A66B96; MUIDB=1C5A4304492967353B4C4ADC4D2964C5; SRCHHPGUSR=CW=1349&CH=146&DPR=1&UTC=480; WLS=TS=63615984486; _FP=hta=on")
                .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .doGet(url);
        String rtn = rs.getContent();
      /*  try {
            HttpUtils.getInstance().close();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
       // System.out.println(rtn);
        Pattern p = Pattern.compile("href=\"(http://www.cnblogs.com[^\\s\"]+)\"");
        Matcher m = p.matcher(rtn);
        while(m.find()) {
           list.add(m.group(1));
        }
        return list;

    }
    public String getCodeHtml(String url) {

        //http://blog.csdn.net/creativewang/article/details/7588533
        //"http://blog.csdn.net/.*/article/details/.*"
        List list = new ArrayList<>();
        try {
            HttpUtils.getInstance().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpUtils.ResponseResult  rs = HttpUtils.getInstance()
                .addHeader("Host", "www.jtahstu.com")
                .addHeader("User-Agent","Mozilla/5.0 (Windows NT 6.3; WOW64; rv:50.0) Gecko/20100101 Firefox/50.0")
                .addHeader("Accept-Encoding","gzip, deflate")
               // .addHeader("Cookie", "uuid_tt_dd=1746089302942500699_20161122; Hm_lvt_6bcd52f51e9b3dce32bec4a3997715ac=1480386893,1480387577,1480388253,1480388647; bdshare_firstime=1479807144554; __message_sys_msg_id=0; __message_gu_msg_id=0; __message_cnel_msg_id=0; __message_in_school=0; _ga=GA1.2.2133540753.1479812381; UN=lsgqjh; UE=\"756029571@qq.com\"; BT=1480245865041; __utma=17226283.2133540753.1479812381.1479879714.1479879714.1; __utmz=17226283.1479879714.1.1.utmcsr=tuicool.com|utmccn=(referral)|utmcmd=referral|utmcct=/articles/rEfEBn; __message_district_code=230000; uuid=1cad9e63-f6a7-442b-9489-a12a5e55224a; Hm_lpvt_6bcd52f51e9b3dce32bec4a3997715ac=1480388647; avh=51232558%2c51232260%2c40891791%2c4757021%2c7884836; dc_tos=ohdv6w; dc_session_id=1480388648017")
                .addHeader("Connection", "keep-alive")
                .addHeader("Upgrade-Insecure-Requests","1")
                .addHeader("If-None-Match","W/\"376d82c4c2a4d366cf51a803eb4510ba\"")
                .addHeader("Cache-Control","max-age=0")
                .doGet(url);
        String rtn = rs.getContent();
        try {
            HttpUtils.getInstance().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
       // System.out.println(rtn);
        return rtn;
    }
    public String getCode(String html, int problem_id) {
        html = html.replaceAll("<br/>", "\n").replaceAll("<br />", "\n");

        String str = "";
        String java = StringEscapeUtils.escapeJava(html);
        if(html == null) {
            return "";
        }
        String newHtml = java.replaceAll("\n", "");
        Pattern p = Pattern.compile("<title>(.*)</title>");
        Matcher m = p.matcher(newHtml);

        while(m.find()) {
            LOGGER.debug(m.group(1));
            int x = m.group(1).indexOf(String.valueOf(problem_id));
            if(m.group(1).indexOf(String.valueOf(problem_id)) == -1) {
                return "";
            }


        }


        int loc_start = html.indexOf("#include");

        int tx = html.indexOf("</textarea>", loc_start);
        int ty = html.indexOf("</pre>", loc_start);
        int loc_end = 0;
        if(tx != -1 && ty != -1)
            loc_end= Math.min(tx, ty);
         else if(tx == -1 && ty != -1) {
            loc_end = ty;
        } else if(tx != -1 && ty == -1) {
            loc_end = tx;
        } else {
            return str;
        }
        if(loc_start == -1 || loc_end == -1) {
            return str;
        }
        if(loc_end -loc_start <= 50) {
            return str;
        }
//        Pattern p2 = Pattern.compile("<span style=\"color: #008080;\">(.*)</span>");
//        Matcher m2 = p2.matcher(html);
//        while(m2.find()) {
//            html = html.replaceAll("<span style=\"color: #008080;\">" + m2.find() + "</span>", "");
//        }
        int loc;
        html = html.substring(loc_start, loc_end);
        while((loc = html.indexOf("<span style=\"color: #008080;\">")) != -1) {
            int loc_span = html.indexOf("</span>", loc);
            String fin_str = html.substring(loc, loc_span + 7);
            html = html.replace(fin_str, "");
        }
        str = FilterHtml.delHTMLTag(html);

        if(str.indexOf("</span>") != -1 || str.indexOf("<strong>") != -1) {
            return "";
        }
        String regEx = "[\u4e00-\u9fa5]";
        Pattern pat = Pattern.compile(regEx);
        Matcher matcher = pat.matcher(html);
        boolean flg = false;
        if (matcher.find())    {
            flg = true;
        }
        if(flg) {
            return "";
        }
        if(str.indexOf("//") != -1) {
            return "";
        }
        return str;
    }
    public String resolve_code(String code) {
        String rtn = code.replaceAll("&lt;", "<")
                .replaceAll("&gt;", ">")
                .replaceAll("&quot;", "\"")
                .replaceAll("&amp;", "&")
                .replaceAll("&#39;", "\'")
                .replaceAll("&nbsp;", " ")
                .replaceAll("&#43;", "+");
        return rtn;
    }
    public String encoded(String code) {
        try {
            byte[] tbyte = code.getBytes("utf-8");
            String newStr = new String(tbyte,"gb2312");
            return newStr;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public String reslove_list_url(List list_url, int problem_id) {
        String result = "";
        String flag_run_id = "";
        boolean yy = true;
        for(Object each : list_url) {
            String url = (String) each;
            System.out.println("url => " + url);
            String csdn_html = getCodeHtml(url);
            String code = getCode(csdn_html, problem_id);

            if(code.equals("")) {
                continue;
            }
            String resolved_code = "#include<string.h>\n";
            resolved_code += "#include<algorithm>\n";
            resolved_code += resolve_code(code);
            resolved_code = resolved_code.replaceAll("printf","xyzmnaaaaa333");
            resolved_code = resolved_code.replaceAll("#include", "\n#include").replaceAll("using", "\nusing").replaceAll("int main", "\nint main").replaceAll("std;", "std;\n").replaceAll("#define", "\n#define").replaceAll("crayon-st\">", "crayon-st\">\n").replaceAll(".h>", ".h>\n")
                    .replaceAll("void", "\nvoid").replaceAll("double", "\ndouble").replaceAll("const", "\nconst").replaceAll(">>", "> >").replaceAll(" int ", " \nint ").replaceAll("long long", "long long\n").replaceAll("int ", "\nint ").replaceAll("char ", "\nchar ").replaceAll("typedef", "\ntypedef").replaceAll("__int64", "\n__int64")
                    .replaceAll("> >", ">>").replaceAll("struct ", "\nstruct ").replaceAll("cma.h", "math.h");

            String sov = resolved_code.replaceAll("xyzmnaaaaa333", "printf");
            if(yy) {
                yy = false;
                String res = this.submitCode(sov, problem_id, flag_run_id, false, url, csdn_html);
                if(String.valueOf(res.charAt(0)).equals("a")) {
                    break;
                } else {
                    flag_run_id = res.substring(1);
                }
            } else {
                String res = this.submitCode(sov, problem_id, flag_run_id, true, url, csdn_html);
                if(String.valueOf(res.charAt(0)).equals("a")) {
                    break;
                } else {
                    flag_run_id = res.substring(1);
                }
            }

            LOGGER.debug("next-----------------------");
        }
        return result;
    }
    public Boolean init(HashMap map) {
        DbUtil dbUtil = new DbUtil();
        String sql = "select problem_id from autoac_copy";
        ResultSet rs = dbUtil.select(sql);
        try {
            while (rs.next()) {
                int problem_id = rs.getInt(1);
                //System.out.println(problem_id);
                map.put(problem_id, true);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("初始化成功！");
        return true;
    }
    public String toHexString(String s)
    {
        String str="";
        for (int i=0;i<s.length();i++)
        {
            int ch = (int)s.charAt(i);
            String s4 = Integer.toHexString(ch);
            str = str + s4;
        }
        return str;
    }
    public void persistent(int problem_id, String code, int run_id, int run_time, String mem, String author, String date, String state, String blog_url, String blog_html) throws UnsupportedEncodingException {
        String sql = "insert into autoac_copy(problem_id, run_id, run_time, memory, author, create_time, ac_code, ac_time, acmer, password, state, blog_url, blog_html)  values(" + problem_id + "," + run_id + "," + run_time
                + ",\"" + mem + "k\",\"" + userName + "\",now(),'" + toHexString(code) + "', str_to_date('" + date +"','%Y-%m-%d %H:%i:%s'),'" + userName + "', '" + password + "', '"+ state +"','" + blog_url + "','" + toHexString(blog_html) + "')";
        new DbUtil().insert(sql);
        LOGGER.debug("已存库 ！");
    }
    public String getString() {
      String str = "1105 0/2 1117 0/3 1123 0/2 1149 0/1 1156 0/4 1206 0/1 1268 0/3 1288 0/2 1314 0/3 1349 0/1 1373 0/2 1383 0/1 1386 0/1 1389 0/1 1392 0/2 1415 0/3 1419 0/1 1424 0/1 1440 0/1 1442 0/2 1446 0/1 1450 0/1 1458 0/2 1460 0/1 1463 0/2 1469 0/2 1475 0/1 1506 0/3 1511 0/2 1537 0/1 1565 0/3 1586 0/1 1600 0/1 1601 0/1 1610 0/2 1612 0/1 1618 0/1 1623 0/3 1629 0/3 1636 0/2 1637 0/2 1639 0/1 1649 0/3 1650 0/1 1658 0/1 1697 0/1 1731 0/2 1734 0/2 1759 0/2 1761 0/2 1793 0/1 1797 0/1 1821 0/1 1822 0/1 1836 0/4 1844 0/2 1854 0/1 1891 0/1 1897 0/1 1909 0/1 1923 0/1 1932 0/2 1946 0/1  0/2 0/1 1952 0/1 1953 0/2 1961 0/2 1968 0/1 1971 0/2 1980 0/1 2168 0/1 2173 0/1 2174 0/2 2198 0/1 2223 0/1 2226 0/2 2240 0/1 2245 0/1 2249 0/1 2251 0/2 2252 0/1 2260 0/2 2270 0/1 2283 0/1 2286 0/1 2287 0/1 2288 0/1 2301 0/3 2306 0/1 2311 0/2 2318 0/1 2326 0/1 2332 0/2 2342 0/1 2357 0/1 2362 0/1 2367 0/1 2373 0/3 2378 0/1 2379 0/1 2381 0/1 2382 0/2 2386 0/3 2392 0/1 2394 0/2 2396 0/2 2397 0/1 2400 0/1 2405 0/1 2406 0/2 2411 0/2 2417 0/1 2449 0/1 2467 0/1 2479 0/1 2482 0/2 2488 0/1 2533 0/2 2536 0/1 2538 0/1 2541 0/1 2557 0/1 2558 0/1 2559 0/1 2592 0/3 2625 0/1 2649 0/1 2655 0/1 2663 0/1 2664 0/1 2666 0/1 2667 0/1 2676 0/2 2678 0/2 2679 0/1 2692 0/1 2693 0/1 2697 0/1 2706 0/1 2718 0/2 2724 0/1 2726 0/2 2729 0/1 2751 0/3 2752 0/4 2755 0/1 2761 0/1 2774 0/1 2777 0/3 2778 0/3 2781 0/1 2784 0/1 2808 0/1 2846 0/4 2856 0/2 2893 0/1 2914 0/2 2915 0/2 2924 0/1 2933 0/2 2934 0/1 2936 0/2 2941 0/1 2945 0/1 2946 0/1 2960 0/3 2975 0/3 2976 0/1 2982 0/1 2983 0/2 2987 0/1 2993 0/4 2995 0/1 2996 0/1 3004 0/2 3019 0/1 3020 0/2 3021 0/1 3026 0/1 3027 0/2 3028 0/1 3041 0/1 3048 0/1 3054 0/1 3056 0/2 3057 0/1 3064 0/1 3070 0/2 3071 0/3 3073 0/1 3075 0/1 3084 0/1 3087 0/1 3095 0/2 3097 0/2 3106 0/1 3114 0/2 3122 0/2 3135 0/2 3141 0/1 3145 0/2 3147 0/1 3155 0/1 3159 0/2 3160 0/1 3161 0/1 3167 0/5 3169 0/1 3170 0/1 3171 0/1 3190 0/1 3197 0/1 3204 0/1 3205 0/1 3225 0/3 3243 0/3 3252 0/1 3261 0/1 3273 0/1 3287 0/1 3290 0/5 3297 0/2 3301 0/1 3305 0/1 3324 0/1 3334 0/1 3356 0/1 3373 0/1 3386 0/1 3387 0/1 3390 0/2 3391 0/1 3396 0/1 3417 0/1 3427 0/2 3438 0/1 3447 0/1 3489 0/1 3494 0/1 3517 0/1 3528 0/2 3531 0/3 3541 0/1 3557 0/1 3568 0/1 3574 0/1 3583 0/1 3608 0/1 3624 0/3 3660 0/4 0/1 3678 0/2 3680 0/1 3689 0/3 3690 0/2 3723 0/2 3728 0/2 3733 0/1 3736 0/2 3737 0/1 3738 0/1 3740 0/3 3742 0/1 3745 0/1 3754 0/1 3764 0/3 3770 0/1 3771 0/1 3774 0/1 3776 0/4 3780 0/1 3793 0/2 3801 0/2 3812 0/1 3813 0/1 3814 0/2 3821 0/1 3822 0/1 3824 0/1 3856 0/2 3868 0/2 3871 0/1 3894 0/1 3904 0/2 3918 0/1 3922 0/2 3931 0/1 3942 0/1 3968 0/1 3972 0/6 3981 0/1 3983 0/2 3984 0/1 3989 0/1 3990 0/1 3997 0/1 4019 0/1 4042 0/1 4043 0/3 4051 0/1 4053 0/1 4060 0/1 4084 0/1 4086 0/1 4099 0/6 4136 0/1 4191 0/1 4208 0/1 4216 0/1 4225 0/2 4244 0/2 4246 0/1 4290 0/1 4368 0/2 4423 0/1 4437 0/1 4457 0/1 4470 0/1 4481 0/1 4575 0/2 4577 0/3 4592 0/3 4613 0/2 4615 0/3 4626 0/1 4657 0/2 4663 0/1 4673 0/1 4694 0/2 4728 0/1 4736 0/2 4765 0/1 4797 0/1 4822 0/3 4839 0/4 4881 0/1 4892 0/2 4919 0/4 4951 0/5 4953 0/1 4957 0/1 5026 0/1 5061 0/1 5118 0/1 5121 0/1 5129 0/1 5169 0/1 5205 0/1 5220 0/1 5235 0/2 5283 0/1 5296 0/4 5300 0/1 5376 0/1 5394 0/2 5440 0/1 5470 0/1 5472 0/1 5503 0/1 5528 0/1 5535 0/1 5660 0/1 5679 0/1 5745 0/3 5766 0/1 5785 0/2 5788 0/1 5828 0/2 5830 0/1 5890 0/2 5933 0/1 5934 0/1 5936 0/2 5937 0/1 5938 0/1 5943 0/1 5948 0/1 5964 0/1 5965 0/2 5966 0/1 5980 0/1 ";
        return str;
    }
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        userName = args[2];
        password = args[3];
        ACHDOJ achdoj = new ACHDOJ();

       // List list = achdoj.getBlogUrlBaidu("https://www.baidu.com/s?ie=utf-8&f=8&rsv_bp=1&rsv_idx=1&tn=baidu&wd=%20hdu%201002%20csdn&oq=hdu%201002%20csdb&rsv_pq=c0e8521c00050b46&rsv_t=4ce9Z5VYa1xACxYuotgWhc%2BRFlwuN0sixZapzB%2BCg3I5tMT5Pl0ABpdboFM&rqlang=cn&rsv_enter=0&inputT=1767&rsv_sug3=43&rsv_sug4=2312");
       HashMap map = new HashMap();
        //achdoj.init(map);
        String [] arr = achdoj.getString().split(" ");
        for(String str : arr) {
            if(str.length() == 4) {

                map.put(str, true);
            }
        }
        if(!achdoj.toLogin()) {
            LOGGER.error("登录失败");
            return ;
        } else {
            LOGGER.debug("登录成功");
        }
        for(int start = k; start <= m; start++) {
            try {
                if(!map.containsKey(String.valueOf(start))) {
                    continue;
                }
                List list_url = new ArrayList();
                list_url.add("http://www.jtahstu.com/acoj/show.php?pid=" + start);
                if(list_url.size() >= 1) {
                    achdoj.reslove_list_url(list_url, start);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
   }
}
