<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<form:form action="/users/register" method="post" modelAttribute="user">
<h2>Register</h2>
	<div>
	<form:label path="email">Email: </form:label>
	<form:errors path="email"/>
	<form:input path="email"/>
	</div>
	
	<div>
	<form:label path="userName">User Name: </form:label>
	<form:errors path="userName"/>
	<form:input path="userName"/>
	</div>
	

	
	<div>
	<form:label path="password"> Password: </form:label>
	<form:errors path="password"/>
	<form:input path="password"/>
	</div>
	
	<div>
	<form:label path="conPass"> Confirm Password: </form:label>
	<form:errors path="conPass"/>
	<form:input path="conPass"/>
	</div>
	<input type="submit" value="Register"/>

</form:form>

<form:form action="/users/login" method="post" modelAttribute="loginUser">
<h2>Login</h2>
	<div>
	<form:label path="email">Email: </form:label>
	<form:errors path="email"/>
	<form:input path="email"/>
	</div>

	<div>
	<form:label path="password"> Password: </form:label>
	<form:errors path="password"/>
	<form:input path="password"/>
	</div>

	<input type="submit" value="Login"/>

</form:form>

</body>
</html>