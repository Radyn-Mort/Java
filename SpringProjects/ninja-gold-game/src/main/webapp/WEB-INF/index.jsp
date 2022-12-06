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
<h1>Current:${gold}</h1>
<form action="/gold" method="POST">
	<label>Farm</label>
	<p>(earns 10-20)</p>
	<input type="hidden"  name="choice" value="farm">
	<input type="submit" value="choose"/>
</form>

<form action="/gold" method="POST">
	<label>Cave</label>
	<p>(earns 5-10)</p>
	<input type="hidden" value="cave" name="choice">
	<input type="submit" value="choose"/>
</form>

<form action="/gold" method="POST">
	<label>House</label>
	<p>(earns 2-5)</p>
	<input type="hidden" value="house" name="choice">
	<input type="submit" value="choose"/>
</form>

<form action="/gold" method="POST">
	<label>Quest</label>
	<p>(earns/takes 0-50)</p>
	<input type="hidden" value="quest" name="choice">
	<input type="submit" value="choose"/>
</form>

<form action="/gold" method="POST">
	<label>reset</label>
	<input type="hidden" value="reset" name="choice">
	<input type="submit" value="choose"/>
</form>
<c:forEach var="oneDojo" items="${dojosFromMyController}">
        <p><c:out value="${oneDojo}"></c:out></p>
   </c:forEach>
    
<c:forEach var="item" items="${ log}">
<h4>
<c:out value="${item}">
</c:out>

</h4>

</c:forEach>


</body>
</html>