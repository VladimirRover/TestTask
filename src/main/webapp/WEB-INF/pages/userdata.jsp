<%--
  Created by IntelliJ IDEA.
  User: VAH
  Date: 09.03.2017
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>

<html>
<head>
  <title>User Data</title>

  <style type="text/css">
    .tg {
      border-collapse: collapse;
      border-spacing: 0;
      border-color: #ccc;
    }

    .tg td {
      font-family: Arial, sans-serif;
      font-size: 14px;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #fff;
    }

    .tg th {
      font-family: Arial, sans-serif;
      font-size: 14px;
      font-weight: normal;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #f0f0f0;
    }

    .tg .tg-4eph {
      background-color: #f9f9f9
    }
  </style>

</head>
<body>
<h1>User details</h1>

<table class="tg">
  <tr>
    <th width="80">id</th>
    <th width="120">User name</th>
    <th width="80">User age</th>
    <th width="50">Admin</th>
    <th width="140">Create date</th>
  </tr>
  <tr>
    <td>${user.id}</td>
    <td>${user.userName}</td>
    <td>${user.userAge}</td>
    <td>${user.admin}</td>
    <td>${user.createDate}</td>
  </tr>
</table>
</body>
</html>