<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"  type="text/css" href = "/css/style.css">
</head>
<body>
	<h1>Here is your Omikuji</h1>
	<main>
	<p>
	in ${number} years you will live in <c:out value="${city}"/>
	with <c:out value="${person}"/> as your room mate,doing <c:out value="${hobby}"/>for a living.
	The next time you see a <c:out value="${animal}"/> you will have good luck. Also, <c:out value="${nice}"/>
	</p>
	</main>
	<a href="/form">back to form</a>
</body>
</html>