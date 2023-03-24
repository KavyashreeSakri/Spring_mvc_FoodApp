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

		
				Name :
				<form:input path="name" />
	
			
				Email :
				<form:input path="email" />
			
			
				Password :
				<form:input path="password" />
			
			
				Role :
				<input type="radio" name="role" value="Manager">Manager
				<input type="radio" name="role" value="Staff">Staff
				<input type="radio" name="role" value="Admin">Admin
			
		

		<input type="submit">


	</form:form>
</body>
</html>