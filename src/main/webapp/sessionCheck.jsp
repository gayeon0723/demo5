<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-12-23
  Time: 오후 2:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("check", "ok");
%>
<a href="sessionReult.jsp">세션 결과 보기</a>
</body>
</html>
