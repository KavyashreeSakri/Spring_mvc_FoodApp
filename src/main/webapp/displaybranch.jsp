<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=2px>
<tr>
<th>id</th>
<th>name</th>
<th>address</th>
<th>phone_number</th>
<th>email</th>
<th>delete</th>
<th>edit</th>


</tr>

<c:forEach var="branch" items="${list}" >
<tr>
<td>${branch.branch_id}</td>
<td>${branch.name}</td>
<td>${branch.address}</td>
<td>${branch.phoneNumber}</td>
<td>${branch.email}</td>
<td><a href="delete?id=${branch.branch_id}">delete</a></td>
<td><a href="edit?id=${branch.branch_id}">edit</a></td>

</tr>

</c:forEach>
</table>

</body>
</html>