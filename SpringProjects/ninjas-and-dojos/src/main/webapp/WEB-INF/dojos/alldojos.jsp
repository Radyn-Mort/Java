<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<thead>
	<tr>
		<th>Name</th>
		<th>number of Students</th>
		<th>Actions</th>
	</tr>
	
</thead>
<tbody>
<c:forEach var="dojo" items="${allDojos}">
	<tr>
	<td><c:out value="${dojo.name }"/></td>
	<td><c:out value="${dojo.ninjas.size() }"/></td>
	<td><a href="/dojos/${dojo.id}"> View</a></td>
	
	</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>