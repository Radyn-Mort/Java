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
<h1>All Expenses</h1>
<table>
<thead>
	<tr>
		<th>Expense</th>
		<th>Vendor</th>
		<th>Cost</th>
		<th>Description</th>
		<th>Actions</th>
	</tr>
	
</thead>
<tbody>
<c:forEach var="expense" items="${allExpenses}">
	<tr>
	<td><c:out value="${expense.name }"/></td>
	<td><c:out value="${expense.vendor }"/></td>
	<td><c:out value="${expense.cost }"/></td>
	<td><c:out value="${expense.description }"/></td>
	<td><a href="/expense/${expense.id }">Edit</a>
	<form action="/expense/${expense.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
	</form>
	</td>
	</tr>
</c:forEach>
</tbody>
</table>
<h2>Add an expense</h2>
<form:form action="/expense" method="post" modelAttribute="expense">

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