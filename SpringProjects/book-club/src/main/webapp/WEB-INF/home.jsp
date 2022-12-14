<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<h1>Welcome, <c:out value="${user.userName}"/> </h1>
<div>
<table>
<thead>
	<tr>
		<th>Title</th>
		<th>Author</th>
		<th>Thoughts</th>
		<th>Actions</th>
	</tr>
	
</thead>
<tbody>
<c:forEach var="book" items="${allBooks}">
	<tr>
	<td><a href="/books/view/${book.id}"> <c:out value="${book.title }"/> </a></td>
	<td><c:out value="${book.author }"/></td>
	<td><c:out value="${book.thoughts }"/></td>
	<td><c:out value="${expense.description }"/></td>
	

	<c:if test="${user_id == book.user.id }">
	<td><a href="/books/${book.id }">Edit</a>
	<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
	</form>
	</td>
	</c:if>
	</tr>
</c:forEach>
</tbody>
</table>
</div>

<div>
<a href="/books">Add a book</a>
<a href="/users/logout">log out</a>
</div>

</body>
</html>