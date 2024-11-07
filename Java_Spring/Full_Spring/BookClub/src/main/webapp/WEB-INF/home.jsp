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
		<h1 style="color: beige;font-family: serif;font-size: 49px;background-color: sienna;border-radius: 100px;">Welcome, ${user.username}</h1>
		
		<h3 style="justify-self: center;font-style: italic; font-size: larger; background-color: beige;border-radius: 100px;font-family: cursive;">Books from everyone shelves:</h3>
		<div style="display: flex; justify-content: space-around; margin-bottom: 20px;">
		<a href="/logout">logout</a>
		<a href="/addPage">+ Add to my shelf</a>
		</div>
		<table class="table">
		
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author Name</th>
				<th>Posted By</th>
			</tr>
			<c:forEach var="book" items="${books}">
				<tr>
					<td><c:out value="${book.id}"/></td>
					<td><a href="books/${book.id}">${book.title}</a></td>
					<td>${book.author}</td>
					<td>${book.user.username}</td>
				</tr>
			</c:forEach>
		
		</table>
	</div>

</body>
</html>