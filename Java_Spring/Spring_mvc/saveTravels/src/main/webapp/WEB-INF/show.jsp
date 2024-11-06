<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body style="justify-items: center;padding-top: 100px; background-color: paleturquoise;">
    <c:choose>
        <c:when test="${expense != null}">
            <h1>💰💲Expense Details ✈️⛩️</h1>
            <p><strong>Expense Name:</strong> ${expense.name}</p>
            <p><strong>Expense Description:</strong> ${expense.description}</p>
            <p><strong>Vendor:</strong> ${expense.vendor}</p>
            <p><strong>Amount Spent:</strong> <strong> $ </strong> ${expense.amount}</p>
            <a href="/expenses" class="button" style="display: inline-block; padding: 10px 20px; color: white; background-color: orange; border: none; border-radius: 30px; text-decoration: none; ">Go Back</a>
        </c:when>
        <c:otherwise>
            <p>Book not found.</p>
        </c:otherwise>
    </c:choose>
    
</body>
</html>