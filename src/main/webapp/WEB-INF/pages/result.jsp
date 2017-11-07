<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <title>Developer Info</title>
</head>
<body>
<h1> Мой 2-й коммит </h1>
<h2>Developer Information</h2>
<table>
  <tr>
    <td> First number: </td>
    <td>${num1}</td>
  </tr>
  <tr>
  <tr>
    <td> Second number: </td>
    <td>${num2}</td>
  </tr>
  <tr>
    <td> Result: </td>
    <td>${num1 + num2}</td>
  </tr>

</table>
</body>
</html>