package com.idoc.common.utils;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/12/2
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterHtml{
    public static String delHTMLTag(String htmlStr){
        String regEx_script="<script[^>]*?>[\\s\\S]*?<\\/script>"; //定义script的正则表达式
        String regEx_style="<style[^>]*?>[\\s\\S]*?<\\/style>"; //定义style的正则表达式
        String regEx_html="<[^>]+>"; //定义HTML标签的正则表达式

        Pattern p_script=Pattern.compile(regEx_script,Pattern.CASE_INSENSITIVE);
        Matcher m_script=p_script.matcher(htmlStr);
        htmlStr=m_script.replaceAll(""); //过滤script标签

        Pattern p_style=Pattern.compile(regEx_style,Pattern.CASE_INSENSITIVE);
        Matcher m_style=p_style.matcher(htmlStr);
        htmlStr=m_style.replaceAll(""); //过滤style标签

        Pattern p_html=Pattern.compile(regEx_html,Pattern.CASE_INSENSITIVE);
        Matcher m_html=p_html.matcher(htmlStr);
        htmlStr=m_html.replaceAll(""); //过滤html标签

        return htmlStr.trim(); //返回文本字符串
    }

    public static void main(String[] args) {
        String str = "#include&lt;stdio.h&gt;\n" +
                "<span style=\"color: #0000ff\">int</span><span style=\"color: #000000\"> main()\n" +
                "{\n" +
                "    </span><span style=\"color: #0000ff\">int</span> i,ca=<span style=\"color: #800080\">1</span><span style=\"color: #000000\">,t,s,e,n,x,now,before,max;\n" +
                "    scanf(</span><span style=\"color: #800000\">\"</span><span style=\"color: #800000\">%d</span><span style=\"color: #800000\">\"</span>,&amp;<span style=\"color: #000000\">t);\n" +
                "    </span><span style=\"color: #0000ff\">while</span>(t--<span style=\"color: #000000\">)\n" +
                "    {\n" +
                "       scanf(</span><span style=\"color: #800000\">\"</span><span style=\"color: #800000\">%d</span><span style=\"color: #800000\">\"</span>,&amp;<span style=\"color: #000000\">n);\n" +
                "       </span><span style=\"color: #0000ff\">for</span>(i=<span style=\"color: #800080\">1</span>;i&lt;=n;i++<span style=\"color: #000000\">)\n" +
                "       {\n" +
                "         scanf(</span><span style=\"color: #800000\">\"</span><span style=\"color: #800000\">%d</span><span style=\"color: #800000\">\"</span>,&amp;<span style=\"color: #000000\">now);\n" +
                "         </span><span style=\"color: #0000ff\">if</span>(i==<span style=\"color: #800080\">1</span>)<span style=\"color: #008000\">//</span><span style=\"color: #008000\">初始化 </span>\n" +
                "<span style=\"color: #000000\">         {\n" +
                "            max</span>=before=now;<span style=\"color: #008000\">//</span><span style=\"color: #008000\">max保留之前算出来的最大和，before存储目前在读入数据前保留的和，now保留读入数据  </span>\n" +
                "            x=s=e=<span style=\"color: #800080\">1</span>;<span style=\"color: #008000\">//</span><span style=\"color: #008000\">x用来暂时存储before保留的和的起始位置，当before&gt;max时将赋在s位置，s，e保留最大和的start和end位置 </span>\n" +
                "<span style=\"color: #000000\">         }\n" +
                "         </span><span style=\"color: #0000ff\">else</span><span style=\"color: #000000\"> {\n" +
                "             </span><span style=\"color: #0000ff\">if</span>(now&gt;now+before)<span style=\"color: #008000\">//</span><span style=\"color: #008000\">如果之前存储的和加上现在的数据比现在的数据小，就把存储的和换成现在的数据，反之就说明数据在递增，可以直接加上 </span>\n" +
                "<span style=\"color: #000000\">             {\n" +
                "                before</span>=<span style=\"color: #000000\">now;\n" +
                "                x</span>=i;<span style=\"color: #008000\">//</span><span style=\"color: #008000\">预存的位置要重置 </span>\n" +
                "<span style=\"color: #000000\">             }       \n" +
                "             </span><span style=\"color: #0000ff\">else</span> before+=<span style=\"color: #000000\">now;\n" +
                "              }\n" +
                "         </span><span style=\"color: #0000ff\">if</span>(before&gt;max)<span style=\"color: #008000\">//</span><span style=\"color: #008000\">跟之前算出来的最大和进行比较，如果大于，位置和数据就要重置 </span>\n" +
                "           max=before,s=x,e=<span style=\"color: #000000\">i;\n" +
                "       }\n" +
                "       printf(</span><span style=\"color: #800000\">\"</span><span style=\"color: #800000\">Case %d:\\n%d %d %d\\n</span><span style=\"color: #800000\">\"</span>,ca++<span style=\"color: #000000\">,max,s,e);\n" +
                "       </span><span style=\"color: #0000ff\">if</span>(t)printf(<span style=\"color: #800000\">\"</span><span style=\"color: #800000\">\\n</span><span style=\"color: #800000\">\"</span><span style=\"color: #000000\">); \n" +
                "    }\n" +
                "    </span><span style=\"color: #0000ff\">return</span> <span style=\"color: #800080\">0</span><span style=\"color: #000000\">;\n" +
                "}</span>";
        System.out.println( delHTMLTag(str));;
    }
}