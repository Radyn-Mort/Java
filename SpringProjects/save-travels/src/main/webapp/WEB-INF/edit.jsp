<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <!-- imports core -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!-- imports form tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit <c:out value="${expense.name }" /></h1>
	<form:form action="/expense/${expense.id}" method="post" modelAttribute="expense">
	<input type="hidden" name="_method" value="put">
	<div>
	<form:label path="name">Name: </form:label>
	<form:input path="name"/>
	<form:errors path="name"/>
	</div>
	
	<div>
	<form:label path="vendor">Vendor Name: </form:label>
	<form:input path="vendor"/>
	<form:errors path="vendor"/>
	</div>
	
	
	<div>
	<form:label path="cost">Cost: </form:label>
	<form:input type="number" path="cost"/>
	<form:errors path="cost"/>
	</div>
	
	<div>
	<form:label path="description"> Description: </form:label>
	<form:input path="description"/>
	<form:errors path="description"/>
	</div>
	<input type="submit" value="Submit"/>
	
</form:form>

</body>
</html>