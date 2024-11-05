<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="justify-items: center;padding-top: 100px; background-color: bisque;">
	<h1>Book Details</h1>
    <c:choose>
        <c:when test="${book != null}">
            <p><strong>Title:</strong> ${book.title}</p>
            <p><strong>Description:</strong> ${book.description}</p>
            <p><strong>Language:</strong> ${book.language}</p>
            <p><strong>Pages:</strong> ${book.numberOfPages}</p>
        </c:when>
        <c:otherwise>
            <p>Book not found.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>