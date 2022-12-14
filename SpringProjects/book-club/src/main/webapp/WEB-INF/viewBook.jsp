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
<h1><c:out value="${book.title }"/></h1>
<!-- conditional rendering for line -->
<c:choose>
<c:when test="${user_id == book.user.id }">
<h3>You read <c:out value="${book.title }"/> by <c:out value="${book.author }"/> </h3>
<h3>here are your thoughts</h3>
</c:when>
<c:otherwise>
<h3><c:out value="${book.user.userName}"/> read <c:out value="${book.title }"/> by <c:out value="${book.author }"/> </h3>
<h3> Here are <c:out value="${book.user.userName }"/> thoughts</h3>

</c:otherwise>
</c:choose>

<div>
<p><c:out value="${book.thoughts }"/></p>
</div>
<!-- conditional rendering for edit/delete -->
<c:if test="${user_id == book.user.id }">
<div>
	<a href="/books/${book.id }">Edit</a>
	
	<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
	</form>
</div>

</c:if>

</body>
</html>