<%--
  Created by IntelliJ IDEA.
  User: cbam
  Date: 2016/10/14
  Time: 17:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>异常处理页面</title>
</head>
<body>
<%
    Exception ex = (Exception) request.getAttribute("Exception");
%>
<H2>Exception:<%=ex.getMessage()%>
</H2>
</body>
</html>
