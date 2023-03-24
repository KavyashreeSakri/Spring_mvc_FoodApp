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
  Name: <form:input path="name"/>
  Address: <form:input path="address"/>
   Phone number: <form:input path="phoneNumber"/>
   Email: <form:input path="email"/>
 
   <input type="submit">
   
   </form:form>
   <a href="displaybranch.jsp"><button> Display Branches</button></a>
</body>
</html>