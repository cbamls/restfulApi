import org.apache.commons.lang3.StringEscapeUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * CopyRright (c)2014-2016 Haerbin Hearglobal Co.,Ltd
 * Project: idoc-parent
 * Comments:
 * Author:cbam
 * Create Date:2016/11/27
 * Modified By:
 * Modified Date:
 * Modified Reason:
 */
public class Test {
    public void testAc() {
        System.out.println(1/0);
    }
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
     String str = "\n" +
             "<!DOCTYPE html>\n" +
             "<html lang=\"zh-cn\">\n" +
             "<head>\n" +
             "<meta charset=\"utf-8\"/>\n" +
             "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
             "<title>POJ 2777 &amp;&amp; ZOJ 1610 &amp;&amp;HDU 1698 --线段树--区间更新 - radical - 博客园</title>\n" +
             "<link type=\"text/css\" rel=\"stylesheet\" href=\"/bundles/blog-common.css?v=Rdf1BBttS5_qVaET1myrajVTd62BSCCoJA9fZxGv1ZM1\"/>\n" +
             "<link id=\"MainCss\" type=\"text/css\" rel=\"stylesheet\" href=\"/skins/UnlimitedSunlight/bundle-UnlimitedSunlight.css?v=2L2gyfQfiyCwU9MzHfZxHdlKAqdUmCTHT9X4c3k8hhc1\"/>\n" +
             "<link id=\"mobile-style\" media=\"only screen and (max-width: 768px)\" type=\"text/css\" rel=\"stylesheet\" href=\"/skins/UnlimitedSunlight/bundle-UnlimitedSunlight-mobile.css?v=097NdabgidqOluXUmv0tVmQYAOOn6-e7vRQOwwDFAPQ1\"/>\n" +
             "<link title=\"RSS\" type=\"application/rss+xml\" rel=\"alternate\" href=\"http://www.cnblogs.com/radical/rss\"/>\n" +
             "<link title=\"RSD\" type=\"application/rsd+xml\" rel=\"EditURI\" href=\"http://www.cnblogs.com/radical/rsd.xml\"/>\n" +
             "<link type=\"application/wlwmanifest+xml\" rel=\"wlwmanifest\" href=\"http://www.cnblogs.com/radical/wlwmanifest.xml\"/>\n" +
             "<script src=\"//common.cnblogs.com/script/jquery.js\" type=\"text/javascript\"></script>  \n" +
             "<script type=\"text/javascript\">var currentBlogApp = 'radical', cb_enable_mathjax=true;var isLogined=false;</script>\n" +
             "<script src=\"/bundles/blog-common.js?v=hH1lCMV8WaIu271Nx7jPuv36TENW9-RsSxziLxUpjtc1\" type=\"text/javascript\"></script>\n" +
             "</head>\n" +
             "<body>\n" +
             "<a name=\"top\"></a>\n" +
             "\n" +
             "<!--done-->\n" +
             "<div id=\"home\">\n" +
             "<div id=\"header\">\n" +
             "\t<div id=\"blogTitle\">\n" +
             "\t<a id=\"lnkBlogLogo\" href=\"http://www.cnblogs.com/radical/\"><img id=\"blogLogo\" src=\"/Skins/custom/images/logo.gif\" alt=\"返回主页\" /></a>\t\t\t\n" +
             "\t\t\n" +
             "<!--done-->\n" +
             "<h1><a id=\"Header1_HeaderTitle\" class=\"headermaintitle\" href=\"http://www.cnblogs.com/radical/\">radical</a></h1>\n" +
             "<h2></h2>\n" +
             "\n" +
             "\n" +
             "\n" +
             "\t\t\n" +
             "\t</div><!--end: blogTitle 博客的标题和副标题 -->\n" +
             "\t<div id=\"navigator\">\n" +
             "\t\t\n" +
             "<ul id=\"navList\">\n" +
             "<li><a id=\"blog_nav_sitehome\" class=\"menu\" href=\"http://www.cnblogs.com/\">博客园</a></li>\n" +
             "<li><a id=\"blog_nav_myhome\" class=\"menu\" href=\"http://www.cnblogs.com/radical/\">首页</a></li>\n" +
             "<li><a id=\"blog_nav_newpost\" class=\"menu\" rel=\"nofollow\" href=\"https://i.cnblogs.com/EditPosts.aspx?opt=1\">新随笔</a></li>\n" +
             "<li><a id=\"blog_nav_contact\" class=\"menu\" rel=\"nofollow\" href=\"https://msg.cnblogs.com/send/radical\">联系</a></li>\n" +
             "<li><a id=\"blog_nav_rss\" class=\"menu\" href=\"http://www.cnblogs.com/radical/rss\">订阅</a>\n" +
             "<!--<a id=\"blog_nav_rss_image\" class=\"aHeaderXML\" href=\"http://www.cnblogs.com/radical/rss\"><img src=\"//www.cnblogs.com/images/xml.gif\" alt=\"订阅\" /></a>--></li>\n" +
             "<li><a id=\"blog_nav_admin\" class=\"menu\" rel=\"nofollow\" href=\"https://i.cnblogs.com/\">管理</a></li>\n" +
             "</ul>\n" +
             "\t\t<div class=\"blogStats\">\n" +
             "\t\t\t\n" +
             "\t\t\t<div id=\"blog_stats\">\n" +
             "<span id=\"stats_post_count\">随笔 - 246&nbsp; </span>\n" +
             "<span id=\"stats_article_count\">文章 - 0&nbsp; </span>\n" +
             "<span id=\"stats-comment_count\">评论 - 49</span>\n" +
             "</div>\n" +
             "\t\t\t\n" +
             "\t\t</div><!--end: blogStats -->\n" +
             "\t</div><!--end: navigator 博客导航栏 -->\n" +
             "</div><!--end: header 头部 -->\n" +
             "\n" +
             "<div id=\"main\">\n" +
             "\t<div id=\"mainContent\">\n" +
             "\t<div class=\"forFlow\">\n" +
             "\t\t\n" +
             "<div id=\"post_detail\">\n" +
             "<!--done-->\n" +
             "<div id=\"topics\">\n" +
             "\t<div class = \"post\">\n" +
             "\t\t<h1 class = \"postTitle\">\n" +
             "\t\t\t<a id=\"cb_post_title_url\" class=\"postTitle2\" href=\"http://www.cnblogs.com/radical/p/3825075.html\">POJ 2777 &amp;&amp; ZOJ 1610 &amp;&amp;HDU 1698 --线段树--区间更新</a>\n" +
             "\t\t</h1>\n" +
             "\t\t<div class=\"clear\"></div>\n" +
             "\t\t<div class=\"postBody\">\n" +
             "\t\t\t<div id=\"cnblogs_post_body\"><p>直接将这3题 放一起了&nbsp; 今天在做线段树的东西 这3个都是区间更新的 查询方式互相不同 反正都可以放到一起吧</p>\n" +
             "<p>直接先上链接了</p>\n" +
             "<p>　　　　<a href=\"http://poj.org/problem?id=2777\" target=\"_blank\">touch me &nbsp;</a></p>\n" +
             "<p>　　　　<a href=\"http://acm.zju.edu.cn/onlinejudge/showProblem.do?problemCode=1610\" target=\"_blank\">touch me&nbsp;</a></p>\n" +
             "<p>　　　　<a href=\"http://acm.hdu.edu.cn/showproblem.php?pid=1698\" target=\"_blank\">touch me&nbsp;</a></p>\n" +
             "<p>关于涉及到区间的修改 -- 区间更新的话 分为 增减 或者 修改</p>\n" +
             "<p> 主要就是个 laze 标记 就是延迟更新</p>\n" +
             "<p>对于区间更新的写法 一般是有2种 其一 仔细划分到每个细小的区间 &nbsp;&nbsp; 另一 粗略划分</p>\n" +
             "<p>反正 ==我的代码里会给出2种写法 看自己喜好</p>\n" +
             "<p>&nbsp;</p>\n" +
             "<p>hdu</p>\n" +
             "<div class=\"cnblogs_code\" onclick=\"cnblogs_code_show('bac67293-da06-4b67-ab4a-26adacf0b697')\"><img id=\"code_img_closed_bac67293-da06-4b67-ab4a-26adacf0b697\" class=\"code_img_closed\" src=\"http://images.cnblogs.com/OutliningIndicators/ContractedBlock.gif\" alt=\"\" /><img id=\"code_img_opened_bac67293-da06-4b67-ab4a-26adacf0b697\" class=\"code_img_opened\" style=\"display: none;\" onclick=\"cnblogs_code_hide('bac67293-da06-4b67-ab4a-26adacf0b697',event)\" src=\"http://images.cnblogs.com/OutliningIndicators/ExpandedBlockStart.gif\" alt=\"\" />\n" +
             "<div id=\"cnblogs_code_open_bac67293-da06-4b67-ab4a-26adacf0b697\" class=\"cnblogs_code_hide\">\n" +
             "<pre><span style=\"color: #008080;\"> 1</span> <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\">线段树 成段更新 ---&gt; 替换    根结点的查询</span>\n" +
             "<span style=\"color: #008080;\"> 2</span> \n" +
             "<span style=\"color: #008080;\"> 3</span> #include &lt;iostream&gt;\n" +
             "<span style=\"color: #008080;\"> 4</span> <span style=\"color: #0000ff;\">using</span> <span style=\"color: #0000ff;\">namespace</span><span style=\"color: #000000;\"> std;\n" +
             "</span><span style=\"color: #008080;\"> 5</span> \n" +
             "<span style=\"color: #008080;\"> 6</span> <span style=\"color: #0000ff;\">const</span> <span style=\"color: #0000ff;\">int</span> size = <span style=\"color: #800080;\">100010</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 7</span> \n" +
             "<span style=\"color: #008080;\"> 8</span> <span style=\"color: #0000ff;\">struct</span><span style=\"color: #000000;\"> data\n" +
             "</span><span style=\"color: #008080;\"> 9</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">10</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> l;\n" +
             "</span><span style=\"color: #008080;\">11</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> r;\n" +
             "</span><span style=\"color: #008080;\">12</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> flag;\n" +
             "</span><span style=\"color: #008080;\">13</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> sum;\n" +
             "</span><span style=\"color: #008080;\">14</span> }tree[ size*<span style=\"color: #800080;\">3</span><span style=\"color: #000000;\"> ];\n" +
             "</span><span style=\"color: #008080;\">15</span> \n" +
             "<span style=\"color: #008080;\">16</span> <span style=\"color: #0000ff;\">void</span> create( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> l , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> r )\n" +
             "</span><span style=\"color: #008080;\">17</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">18</span>     <span style=\"color: #0000ff;\">int</span> mid = l + (r-l)/<span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">19</span>     tree[root].l =<span style=\"color: #000000;\"> l;\n" +
             "</span><span style=\"color: #008080;\">20</span>     tree[root].r =<span style=\"color: #000000;\"> r;\n" +
             "</span><span style=\"color: #008080;\">21</span>     tree[root].flag = <span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">22</span>     <span style=\"color: #0000ff;\">if</span>( l==<span style=\"color: #000000;\">r )\n" +
             "</span><span style=\"color: #008080;\">23</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">24</span>         tree[root].sum = <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">25</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">26</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">27</span>     create( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , l , mid );\n" +
             "</span><span style=\"color: #008080;\">28</span>     create( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span> , mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , r );\n" +
             "</span><span style=\"color: #008080;\">29</span>     tree[root].sum = tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].sum + tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">].sum;\n" +
             "</span><span style=\"color: #008080;\">30</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\">31</span> \n" +
             "<span style=\"color: #008080;\">32</span> <span style=\"color: #0000ff;\">void</span> add( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> len  )\n" +
             "</span><span style=\"color: #008080;\">33</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">34</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].flag = tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span>].flag =<span style=\"color: #000000;\"> tree[root].flag ;\n" +
             "</span><span style=\"color: #008080;\">35</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].sum = ( len - len/<span style=\"color: #800080;\">2</span> ) *<span style=\"color: #000000;\"> tree[root].flag ;\n" +
             "</span><span style=\"color: #008080;\">36</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span>].sum = len/<span style=\"color: #800080;\">2</span>*<span style=\"color: #000000;\">tree[root].flag;\n" +
             "</span><span style=\"color: #008080;\">37</span>     tree[root].flag = <span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">38</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\">39</span> \n" +
             "<span style=\"color: #008080;\">40</span> <span style=\"color: #0000ff;\">void</span> update( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> L , <span style=\"color: #0000ff;\">int</span> R , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> num )\n" +
             "</span><span style=\"color: #008080;\">41</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">42</span>     <span style=\"color: #0000ff;\">int</span> mid = tree[root].l + ( tree[root].r - tree[root].l ) / <span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">43</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].l == L &amp;&amp; tree[root].r==<span style=\"color: #000000;\">R )\n" +
             "</span><span style=\"color: #008080;\">44</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">45</span>         tree[root].flag=<span style=\"color: #000000;\"> num;\n" +
             "</span><span style=\"color: #008080;\">46</span>         tree[root].sum = num * ( tree[root].r - tree[root].l + <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> );\n" +
             "</span><span style=\"color: #008080;\">47</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">48</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">49</span>     <span style=\"color: #0000ff;\">if</span><span style=\"color: #000000;\">( tree[root].flag )\n" +
             "</span><span style=\"color: #008080;\">50</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">51</span>         add( root , tree[root].r-tree[root].l+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> );\n" +
             "</span><span style=\"color: #008080;\">52</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">53</span>     <span style=\"color: #0000ff;\">if</span>( R&lt;=mid ) <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\"> 左子树 </span>\n" +
             "<span style=\"color: #008080;\">54</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">55</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\">56</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">57</span>     <span style=\"color: #0000ff;\">else</span> <span style=\"color: #0000ff;\">if</span>( L&gt;=mid+<span style=\"color: #800080;\">1</span> ) <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\"> 右子树 </span>\n" +
             "<span style=\"color: #008080;\">58</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">59</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\">60</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">61</span>     <span style=\"color: #0000ff;\">else</span> <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\"> 覆盖左右 子树 </span>\n" +
             "<span style=\"color: #008080;\">62</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">63</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , mid , num );\n" +
             "</span><span style=\"color: #008080;\">64</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span> , mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , R , num );\n" +
             "</span><span style=\"color: #008080;\">65</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">66</span>     tree[root].sum = tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].sum + tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">].sum; \n" +
             "</span><span style=\"color: #008080;\">67</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\">68</span> \n" +
             "<span style=\"color: #008080;\">69</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> main()\n" +
             "</span><span style=\"color: #008080;\">70</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">71</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> t , n , oper;\n" +
             "</span><span style=\"color: #008080;\">72</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> L , R , num;\n" +
             "</span><span style=\"color: #008080;\">73</span>     <span style=\"color: #0000ff;\">while</span>( ~scanf(<span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d</span><span style=\"color: #800000;\">\"</span>,&amp;<span style=\"color: #000000;\">t) )\n" +
             "</span><span style=\"color: #008080;\">74</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">75</span>         <span style=\"color: #0000ff;\">for</span>( <span style=\"color: #0000ff;\">int</span> i = <span style=\"color: #800080;\">1</span> ; i&lt;=t ; i++<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">76</span> <span style=\"color: #000000;\">        {\n" +
             "</span><span style=\"color: #008080;\">77</span>             scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d</span><span style=\"color: #800000;\">\"</span>,&amp;<span style=\"color: #000000;\">n );\n" +
             "</span><span style=\"color: #008080;\">78</span>             scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d</span><span style=\"color: #800000;\">\"</span>,&amp;<span style=\"color: #000000;\">oper );\n" +
             "</span><span style=\"color: #008080;\">79</span>             create( <span style=\"color: #800080;\">1</span> , <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , n );\n" +
             "</span><span style=\"color: #008080;\">80</span>             <span style=\"color: #0000ff;\">while</span>( oper--<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">81</span> <span style=\"color: #000000;\">            {\n" +
             "</span><span style=\"color: #008080;\">82</span>                 scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d %d %d</span><span style=\"color: #800000;\">\"</span>,&amp;L,&amp;R,&amp;<span style=\"color: #000000;\">num );\n" +
             "</span><span style=\"color: #008080;\">83</span>                 update( <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\">84</span> <span style=\"color: #000000;\">            }\n" +
             "</span><span style=\"color: #008080;\">85</span>             printf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">Case %d: The total value of the hook is %d.\\n</span><span style=\"color: #800000;\">\"</span>,i,tree[<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">].sum );\n" +
             "</span><span style=\"color: #008080;\">86</span> <span style=\"color: #000000;\">        }\n" +
             "</span><span style=\"color: #008080;\">87</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">88</span>     <span style=\"color: #0000ff;\">return</span> <span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">89</span> }</pre>\n" +
             "</div>\n" +
             "<span class=\"cnblogs_code_collapse\">View Code</span></div>\n" +
             "<p>&nbsp;</p>\n" +
             "<p>POJ</p>\n" +
             "<div class=\"cnblogs_code\" onclick=\"cnblogs_code_show('34a2c44f-c661-4e03-a156-b7414771b7c6')\"><img id=\"code_img_closed_34a2c44f-c661-4e03-a156-b7414771b7c6\" class=\"code_img_closed\" src=\"http://images.cnblogs.com/OutliningIndicators/ContractedBlock.gif\" alt=\"\" /><img id=\"code_img_opened_34a2c44f-c661-4e03-a156-b7414771b7c6\" class=\"code_img_opened\" style=\"display: none;\" onclick=\"cnblogs_code_hide('34a2c44f-c661-4e03-a156-b7414771b7c6',event)\" src=\"http://images.cnblogs.com/OutliningIndicators/ExpandedBlockStart.gif\" alt=\"\" />\n" +
             "<div id=\"cnblogs_code_open_34a2c44f-c661-4e03-a156-b7414771b7c6\" class=\"cnblogs_code_hide\">\n" +
             "<pre><span style=\"color: #008080;\">  1</span> <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\">线段树--区间更新--替换 区间查询---B</span>\n" +
             "<span style=\"color: #008080;\">  2</span> #include &lt;iostream&gt;\n" +
             "<span style=\"color: #008080;\">  3</span> #include &lt;algorithm&gt; \n" +
             "<span style=\"color: #008080;\">  4</span> <span style=\"color: #0000ff;\">using</span> <span style=\"color: #0000ff;\">namespace</span><span style=\"color: #000000;\"> std;\n" +
             "</span><span style=\"color: #008080;\">  5</span> \n" +
             "<span style=\"color: #008080;\">  6</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> sum;\n" +
             "</span><span style=\"color: #008080;\">  7</span> <span style=\"color: #0000ff;\">const</span> <span style=\"color: #0000ff;\">int</span> size = <span style=\"color: #800080;\">100010</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">  8</span> <span style=\"color: #0000ff;\">struct</span><span style=\"color: #000000;\"> data\n" +
             "</span><span style=\"color: #008080;\">  9</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 10</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> l;\n" +
             "</span><span style=\"color: #008080;\"> 11</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> r;\n" +
             "</span><span style=\"color: #008080;\"> 12</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> color;\n" +
             "</span><span style=\"color: #008080;\"> 13</span>     <span style=\"color: #0000ff;\">bool</span><span style=\"color: #000000;\"> flag;\n" +
             "</span><span style=\"color: #008080;\"> 14</span> }tree[size*<span style=\"color: #800080;\">3</span><span style=\"color: #000000;\">];\n" +
             "</span><span style=\"color: #008080;\"> 15</span> \n" +
             "<span style=\"color: #008080;\"> 16</span> <span style=\"color: #0000ff;\">void</span> create( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> l , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> r )\n" +
             "</span><span style=\"color: #008080;\"> 17</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 18</span>     <span style=\"color: #0000ff;\">int</span> mid = ( l + r ) / <span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 19</span>     tree[root].l =<span style=\"color: #000000;\"> l;\n" +
             "</span><span style=\"color: #008080;\"> 20</span>     tree[root].r =<span style=\"color: #000000;\"> r;\n" +
             "</span><span style=\"color: #008080;\"> 21</span>     tree[root].color = <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 22</span>     tree[root].flag = <span style=\"color: #0000ff;\">false</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 23</span>     <span style=\"color: #0000ff;\">if</span>( l==<span style=\"color: #000000;\">r )\n" +
             "</span><span style=\"color: #008080;\"> 24</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 25</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 26</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 27</span>     create( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , l , mid );\n" +
             "</span><span style=\"color: #008080;\"> 28</span>     create( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span> , mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , r );\n" +
             "</span><span style=\"color: #008080;\"> 29</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 30</span> \n" +
             "<span style=\"color: #008080;\"> 31</span> <span style=\"color: #0000ff;\">void</span> add( <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> root )\n" +
             "</span><span style=\"color: #008080;\"> 32</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 33</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].flag = <span style=\"color: #0000ff;\">true</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 34</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span>].flag = <span style=\"color: #0000ff;\">true</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 35</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].color =<span style=\"color: #000000;\"> tree[root].color;\n" +
             "</span><span style=\"color: #008080;\"> 36</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span>].color =<span style=\"color: #000000;\"> tree[root].color; \n" +
             "</span><span style=\"color: #008080;\"> 37</span>     tree[root].flag = <span style=\"color: #0000ff;\">false</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 38</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 39</span> \n" +
             "<span style=\"color: #008080;\"> 40</span> <span style=\"color: #0000ff;\">void</span> update( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> L , <span style=\"color: #0000ff;\">int</span> R , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> num )\n" +
             "</span><span style=\"color: #008080;\"> 41</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 42</span>     <span style=\"color: #0000ff;\">int</span> mid = ( tree[root].l + tree[root].r ) / <span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 43</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].l == L &amp;&amp; tree[root].r ==<span style=\"color: #000000;\">R )\n" +
             "</span><span style=\"color: #008080;\"> 44</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 45</span>         tree[root].flag = <span style=\"color: #0000ff;\">true</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 46</span>         tree[root].color =<span style=\"color: #000000;\"> num;\n" +
             "</span><span style=\"color: #008080;\"> 47</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 48</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 49</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].color ==<span style=\"color: #000000;\"> num )\n" +
             "</span><span style=\"color: #008080;\"> 50</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 51</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 52</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 53</span>     <span style=\"color: #0000ff;\">if</span><span style=\"color: #000000;\">( tree[root].flag )\n" +
             "</span><span style=\"color: #008080;\"> 54</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 55</span> <span style=\"color: #000000;\">        add( root );\n" +
             "</span><span style=\"color: #008080;\"> 56</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 57</span>     <span style=\"color: #0000ff;\">if</span>( L&gt;=mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\"> 58</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 59</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 60</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 61</span>     <span style=\"color: #0000ff;\">else</span> <span style=\"color: #0000ff;\">if</span>( R&lt;=<span style=\"color: #000000;\">mid )\n" +
             "</span><span style=\"color: #008080;\"> 62</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 63</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 64</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 65</span>     <span style=\"color: #0000ff;\">else</span>\n" +
             "<span style=\"color: #008080;\"> 66</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 67</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , mid , num );\n" +
             "</span><span style=\"color: #008080;\"> 68</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span> , mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 69</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 70</span>     tree[root].color = tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].color | tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">].color;\n" +
             "</span><span style=\"color: #008080;\"> 71</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 72</span> \n" +
             "<span style=\"color: #008080;\"> 73</span> <span style=\"color: #0000ff;\">void</span> query( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> L , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> R )\n" +
             "</span><span style=\"color: #008080;\"> 74</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 75</span>     <span style=\"color: #0000ff;\">int</span> mid = ( tree[root].l + tree[root].r ) / <span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 76</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].l ==L &amp;&amp; tree[root].r ==<span style=\"color: #000000;\">R )\n" +
             "</span><span style=\"color: #008080;\"> 77</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 78</span>         sum |=<span style=\"color: #000000;\"> tree[root].color;\n" +
             "</span><span style=\"color: #008080;\"> 79</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 80</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 81</span>     <span style=\"color: #0000ff;\">if</span><span style=\"color: #000000;\">( tree[root].flag )\n" +
             "</span><span style=\"color: #008080;\"> 82</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 83</span> <span style=\"color: #000000;\">        add( root );\n" +
             "</span><span style=\"color: #008080;\"> 84</span> <span style=\"color: #000000;\">    }    \n" +
             "</span><span style=\"color: #008080;\"> 85</span>     <span style=\"color: #0000ff;\">if</span>( L&gt;=mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\"> 86</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 87</span>         query( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R );\n" +
             "</span><span style=\"color: #008080;\"> 88</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 89</span>     <span style=\"color: #0000ff;\">else</span> <span style=\"color: #0000ff;\">if</span>( R&lt;=<span style=\"color: #000000;\">mid )\n" +
             "</span><span style=\"color: #008080;\"> 90</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 91</span>         query( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R );\n" +
             "</span><span style=\"color: #008080;\"> 92</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 93</span>     <span style=\"color: #0000ff;\">else</span>\n" +
             "<span style=\"color: #008080;\"> 94</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 95</span>         query( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , mid );\n" +
             "</span><span style=\"color: #008080;\"> 96</span>         query( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span> , mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , R );\n" +
             "</span><span style=\"color: #008080;\"> 97</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 98</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 99</span> \n" +
             "<span style=\"color: #008080;\">100</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> main()\n" +
             "</span><span style=\"color: #008080;\">101</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">102</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> cnt;\n" +
             "</span><span style=\"color: #008080;\">103</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> n , m , oper;\n" +
             "</span><span style=\"color: #008080;\">104</span>     <span style=\"color: #0000ff;\">char</span><span style=\"color: #000000;\"> ch;\n" +
             "</span><span style=\"color: #008080;\">105</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> L , R , num;\n" +
             "</span><span style=\"color: #008080;\">106</span>     <span style=\"color: #0000ff;\">while</span>( ~scanf(<span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d %d</span><span style=\"color: #800000;\">\"</span>,&amp;n,&amp;<span style=\"color: #000000;\">m) )\n" +
             "</span><span style=\"color: #008080;\">107</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">108</span>         create( <span style=\"color: #800080;\">1</span> , <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , n );    \n" +
             "</span><span style=\"color: #008080;\">109</span>         scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d</span><span style=\"color: #800000;\">\"</span>,&amp;<span style=\"color: #000000;\">oper );\n" +
             "</span><span style=\"color: #008080;\">110</span>         <span style=\"color: #0000ff;\">while</span>( oper--<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">111</span> <span style=\"color: #000000;\">        {\n" +
             "</span><span style=\"color: #008080;\">112</span> <span style=\"color: #000000;\">            getchar();\n" +
             "</span><span style=\"color: #008080;\">113</span>             scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%c</span><span style=\"color: #800000;\">\"</span>,&amp;<span style=\"color: #000000;\">ch );\n" +
             "</span><span style=\"color: #008080;\">114</span>             <span style=\"color: #0000ff;\">if</span>( ch==<span style=\"color: #800000;\">'</span><span style=\"color: #800000;\">C</span><span style=\"color: #800000;\">'</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">115</span> <span style=\"color: #000000;\">            {\n" +
             "</span><span style=\"color: #008080;\">116</span>                 scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d %d %d</span><span style=\"color: #800000;\">\"</span>,&amp;L,&amp;R,&amp;<span style=\"color: #000000;\">num );\n" +
             "</span><span style=\"color: #008080;\">117</span>                 <span style=\"color: #0000ff;\">if</span>( L&gt;<span style=\"color: #000000;\">R )\n" +
             "</span><span style=\"color: #008080;\">118</span> <span style=\"color: #000000;\">                {\n" +
             "</span><span style=\"color: #008080;\">119</span> <span style=\"color: #000000;\">                    swap( L ,R );\n" +
             "</span><span style=\"color: #008080;\">120</span> <span style=\"color: #000000;\">                }\n" +
             "</span><span style=\"color: #008080;\">121</span>                 update( <span style=\"color: #800080;\">1</span> , L , R , <span style=\"color: #800080;\">1</span>&lt;&lt;(num-<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">) );\n" +
             "</span><span style=\"color: #008080;\">122</span> <span style=\"color: #000000;\">            }        \n" +
             "</span><span style=\"color: #008080;\">123</span>             <span style=\"color: #0000ff;\">else</span>\n" +
             "<span style=\"color: #008080;\">124</span> <span style=\"color: #000000;\">            {\n" +
             "</span><span style=\"color: #008080;\">125</span>                 scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d %d</span><span style=\"color: #800000;\">\"</span>,&amp;L,&amp;<span style=\"color: #000000;\">R );\n" +
             "</span><span style=\"color: #008080;\">126</span>                 <span style=\"color: #0000ff;\">if</span>( L&gt;<span style=\"color: #000000;\">R )\n" +
             "</span><span style=\"color: #008080;\">127</span> <span style=\"color: #000000;\">                {\n" +
             "</span><span style=\"color: #008080;\">128</span> <span style=\"color: #000000;\">                    swap( L , R );\n" +
             "</span><span style=\"color: #008080;\">129</span> <span style=\"color: #000000;\">                }\n" +
             "</span><span style=\"color: #008080;\">130</span>                 cnt = sum = <span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">131</span>                 query( <span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R );\n" +
             "</span><span style=\"color: #008080;\">132</span>                 <span style=\"color: #0000ff;\">while</span><span style=\"color: #000000;\">( sum )\n" +
             "</span><span style=\"color: #008080;\">133</span> <span style=\"color: #000000;\">                {\n" +
             "</span><span style=\"color: #008080;\">134</span>                     <span style=\"color: #0000ff;\">if</span>( sum&amp;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">135</span> <span style=\"color: #000000;\">                    {\n" +
             "</span><span style=\"color: #008080;\">136</span>                         cnt++<span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">137</span> <span style=\"color: #000000;\">                    }\n" +
             "</span><span style=\"color: #008080;\">138</span>                     sum&gt;&gt;=<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">139</span> <span style=\"color: #000000;\">                }\n" +
             "</span><span style=\"color: #008080;\">140</span>                 printf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d\\n</span><span style=\"color: #800000;\">\"</span><span style=\"color: #000000;\">,cnt );\n" +
             "</span><span style=\"color: #008080;\">141</span> <span style=\"color: #000000;\">            }\n" +
             "</span><span style=\"color: #008080;\">142</span> <span style=\"color: #000000;\">        }    \n" +
             "</span><span style=\"color: #008080;\">143</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">144</span>     <span style=\"color: #0000ff;\">return</span> <span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">145</span> }</pre>\n" +
             "</div>\n" +
             "<span class=\"cnblogs_code_collapse\">View Code</span></div>\n" +
             "<p>&nbsp;</p>\n" +
             "<p>ZOJ</p>\n" +
             "<div class=\"cnblogs_code\" onclick=\"cnblogs_code_show('1693e7fc-64be-4257-9ffc-8776f98ea8e9')\"><img id=\"code_img_closed_1693e7fc-64be-4257-9ffc-8776f98ea8e9\" class=\"code_img_closed\" src=\"http://images.cnblogs.com/OutliningIndicators/ContractedBlock.gif\" alt=\"\" /><img id=\"code_img_opened_1693e7fc-64be-4257-9ffc-8776f98ea8e9\" class=\"code_img_opened\" style=\"display: none;\" onclick=\"cnblogs_code_hide('1693e7fc-64be-4257-9ffc-8776f98ea8e9',event)\" src=\"http://images.cnblogs.com/OutliningIndicators/ExpandedBlockStart.gif\" alt=\"\" />\n" +
             "<div id=\"cnblogs_code_open_1693e7fc-64be-4257-9ffc-8776f98ea8e9\" class=\"cnblogs_code_hide\">\n" +
             "<pre><span style=\"color: #008080;\">  1</span> <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\">线段树 --区间更新-替换  -- A</span>\n" +
             "<span style=\"color: #008080;\">  2</span> #include &lt;iostream&gt;\n" +
             "<span style=\"color: #008080;\">  3</span> #include &lt;cstring&gt;\n" +
             "<span style=\"color: #008080;\">  4</span> #include &lt;cstdio&gt;\n" +
             "<span style=\"color: #008080;\">  5</span> <span style=\"color: #0000ff;\">using</span> <span style=\"color: #0000ff;\">namespace</span><span style=\"color: #000000;\"> std;\n" +
             "</span><span style=\"color: #008080;\">  6</span> \n" +
             "<span style=\"color: #008080;\">  7</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> n;\n" +
             "</span><span style=\"color: #008080;\">  8</span> <span style=\"color: #0000ff;\">const</span> <span style=\"color: #0000ff;\">int</span> size = <span style=\"color: #800080;\">8080</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">  9</span> <span style=\"color: #0000ff;\">struct</span><span style=\"color: #000000;\"> data\n" +
             "</span><span style=\"color: #008080;\"> 10</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 11</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> l;\n" +
             "</span><span style=\"color: #008080;\"> 12</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> r;\n" +
             "</span><span style=\"color: #008080;\"> 13</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> flag;\n" +
             "</span><span style=\"color: #008080;\"> 14</span> }tree[size*<span style=\"color: #800080;\">3</span><span style=\"color: #000000;\">];\n" +
             "</span><span style=\"color: #008080;\"> 15</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> color[size];\n" +
             "</span><span style=\"color: #008080;\"> 16</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> avoid;\n" +
             "</span><span style=\"color: #008080;\"> 17</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> cnt[size];\n" +
             "</span><span style=\"color: #008080;\"> 18</span> \n" +
             "<span style=\"color: #008080;\"> 19</span> <span style=\"color: #0000ff;\">void</span> create( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> l , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> r )\n" +
             "</span><span style=\"color: #008080;\"> 20</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 21</span>     <span style=\"color: #0000ff;\">int</span> mid = ( l + r ) / <span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 22</span>     tree[root].l =<span style=\"color: #000000;\"> l;\n" +
             "</span><span style=\"color: #008080;\"> 23</span>     tree[root].r =<span style=\"color: #000000;\"> r;\n" +
             "</span><span style=\"color: #008080;\"> 24</span>     tree[root].flag = -<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 25</span>     <span style=\"color: #0000ff;\">if</span>( l==<span style=\"color: #000000;\">r )\n" +
             "</span><span style=\"color: #008080;\"> 26</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 27</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 28</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 29</span>     create( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , l , mid );\n" +
             "</span><span style=\"color: #008080;\"> 30</span>     create( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span> , mid+<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , r );\n" +
             "</span><span style=\"color: #008080;\"> 31</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 32</span> \n" +
             "<span style=\"color: #008080;\"> 33</span> <span style=\"color: #0000ff;\">void</span> add( <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> root )\n" +
             "</span><span style=\"color: #008080;\"> 34</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 35</span>     tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].flag = tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span>].flag =<span style=\"color: #000000;\"> tree[root].flag; \n" +
             "</span><span style=\"color: #008080;\"> 36</span>     tree[root].flag = -<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 37</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 38</span> \n" +
             "<span style=\"color: #008080;\"> 39</span> <span style=\"color: #0000ff;\">void</span> update( <span style=\"color: #0000ff;\">int</span> root , <span style=\"color: #0000ff;\">int</span> L , <span style=\"color: #0000ff;\">int</span> R , <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> num )\n" +
             "</span><span style=\"color: #008080;\"> 40</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 41</span>     <span style=\"color: #0000ff;\">int</span> mid = ( tree[root].l + tree[root].r )/<span style=\"color: #800080;\">2</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 42</span>      <span style=\"color: #0000ff;\">if</span>( tree[root].flag ==<span style=\"color: #000000;\"> num )\n" +
             "</span><span style=\"color: #008080;\"> 43</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 44</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].l&gt;=L &amp;&amp; tree[root].r&lt;=<span style=\"color: #000000;\">R )\n" +
             "</span><span style=\"color: #008080;\"> 45</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 46</span>         tree[root].flag =<span style=\"color: #000000;\"> num;    \n" +
             "</span><span style=\"color: #008080;\"> 47</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 48</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 49</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].flag!=-<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\"> 50</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 51</span> <span style=\"color: #000000;\">        add( root );\n" +
             "</span><span style=\"color: #008080;\"> 52</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 53</span>     <span style=\"color: #008000;\">/*</span>\n" +
             "<span style=\"color: #008080;\"> 54</span> <span style=\"color: #008000;\">    if( R&lt;=mid )\n" +
             "</span><span style=\"color: #008080;\"> 55</span> <span style=\"color: #008000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 56</span> <span style=\"color: #008000;\">        update( root&lt;&lt;1 , L , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 57</span> <span style=\"color: #008000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 58</span> <span style=\"color: #008000;\">    else if( L&gt;=mid+1 )\n" +
             "</span><span style=\"color: #008080;\"> 59</span> <span style=\"color: #008000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 60</span> <span style=\"color: #008000;\">        update( root&lt;&lt;1|1 , L , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 61</span> <span style=\"color: #008000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 62</span> <span style=\"color: #008000;\">    else\n" +
             "</span><span style=\"color: #008080;\"> 63</span> <span style=\"color: #008000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 64</span> <span style=\"color: #008000;\">        update( root&lt;&lt;1 , L , mid , num );\n" +
             "</span><span style=\"color: #008080;\"> 65</span> <span style=\"color: #008000;\">        update( root&lt;&lt;1|1 , mid+1 , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 66</span> <span style=\"color: #008000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 67</span>     <span style=\"color: #008000;\">*/</span>\n" +
             "<span style=\"color: #008080;\"> 68</span>     <span style=\"color: #0000ff;\">if</span>( L&lt;=<span style=\"color: #000000;\">mid )\n" +
             "</span><span style=\"color: #008080;\"> 69</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 70</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 71</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 72</span>     <span style=\"color: #0000ff;\">if</span>( R&gt;<span style=\"color: #000000;\">mid )\n" +
             "</span><span style=\"color: #008080;\"> 73</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 74</span>         update( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , L , R , num );\n" +
             "</span><span style=\"color: #008080;\"> 75</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 76</span>     <span style=\"color: #0000ff;\">if</span>( tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].flag == tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span>].flag &amp;&amp; tree[root&lt;&lt;<span style=\"color: #800080;\">1</span>].flag!=-<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\"> 77</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 78</span>         tree[root].flag = tree[root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">].flag;\n" +
             "</span><span style=\"color: #008080;\"> 79</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 80</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 81</span> \n" +
             "<span style=\"color: #008080;\"> 82</span> <span style=\"color: #0000ff;\">void</span> solve( <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> root )\n" +
             "</span><span style=\"color: #008080;\"> 83</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\"> 84</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].flag!=-<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\"> 85</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\"> 86</span>         <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\">cout&lt;&lt;\"root\"&lt;&lt;root&lt;&lt;endl;</span>\n" +
             "<span style=\"color: #008080;\"> 87</span>         <span style=\"color: #0000ff;\">for</span>( <span style=\"color: #0000ff;\">int</span> i = tree[root].l ; i&lt;=tree[root].r ; i++<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\"> 88</span> <span style=\"color: #000000;\">        {\n" +
             "</span><span style=\"color: #008080;\"> 89</span>             color[i] =<span style=\"color: #000000;\"> tree[root].flag;\n" +
             "</span><span style=\"color: #008080;\"> 90</span>             <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\">cout&lt;&lt;\"color:\"&lt;&lt;color[i]&lt;&lt;endl;</span>\n" +
             "<span style=\"color: #008080;\"> 91</span> <span style=\"color: #000000;\">        }\n" +
             "</span><span style=\"color: #008080;\"> 92</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 93</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\"> 94</span>     <span style=\"color: #0000ff;\">if</span>( tree[root].l ==<span style=\"color: #000000;\"> tree[root].r )\n" +
             "</span><span style=\"color: #008080;\"> 95</span>         <span style=\"color: #0000ff;\">return</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\"> 96</span>     solve( root&lt;&lt;<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> );\n" +
             "</span><span style=\"color: #008080;\"> 97</span>     solve( root&lt;&lt;<span style=\"color: #800080;\">1</span>|<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> );\n" +
             "</span><span style=\"color: #008080;\"> 98</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\"> 99</span> \n" +
             "<span style=\"color: #008080;\">100</span> <span style=\"color: #0000ff;\">void</span><span style=\"color: #000000;\"> getAns()\n" +
             "</span><span style=\"color: #008080;\">101</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">102</span>     <span style=\"color: #0000ff;\">int</span> former = -<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">103</span>     <span style=\"color: #0000ff;\">for</span>( <span style=\"color: #0000ff;\">int</span> i = <span style=\"color: #800080;\">0</span> ; i&lt;size ; i++<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">104</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">105</span>         <span style=\"color: #0000ff;\">if</span>( former !=<span style=\"color: #000000;\"> color[i] )\n" +
             "</span><span style=\"color: #008080;\">106</span> <span style=\"color: #000000;\">        {\n" +
             "</span><span style=\"color: #008080;\">107</span>             former =<span style=\"color: #000000;\"> color[i];\n" +
             "</span><span style=\"color: #008080;\">108</span>             cnt[former]++<span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">109</span>             <span style=\"color: #008000;\">//</span><span style=\"color: #008000;\">cout&lt;&lt;\"数量\"&lt;&lt;cnt[former]&lt;&lt;\"   former:\"&lt;&lt;former&lt;&lt;endl;</span>\n" +
             "<span style=\"color: #008080;\">110</span> <span style=\"color: #000000;\">        }\n" +
             "</span><span style=\"color: #008080;\">111</span> <span style=\"color: #000000;\">    } \n" +
             "</span><span style=\"color: #008080;\">112</span>     <span style=\"color: #0000ff;\">for</span>( <span style=\"color: #0000ff;\">int</span> i = <span style=\"color: #800080;\">0</span> ; i&lt;size ; i++<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">113</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">114</span>         <span style=\"color: #0000ff;\">if</span>( cnt[i]!=<span style=\"color: #800080;\">0</span><span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">115</span> <span style=\"color: #000000;\">        {\n" +
             "</span><span style=\"color: #008080;\">116</span>             printf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d %d\\n</span><span style=\"color: #800000;\">\"</span><span style=\"color: #000000;\">,i,cnt[i] );\n" +
             "</span><span style=\"color: #008080;\">117</span> <span style=\"color: #000000;\">        }\n" +
             "</span><span style=\"color: #008080;\">118</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">119</span>     printf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">\\n</span><span style=\"color: #800000;\">\"</span><span style=\"color: #000000;\"> );\n" +
             "</span><span style=\"color: #008080;\">120</span> <span style=\"color: #000000;\">}\n" +
             "</span><span style=\"color: #008080;\">121</span> \n" +
             "<span style=\"color: #008080;\">122</span> <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> main()\n" +
             "</span><span style=\"color: #008080;\">123</span> <span style=\"color: #000000;\">{\n" +
             "</span><span style=\"color: #008080;\">124</span>     <span style=\"color: #0000ff;\">int</span><span style=\"color: #000000;\"> L , R , num;\n" +
             "</span><span style=\"color: #008080;\">125</span>     <span style=\"color: #0000ff;\">while</span>( ~scanf(<span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d</span><span style=\"color: #800000;\">\"</span>,&amp;<span style=\"color: #000000;\">n) )\n" +
             "</span><span style=\"color: #008080;\">126</span> <span style=\"color: #000000;\">    {\n" +
             "</span><span style=\"color: #008080;\">127</span>         memset( color , -<span style=\"color: #800080;\">1</span> , <span style=\"color: #0000ff;\">sizeof</span><span style=\"color: #000000;\">(color) );\n" +
             "</span><span style=\"color: #008080;\">128</span>         memset( cnt , <span style=\"color: #800080;\">0</span> , <span style=\"color: #0000ff;\">sizeof</span><span style=\"color: #000000;\">(cnt) );\n" +
             "</span><span style=\"color: #008080;\">129</span>         create(<span style=\"color: #800080;\">1</span>,<span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">,size);\n" +
             "</span><span style=\"color: #008080;\">130</span>         <span style=\"color: #0000ff;\">for</span>( <span style=\"color: #0000ff;\">int</span> i = <span style=\"color: #800080;\">0</span> ; i&lt;n ; i++<span style=\"color: #000000;\"> )\n" +
             "</span><span style=\"color: #008080;\">131</span> <span style=\"color: #000000;\">        {\n" +
             "</span><span style=\"color: #008080;\">132</span>             scanf( <span style=\"color: #800000;\">\"</span><span style=\"color: #800000;\">%d %d %d</span><span style=\"color: #800000;\">\"</span>,&amp;L,&amp;R,&amp;<span style=\"color: #000000;\">num );\n" +
             "</span><span style=\"color: #008080;\">133</span>             update( <span style=\"color: #800080;\">1</span> , L , R-<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\"> , num );\n" +
             "</span><span style=\"color: #008080;\">134</span> <span style=\"color: #000000;\">        }\n" +
             "</span><span style=\"color: #008080;\">135</span>         solve(<span style=\"color: #800080;\">1</span><span style=\"color: #000000;\">);\n" +
             "</span><span style=\"color: #008080;\">136</span> <span style=\"color: #000000;\">        getAns();\n" +
             "</span><span style=\"color: #008080;\">137</span> <span style=\"color: #000000;\">    }\n" +
             "</span><span style=\"color: #008080;\">138</span>     <span style=\"color: #0000ff;\">return</span> <span style=\"color: #800080;\">0</span><span style=\"color: #000000;\">;\n" +
             "</span><span style=\"color: #008080;\">139</span> }</pre>\n" +
             "</div>\n" +
             "<span class=\"cnblogs_code_collapse\">View Code</span></div>\n" +
             "<p>&nbsp;</p>\n" +
             "<p><span style=\"background-color: #ccffcc; color: #ff00ff;\">today:</span></p>\n" +
             "<p><span style=\"background-color: #ccffcc; color: #ff00ff;\">　　I am ingratiated by the sunset because of her sensitivity</span><br /><span style=\"background-color: #ccffcc; color: #ff00ff;\">\n" +
             "　　As she tries to push the darkness back for just a moment more.</span><br /><span style=\"background-color: #ccffcc; color: #ff00ff;\">\n" +
             "　　But like so many times before&hellip;To no avail!</span></p>\n" +
             "<p>&nbsp;</p>\n" +
             "<p>&nbsp;</p>\n" +
             "<p>&nbsp;</p>\n" +
             "<p>&nbsp; </p></div><div id=\"MySignature\"></div>\n" +
             "<div class=\"clear\"></div>\n" +
             "<div id=\"blog_post_info_block\">\n" +
             "<div id=\"BlogPostCategory\"></div>\n" +
             "<div id=\"EntryTag\"></div>\n" +
             "<div id=\"blog_post_info\">\n" +
             "</div>\n" +
             "<div class=\"clear\"></div>\n" +
             "<div id=\"post_next_prev\"></div>\n" +
             "</div>\n" +
             "\n" +
             "\n" +
             "\t\t</div>\n" +
             "\t\t<div class = \"postDesc\">posted @ <span id=\"post-date\">2014-07-04 20:57</span> <a href='http://www.cnblogs.com/radical/'>radical</a> 阅读(<span id=\"post_view_count\">...</span>) 评论(<span id=\"post_comment_count\">...</span>)  <a href =\"https://i.cnblogs.com/EditPosts.aspx?postid=3825075\" rel=\"nofollow\">编辑</a> <a href=\"#\" onclick=\"AddToWz(3825075);return false;\">收藏</a></div>\n" +
             "\t</div>\n" +
             "\t<script type=\"text/javascript\">var allowComments=true,cb_blogId=182417,cb_entryId=3825075,cb_blogApp=currentBlogApp,cb_blogUserGuid='1321502b-1cc2-e311-8d02-90b11c0b17d6',cb_entryCreatedDate='2014/7/4 20:57:00';loadViewCount(cb_entryId);</script>\n" +
             "\t\n" +
             "</div><!--end: topics 文章、评论容器-->\n" +
             "</div><a name=\"!comments\"></a><div id=\"blog-comments-placeholder\"></div><script type=\"text/javascript\">var commentManager = new blogCommentManager();commentManager.renderComments(0);</script>\n" +
             "<div id='comment_form' class='commentform'>\n" +
             "<a name='commentform'></a>\n" +
             "<div id='divCommentShow'></div>\n" +
             "<div id='comment_nav'><span id='span_refresh_tips'></span><a href='javascript:void(0);' onclick='return RefreshCommentList();' id='lnk_RefreshComments' runat='server' clientidmode='Static'>刷新评论</a><a href='#' onclick='return RefreshPage();'>刷新页面</a><a href='#top'>返回顶部</a></div>\n" +
             "<div id='comment_form_container'></div>\n" +
             "<div class='ad_text_commentbox' id='ad_text_under_commentbox'></div>\n" +
             "<div id='ad_t2'></div>\n" +
             "<div id='opt_under_post'></div>\n" +
             "<div id='ad_c1' class='c_ad_block'></div>\n" +
             "<div id='under_post_news'></div>\n" +
             "<div id='ad_c2' class='c_ad_block'></div>\n" +
             "<div id='under_post_kb'></div>\n" +
             "<div id='HistoryToday' class='c_ad_block'></div>\n" +
             "<script type='text/javascript'>\n" +
             "    fixPostBody();\n" +
             "    setTimeout(function () { incrementViewCount(cb_entryId); }, 50);\n" +
             "    deliverAdT2();\n" +
             "    deliverAdC1();\n" +
             "    deliverAdC2();    \n" +
             "    loadNewsAndKb();\n" +
             "    loadBlogSignature();\n" +
             "    LoadPostInfoBlock(cb_blogId, cb_entryId, cb_blogApp, cb_blogUserGuid);\n" +
             "    GetPrevNextPost(cb_entryId, cb_blogId, cb_entryCreatedDate);\n" +
             "    loadOptUnderPost();\n" +
             "    GetHistoryToday(cb_blogId, cb_blogApp, cb_entryCreatedDate);   \n" +
             "</script>\n" +
             "</div>\n" +
             "\n" +
             "\n" +
             "\t</div><!--end: forFlow -->\n" +
             "\t</div><!--end: mainContent 主体内容容器-->\n" +
             "\n" +
             "\t<div id=\"sideBar\">\n" +
             "\t\t<div id=\"sideBarMain\">\n" +
             "\t\t\t\n" +
             "<!--done-->\n" +
             "<div class=\"newsItem\">\n" +
             "<h3 class=\"catListTitle\">公告</h3>\n" +
             "\t<div id=\"blog-news\"></div><script type=\"text/javascript\">loadBlogNews();</script>\n" +
             "</div>\n" +
             "\n" +
             "\t\t\t<div id=\"blog-calendar\" style=\"display:none\"></div><script type=\"text/javascript\">loadBlogDefaultCalendar();</script>\n" +
             "\t\t\t\n" +
             "\t\t\t<div id=\"leftcontentcontainer\">\n" +
             "\t\t\t\t<div id=\"blog-sidecolumn\"></div><script type=\"text/javascript\">loadBlogSideColumn();</script>\n" +
             "\t\t\t</div>\n" +
             "\t\t\t\n" +
             "\t\t</div><!--end: sideBarMain -->\n" +
             "\t</div><!--end: sideBar 侧边栏容器 -->\n" +
             "\t<div class=\"clear\"></div>\n" +
             "\t</div><!--end: main -->\n" +
             "\t<div class=\"clear\"></div>\n" +
             "\t<div id=\"footer\">\n" +
             "\t\t\n" +
             "<!--done-->\n" +
             "Copyright &copy;2016 radical\n" +
             "\t</div><!--end: footer -->\n" +
             "</div><!--end: home 自定义的最大容器 -->\n" +
             "</body>\n" +
             "</html>\n";
        Pattern p2 = Pattern.compile("<span style=\"color: #008080;\">(.*)</span>");
        Matcher m2 = p2.matcher(str);
        while(m2.find()) {
            System.out.println(m2.group(1));
        }

    }
}
