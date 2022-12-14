<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form:form action="/books/${book.id}" method="post" modelAttribute="book">
<input type="hidden" name="_method" value="put">
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
	<form:errors path="user"/>
	</div>
	<input type="submit" value="submit"/>

</form:form>

</body>
</html>