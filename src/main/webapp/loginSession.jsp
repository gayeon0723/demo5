<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-12-20
  Time: 오전 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%--  action은 서버에서 받을 주소 --%>
  <%--  method는 생략하면 get방식으로 설정됨.--%>
  <%--  서버에서는 action에서 적은 주소와 method의 방법에 따라 처리할 수 있는 함수를 호출 --%>
  <% if (session.getAttribute("loginId") != null){
    out.println("로그인 중..");
    out.println("<a href='logout.do'>로그아웃</a>");
  }else {%>
  <form action = "sessionGet.jsp" >
    id입력: <input name = "id" value = "root" > <br>
    pw입력: <input name = "pw" value = "1234" > <br>
    <button type = "submit"> 서버로 전송 </button>
  </form>
  <%
    }
  %>
</body>
</html>
