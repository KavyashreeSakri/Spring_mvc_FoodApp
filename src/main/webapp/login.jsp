<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   	<form:form action="loginUser" modelAttribute="user">
    	Email :<form:input path="email" />
			
	    Password :<form:input path="password" />
	    <input type="submit">
		
   	</form:form>

</body>
</html>