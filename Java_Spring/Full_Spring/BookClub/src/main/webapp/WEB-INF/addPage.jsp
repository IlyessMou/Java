<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Book Club</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<h1>Add to Your Book Shelf</h1>

	<a href="/home">back to shelves</a>

	<div class="container">
		<form:form action="/books" modelAttribute="book" class="form" method="post" style="justify-items: center;">
		
			<div class="form-row">
				<form:label for="title" path="title">Title:</form:label>
				<br>
				<form:input type="text" path="title" class="form-control"/>
				<br>
				<form:errors path="title" class="error"/>
			</div>
			<br>
			<div class="form-row">
				<form:label for="author" path="author">Author:</form:label>
				<br>
				<form:input type="text" path="author" class="form-control"/>
				<br>
				<form:errors path="author" class="error"/>
			</div>
			<br>
			<div class="form-row">
				<form:label for="thoughts" path="thoughts">Thoughts:</form:label>
				<br>
				<form:textarea path="thoughts" class="form-control"/>
				<br>
				<form:errors path="thoughts" class="error"/>
				
			</div>
			<br>
			<div class="form-row">
				<form:errors path="user" class="error"/>
				<form:input type="hidden" path="user" value="${user.id}" class="form-control"/>
			</div>
			<br>
			<div class="form-row">
				<input type="submit" value="Submit" class="btn-primary"/>
			</div>
			
		</form:form>
	</div>

</div>

</body>
</html>