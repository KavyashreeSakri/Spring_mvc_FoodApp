<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Address</th>
			<th>PhoneNumber</th>
			<th>Email</th>
		</tr>
		<c:forEach var="branch" items="${list}">
			<tr>
				<td>${branch.id}</td>
				<td>${branch.name}</td>
				<td>${branch.address}</td>
				<td>${branch.phone}</td>
				<td>${branch.email}</td>



			</tr>




		</c:forEach>


	</table>

	<button>
		<a href="createBranch">Create Branch</a>
	</button>


</body>
</html>