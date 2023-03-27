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
    <form:form>
    Name:<form:input path="name"/><br>
    Type:<form:input path="type"/><br>
    About:<form:input path="about"/><br>
    availability:<form:input path="availability"/><br>
    Price:<form:input path="price"/><br>
    <input type="submit">
    
    </form:form>      
</body>
</html>