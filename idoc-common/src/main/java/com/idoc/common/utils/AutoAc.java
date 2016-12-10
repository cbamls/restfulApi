package com.idoc.common.utils;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.protocol.HTTP;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/11/26
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */

/**
 * "#include+<iostream>using+namespace+std;int+main()+{++++int+a,+b;++++while+(cin+>>+a+>>+b)+{++++++++cout+<<+a+++b+<<+endl;++++}++++return+0;}+"
 */
public class AutoAc {
    private static String userName = "cbam9";
    private static String password = "chenggong2";
    private static boolean shareCode = false;
    private static int credit = 0;
    private static boolean viewCode = false;
    private static boolean enableAC = false;
    private static boolean toFile = false;
    private static final String SHARED_LIST_URL = "http://acm.hrbust.edu.cn/index.php?jumpUrl=&m=Status&a=showStatus&user_name=&judge_status=2&language=2&shared=1&problem_id=";
    private static final String VIEW_SHARED_CODE = "http://acm.hrbust.edu.cn/index.php?m=ShareCode&a=viewshare&bought=1&run_id=";
    private static final String LOGIN_URL = "http://acm.hrbust.edu.cn/index.php?m=User&a=login";
    private static final String COOKIES = "_ga=GA1.3.1882735288.1479881561; last_problem_vol=1; PHPSESSID=k54h8ift5u9621qmqc8t0o1t17";
    private static final String SHARE_CODE_URL = "http://acm.hrbust.edu.cn/index.php?m=ShareCode&a=setshare&is_shared=1&run_id=";
    private static final String STATUS_URL = "http://acm.hrbust.edu.cn/index.php?m=Status&a=showStatus";
    public void doChainPost(String problem_id, String code) {
        System.out.println("Judging...... " + problem_id);
        Map<String, String> params = new HashMap<>(2);
        params.put("jumpUrl", "");
        params.put("problem_id", problem_id);
        params.put("language", "2");
        params.put("source_code", code);
        String re = HttpUtils.getInstance()
                .doPost("http://acm.hrbust.edu.cn/index.php?m=ProblemSet&a=postCode", params)
                                //.doGet("http://acm.hrbust.edu.cn/index.php?m=ProblemSet&a=postCode")
                .getContent();
    }
    public String toLogin() {
        if(!readAccount()) {
            System.out.println("系统找不到指定的文件！");
            return "";
        }
        Map<String, String> params = new HashMap<>(2);
        params.put("user_name", userName);
        params.put("password", password);

        HttpUtils.ResponseResult re = HttpUtils.getInstance()
                .addHeader("POST", "/index.php?m=ProblemSet&a=postCode HTTP/1.1")
                .addHeader("Host", "acm.hrbust.edu.cn")
                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .addHeader("Accept-Language", "zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
                .addHeader("Accept-Encoding", "gzip, deflate")
                .addHeader("Connection", "keep-alive")
                .addHeader("Upgrade-Insecure-Requests", "1")
                .doPost(LOGIN_URL, params);
        String content = re.getContent();
        HttpUtils.getInstance().addHeader("Cookie", re.getCookies().substring(re.getCookies().indexOf("PHPSESSID")));
                //.doGet("http://acm.hrbust.edu.cn/index.php?m=ProblemSet&a=postCode")


        if(content.length() > 5) {
            System.out.println("error login！　please check your account !");
            return "error";
        }
        System.out.println("登录成功！用户: " + this.userName);
        return content;
    }
    public String getSharedListUrl(String targetUrl) {
        String rtn = HttpUtils.getInstance()
                .doGet(targetUrl)
                .getContent();
        return rtn;
    }

    public TreeMap<Integer, List> getShareMap(int problem_id, List unsolved) {
        //选出效率最高的AC分享
        TreeMap<Integer, List> map = new TreeMap<>();
        String target_shared_url = SHARED_LIST_URL + problem_id;
        String html = this.getSharedListUrl(target_shared_url);
        int loc = 0;
        int minTime = 100000;
        //System.out.println(html);
        while(html.indexOf("this code\"><img src=\"Public/images/viewshare.png\"></a></td><td>", loc) != -1 ) {
            int loc_run_id = html.indexOf("this code\"><img src=\"Public/images/viewshare.png\"></a></td><td>", loc);
            int loc_time = html.indexOf("iew this code\">G++</a></td><td>", loc_run_id) + "iew this code\">G++</a></td><td>".length();
            int loc_ms = html.indexOf("ms", loc_time);
            int loc_td = html.indexOf("</td", loc_run_id + "this code\"><img src=\"Public/images/viewshare.png\"></a></td><td>".length());
            String run_time = html.substring(loc_time, loc_ms);
            int len = loc_run_id + "this code\"><img src=\"Public/images/viewshare.png\"></a></td><td>".length();
            String run_id = html.substring(len, loc_td);
            int loc_mem = html.indexOf("</td><td>", loc_ms);
            String mem = html.substring(loc_mem + 9, html.indexOf( "k\n" +
                    "\t\t\t\t</td><td",loc_mem + 9));
            int loc_author = html.indexOf("alt=\"", loc_mem);
            String author = html.substring(loc_author + 5, html.indexOf( "\">",loc_author + 5));
            int loc_date = html.indexOf("</td></tr>", loc_author);
            String date = html.substring(loc_date - 19, loc_date);
            loc = loc_ms;
            List list = new ArrayList<>();
            list.add(mem);
            list.add(author);
            list.add(run_id);
            list.add(date);
            if(Integer.parseInt(run_time) < minTime) {
                minTime = Math.min(Integer.parseInt(run_time), minTime);
                map.put(Integer.parseInt(run_time), list);
            } else if(Integer.parseInt(run_time) == minTime) {
                List pre_list = map.get(Integer.parseInt(run_time));
                if(Integer.parseInt(pre_list.get(0).toString()) > Integer.parseInt(mem)) {
                    map.put(Integer.parseInt(run_time), list);
                }
            }
            if(!map.containsKey(Integer.parseInt(run_time))) {
                map.put(Integer.parseInt(run_time), list);
            }
        }
        if(map.size() == 0) {
            System.out.println("我也不会.. 不好意思！");
            unsolved.add(problem_id);
        }
        return map;
    }

    public String getCode(int run_id, boolean flagShow) {
        String targetUrl = VIEW_SHARED_CODE + run_id;
        String rtn = null;
        String html = HttpUtils.getInstance()
                .doGet(targetUrl)
                .getContent();
       // System.out.println(html);
        int loc_start = html.indexOf("<pre class=\"prettyprint\">");
        int loc_end = html.indexOf("</pre></td></tr><tr><td class=\"showcode_");
        rtn = resolveCode(html.substring(loc_start + "<pre class=\"prettyprint\">".length(), loc_end));
        if(this.viewCode && flagShow) {
            System.out.println("AC code:\n\n" + rtn);
        }
        return rtn;
    }

    public String resolveCode(String code) {

       String rtn = code.replaceAll("&lt;", "<")
               .replaceAll("&gt;", ">")
               .replaceAll("&quot;", "\"")
               .replaceAll("&amp;", "&");
        return rtn;
    }

    public void persistent(int problem_id, String code, int run_id, int run_time, String mem, String author, String date) {
        if(!this.enableAC) {
            return ;
        }
        String sql = "insert into autoac(problem_id, run_id, run_time, memory, author, create_time, ac_code, ac_time, acmer, password)  values(" + problem_id + "," + run_id + "," + run_time
               + ",\"" + mem + "k\",\"" + author + "\",now(),\"" + StringEscapeUtils.escapeJava(code) + "\", str_to_date('" + date +"','%Y-%m-%d %H:%i:%s'),'" + this.userName + "', '" + this.password + "')";
        new DbUtil().insert(sql);
        System.out.println("已存库 ！");
    }

    public Boolean readAccount() {
        System.out.println("\n读取配置!\n");
        try {
            InputStreamReader isr=new InputStreamReader(new FileInputStream("E:\\webplace\\idoc\\idoc-common\\src\\main\\resources\\autoAC.properties"), "UTF-8");
           // InputStreamReader isr=new InputStreamReader(new FileInputStream("autoAC.properties"), "UTF-8");
            Properties props = new Properties();
            props.load(isr);
            this.userName = props.getProperty("autoAC.userName").trim();
            this.password = props.getProperty("autoAC.password").trim();
            this.shareCode = Boolean.valueOf(props.getProperty("autoAC.shareCode").trim());
            this.credit = Integer.parseInt(props.getProperty("autoAC.credit").trim().equals("") ? "0" : props.getProperty("autoAC.credit").trim());
            this.viewCode = Boolean.valueOf(props.getProperty("autoAC.viewCode"));
            this.toFile = Boolean.valueOf(props.getProperty("autoAC.toFile"));
            this.enableAC = Boolean.valueOf(props.getProperty("autoAC.enableAC"));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Boolean init(HashMap map) {
      /*  DbUtil dbUtil = new DbUtil();
        String sql = "select problem_id from autoac ";
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
        System.out.println("初始化成功！");*/
        DbUtil dbUtil = new DbUtil();
        String sql = "SELECT problem_id from autoac.autoac where problem_id not in (SELECT problem_id from autoac.acm where acmer='fangli94')";
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

    public int getAcRunId(int problem_id, boolean flagShow) {
        String html = "";
        while (html.indexOf(this.userName) == -1 || html.indexOf(problem_id + "</a></td><td class=\"unac_color\">Judging") != -1) {
            html = HttpUtils.getInstance()
                    .doGet( STATUS_URL)
                    .getContent();
            System.out.println("Judging...");
        }
        int loc_run_id = html.indexOf("</td><td><a href=\"/index.php?m=ProblemSet&a=showProblem&problem_id=" + problem_id);
        String rtn_run_id = html.substring(loc_run_id - 6, loc_run_id);
        boolean answer = html.indexOf(problem_id + "</a></td><td class=\"ac_color\">Accepted") == -1 ? false : true;
        if(answer) {
            if(flagShow) {
                System.out.println("已AC ! => " + problem_id);
            }
            return Integer.parseInt(rtn_run_id);
        }
        return 0;
    }
    public void resolveShare(int problem_id) {
        int run_id = 0;
        if(!shareCode || ((run_id = getAcRunId(problem_id, false)) == 0)) {
            return ;
        }

        String targetUrl = SHARE_CODE_URL + run_id + "&credit=" + this.credit;
        String re = HttpUtils.getInstance()
                    .doGet(targetUrl)
                    .getContent();
        System.out.println("已成功分享! 分值：" + this.credit + " \n开始A掉下一题 !");
    }

    public void beforeEnv(int start, int end) {
        System.out.println("start=> " + start + " end => " + end + "\nstarted!  .....\n\n");
        System.out.println("Author: cbam");
        System.out.println("QQ: 756029571");
        System.out.println("mail: 88cbam@gmail.com");
        System.out.println("github: https://github.com/cbamls");
        System.out.println("blog: http://blog.csdn.net/lsgqjh/article/list/2");
        System.out.println("school: 哈尔滨理工大学");
        System.out.println("major: 软件工程");
        System.out.println(".....初始化!.....");
        try {
            System.out.println("\n              ");
            for(int i = 0; i < 10; i++) {
                Thread.sleep(500);
                System.out.print(".");
            }
            System.out.println("\n\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void toFileD(int problem_id, String code, int run_time, int mem, String author, boolean flag) {
        if(this.toFile) {
            try {
                String assemble = "";
                String preface = "created By: cbam\n      QQ: 756029571\n      blog:  http://blog.csdn.net/lsgqjh/article/list/2\n    github: https://github.com/cbamls\n";
                if(flag) {
                     assemble =preface + "\nproblemId: " + problem_id + "\n\n runTime: " + run_time + " memory: " + mem + " AC By: " + this.userName + "\n\n" + code + "\n\n";
                } else {
                    assemble = "\nproblemId: " + problem_id + "\n\n runTime: " + run_time + " memory: " + mem + " AC By: " + this.userName + "\n\n" + code + "\n\n";

                }
                File file1 = new File("d:/code");
                if(!file1 .exists()) {
                    file1 .mkdir();
                }

                if(flag) {
                   // assemble += "created By: cbam\n QQ: 756029571\n blog:  http://blog.csdn.net/lsgqjh/article/list/2\n github: https://github.com/cbamls\n";
                    if(new File("d:/code/" + problem_id + ".txt").exists()) {
                        new File("d:/code/" + problem_id + ".txt").delete();

                    }
                    FileOutputStream fileOutputStream = new FileOutputStream("d:/code/" + problem_id + ".txt", true);
                    fileOutputStream.write(assemble.getBytes());
                    fileOutputStream.close();
                } else {
                    FileOutputStream fileOutputStream = new FileOutputStream("d:/code/" + problem_id + ".txt", true);
                    fileOutputStream.write(assemble.getBytes());
                    fileOutputStream.close();
                }
                System.out.println("已成功保存在D:/code/" + problem_id + ".txt");

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void runEnd(int accept, int total, List unsolved) {
        if(this.enableAC) {
            System.out.print("运行完成! AC率: ");
            if(total == 0) {
                System.out.println(" 100.00000%");
                return ;
            }
            double acRate = (accept / (total * 1.0)) * 100;
            System.out.printf("%.5f", acRate);
            System.out.println("%\n");
            if(acRate > 99.9) {
                System.out.println("哎呀吗！ AK\n");
            }
            System.out.println("unsolved: \n");
            if(unsolved.size() == 0) {
                System.out.println("全都解决了！");
            }
            for(Object each : unsolved) {
                System.out.print(each.toString() + " ");
            }
        }
        System.out.println("\n谢谢使用！");
    }

    /**
     * 1、打开分享列表，选择题号和分享
     * 2、获取分享列表页面的run_id 组装get Url 打开分享的代码
     * 3、在分享代码的页面 获取problem_id 及 shared code 组装POST提交代码
     * @param args
     */
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("please input the start and end (two numbers in the range of 1000 ~ 2400) !");
            return ;
        }
        int start = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        AutoAc autoAc = new AutoAc();
        autoAc.beforeEnv(start, end);
        if(autoAc.toLogin().equals("error")) {
            return ;
        }
        HashMap map_problem_id = new HashMap();
        if(!autoAc.init(map_problem_id)) {
            return ;
        }
        int accept = 0;
        List unsolved = new ArrayList();
         int total_problem = 0;
        for(int problem_id = start; problem_id <= end; problem_id++) {
            total_problem++;
            int iterator = 0;
            TreeMap<Integer, List > treeMap = autoAc.getShareMap(problem_id, unsolved);
           for(Map.Entry entry : treeMap.entrySet()) {
               List list = treeMap.get(entry.getKey());
               int run_id = Integer.parseInt(list.get(2).toString());
               int run_time = (int) entry.getKey();
               String mem = list.get(0).toString();
               String author = (String) list.get(1);
               String dealedCode = autoAc.getCode(run_id, iterator == 0 ? true : false);
               String date = list.get(3).toString();
               if(iterator++ == 0) {
                  if(enableAC && map_problem_id.containsKey(problem_id)) {
                      autoAc.doChainPost(String.valueOf(problem_id), dealedCode);
                      if(autoAc.getAcRunId(problem_id, true) == 0) {
                          System.out.println("未成功AC ! => " + problem_id);
                          unsolved.add(problem_id);
                          break;
                      }
                      accept++;
                      //autoAc.persistent(problem_id, dealedCode, run_id, run_time, mem, author, date);
                      autoAc.resolveShare(problem_id);
                  }
                   autoAc.toFileD(problem_id, dealedCode, run_time, Integer.parseInt(mem), author, true);
               } else if(iterator <= 2 && iterator < treeMap.size()) {
                   autoAc.toFileD(problem_id, dealedCode, run_time, Integer.parseInt(mem), author, false);
               } else {
                   break;
               }
           }
        }
        autoAc.runEnd(accept, total_problem, unsolved);
    }
}
