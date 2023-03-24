<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="saveUser" modelAttribute="user">

		<table>
			<tr>
				Name :
				<form:input path="name" />
			</tr>
			<tr>
				Email :
				<form:input path="email" />
			</tr>
			<tr>
				Password :
				<form:input path="password" />
			</tr>
			<tr>
				Role :
				<input type="radio" name="role" value="Manager">Manager
				<input type="radio" name="role" value="Staff">Staff
				<input type="radio" name="role" value="Admin">Admin
			</tr>
		</table>

		<input type="submit">


	</form:form>
</body>
</html>