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
<form action="/submit" method="POST">
	<div>
	<label>pick a number between 1-5:</label>
    	<input type="text" name='number'>
	
	</div>
	<div>
	<label>Enter the name of a city:</label>
    	<input type='text' name='city'>
	
	</div>
	<div>
    	<label>Enter the name a person:</label>
    	<input type='text' name='name'>
	
	</div>
	<div>
    	<label>Enter a hobby:</label>
    	<input type='text' name='hobby'>
	
	</div>
	<div>
    	<label>Enter an animal :</label>
    	<input type='text' name='animal'>
	
	</div>
	<div>
    	
    	<label>Say Something nice:</label>
    	<input type='text' name='nice'>
	
	</div>
    	
    	
    	
    	
    	
    	
    	<input type='submit' value='send'>
    </form>

</body>
</html>