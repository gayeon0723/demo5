<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-12-23
  Time: 오전 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>해당 페이지는 광고를 포함하고 있습니다.</h1>
    <%
        Cookie cookie = new Cookie("adTracker", "user12345");
        Cookie cookie2 = new Cookie("adCompany", "shinsegae");
        Cookie cookie3 = new Cookie("count", "5");
        Cookie cookie4 = new Cookie("pay", "ok");
        response.addCookie(cookie);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        response.addCookie(cookie4);
    %>
    <h1>광고 페이지를 클릭하셨습니다.</h1>
</body>
</html>
