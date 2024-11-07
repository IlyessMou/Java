<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Dashboard</title>
</head>
<body style="background-color: paleturquoise;">

<h1>Welcome, <c:out value="${user.username}"/>!</h1>
<p>This is your dashboard. Nothing to see here yet.</p>
<p><a href="/logout">logout</a></p>

</body>
</html>