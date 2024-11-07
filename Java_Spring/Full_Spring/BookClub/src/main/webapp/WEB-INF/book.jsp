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
	<title>Insert title here</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h1><c:out value="${book.title}"/></h1>
		
		<c:choose>
		<c:when test="${user != null && user.id == book.user.id}">
		<h3>You read <strong style="color:rebeccapurple;">${book.title}</strong> by <strong style="color:mediumspringgreen;">${book.author}</strong></h3>
		</c:when>
		<c:otherwise>
				<h3><strong style="color:red;">${book.user.username}</strong> read <strong style="color:rebeccapurple;">${book.title}</strong> by <strong style="color:mediumspringgreen;">${book.author}</strong></h3>
		</c:otherwise>
		</c:choose>

		
		<div class="container">	
			    
			<h4>Here are <c:choose><c:when test="${user != null && user.id == book.user.id}"> 
			    Your
			 </c:when>
			<c:otherwise>
			 <strong style="color:red;">${book.user.username}</strong>'s</c:otherwise></c:choose> thoughts:</h4>
			<hr />
			
			<p><c:out value="${book.thoughts}"/></p>
			<hr />
		</div>
		<c:if test="${user != null && user.id == book.user.id}">
	        <a href="/books/${book.id}/edit" class="btn btn-warning">Edit</a>
	        <a href="/books/delete/${book.id}" class="btn btn-danger">Delete</a>
        </c:if>

    <br>
    <a href="/home">Back to Book Shelf</a>
		
	</div>

</body>
</html>