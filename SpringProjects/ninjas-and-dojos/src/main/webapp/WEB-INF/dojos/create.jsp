<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- imports core -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- imports form tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create A Dojo</h1>

<form:form action="/dojos" method="post" modelAttribute="dojo">
	<div>
	<form:label path="name">Name: </form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</div>
	<input type="submit" value="Create"/>
</form:form>
</body>
</html>