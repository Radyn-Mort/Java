<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- allows errors to be show  -->
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/burger/edit/${burger.id}" method="post" modelAttribute="burger">
<input type="hidden" name="_method" value="put">
	<div>
	<form:label path="name">Name: </form:label>
	<form:errors path="name"/>
	<form:input path="name"/>
	</div>
	
	<div>
	<form:label path="restaurantName">Restaurant Name: </form:label>
	<form:errors path="restaurantName"/>
	<form:input path="restaurantName"/>
	</div>
	
	
	<div>
	<form:label path="rating">Rating: </form:label>
	<form:errors path="rating"/>
	<form:input type="number" path="rating"/>
	</div>
	
	<div>
	<form:label path="comment"> Comment: </form:label>
	<form:errors path="comment"/>
	<form:input path="comment"/>
	</div>
<input type="submit" value="Edit burger"/>
</form:form>

</body>
</html>