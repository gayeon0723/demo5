<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2024-12-20
  Time: 오후 3:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>City Form</title>
</head>
<body>
    <h1>Enter City Information</h1>
    <a href="tour?cityName=busan&cityPopulation=5000">busan</a>
    <hr color="red">
    <form action="tour" method="post">
      <label for="cityName">City Name:</label>
      <input type="text" id="cityName" name="cityName" required><br><br>
      <label for="cityPopulation">City Population:</label>
      <input type="number" id="cityPopulation" name="cityPopulation" required><br><br>
      <input type="submit" value="Submit">
    </form>
</body>
</html>
