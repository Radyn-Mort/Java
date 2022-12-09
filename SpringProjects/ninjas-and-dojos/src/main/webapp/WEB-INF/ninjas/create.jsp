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
<!-- Form -->
<form:form action="/ninjas" method="post" modelAttribute="ninja">


	<div>
	<form:label path="fName"> First Name: </form:label>
	<form:errors path="fName"/>
	<form:input path="fName"/>
	</div>
	
	<div>
	<form:label path="lName">Last Name: </form:label>
	<form:errors path="lName"/>
	<form:input path="lName"/>
	</div>
	
	
	<div>
	<form:label path="age">Age: </form:label>
	<form:errors path="age"/>
	<form:input path="age"/>
	</div>
	<div>
	<form:select path="dojo">
<!-- why cant it read ? -->
		<c:forEach var="dojo" items="${ allDojos}">
			<form:option value ="${dojo.id}" path="dojo">
				<c:out value="${dojo.name}"/>
			</form:option>
		</c:forEach>
	</form:select>
	
	</div>
	
<input type="submit" value="Enroll"/>

</form:form>

</body>
</html>