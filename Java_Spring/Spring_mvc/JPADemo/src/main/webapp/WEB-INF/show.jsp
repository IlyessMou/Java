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
    <c:choose>
        <c:when test="${book != null}">
            <h1> ${book.title}</h1>
            <p><strong>Description:</strong> ${book.description}</p>
            <p><strong>Language:</strong> ${book.language}</p>
            <p><strong>Number Of Pages:</strong> ${book.numberOfPages}</p>
        </c:when>
        <c:otherwise>
            <p>Book not found.</p>
        </c:otherwise>
    </c:choose>
</body>
</html>