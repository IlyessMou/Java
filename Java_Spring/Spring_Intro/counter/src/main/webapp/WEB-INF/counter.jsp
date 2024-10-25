<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
	<body>
        <h1>Counter :</h1>
        <p>You have visited <a href="/">http://localhost:8080/  </a> <c:out value="${count}" /> times.</p>
        <a href="/">Test another visit?</a>
        <br />
        <!-- Ninja Bonus -->
        <a href="/doubleCounter">Visit to increment by 2</a>
        <br />
        <a href="/reset">Reset Counter</a>
    </body>
</html>