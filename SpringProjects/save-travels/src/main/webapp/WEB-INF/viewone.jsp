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
<h1><c:out value="${expense.name }"/></h1>
<h3>Vendor: <c:out value="${expense.vendor }"/></h3>
<h3>Price: <c:out value="${expense.cost }"/></h3>
<h3>Description:<c:out value="${expense.description }"/></h3>
</body>
</html>