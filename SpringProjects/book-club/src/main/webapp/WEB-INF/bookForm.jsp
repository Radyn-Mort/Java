<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Form</title>
</head>
<body>
<h1>Add a book</h1>
<div>
<form:form action="/books" method="post" modelAttribute="book">

	<div>
	<form:label path="title">Title: </form:label>
	<form:errors path="title"/>
	<form:input path="title"/>
	</div>
	
	<div>
	<form:label path="author">Author: </form:label>
	<form:errors path="author"/>
	<form:input path="author"/>
	</div>
	
	
	<div>
	<form:label path="thoughts">Thoughts: </form:label>
	<form:errors path="thoughts"/>
	<form:textarea path="thoughts"/>
	</div>
	
	<div>
	<form:input type="hidden" path="user" value="${user.id}"/>
	</div>
	<input type="submit" value="submit"/>

</form:form>

</div>

</body>
</html>