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
   <form:form action="savebranch" modelAttribute="branch">
  Name: <form:input path="name"/><br>
  Address: <form:input path="address"/><br>
   Phone number: <form:input path="phoneNumber"/><br>
   Email: <form:input path="email"/><br>
 
   <input type="submit">
   
   </form:form>

</body>
</html>