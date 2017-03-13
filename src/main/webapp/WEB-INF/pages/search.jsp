<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>


<html>
<head>
  <title>Title</title>
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
<h1>
  Search result:
</h1>
<c:if test="${!empty searchResult}">
  <table class="tg">
    <tr>
      <th width="80">id</th>
      <th width="120">User name</th>
      <th width="80">User age</th>
      <th width="50">Admin</th>
      <th width="140">Create date</th>
        <th width="60">Edit</th>
        <th width="60">Delete</th>
    </tr>
    <c:forEach items="${searchResult}" var="user">

      <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.userAge}</td>
        <td>${user.admin}</td>
        <td>${user.createDate}</td>
        <td width="120"><a href="<c:url value='/edit/${user.id}/'/>">Edit</a></td>
        <td width="120"><a href="<c:url value='/remove/${user.id}'/>">Delete</a></td>
      </tr>
    </c:forEach>
  </table>
</c:if>
<a href="/users">Back</a>
</body>
</html>
