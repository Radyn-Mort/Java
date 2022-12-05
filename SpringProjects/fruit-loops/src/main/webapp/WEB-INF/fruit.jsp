<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

<table >
<thead>
	<tr class="tRow" >
		<th class="tHead">
		Fruit
		</th>
		<th>
		Price 
		</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach var="fruit" items="${fruits}" >
			<tr class="tRow">
			<td ><c:out value="${fruit.name}"/></td>
			<td>${fruit.price}</td>
			</tr>
	</c:forEach>
	</tbody>
</table>

</body>
</html>