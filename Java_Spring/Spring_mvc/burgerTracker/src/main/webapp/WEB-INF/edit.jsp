<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
	<div class="container">
    <h1>Edit Burger</h1>
    <form:form action="${pageContext.request.contextPath}/burgers/${burger.id}" method="post" modelAttribute="burger">
        <div class="form-group">
            <form:label path="name">Burger Name:</form:label>
            <form:errors path="name"/>
            <form:input path="name" class="form-input"/>
        </div>
        <div class="form-group">
            <form:label path="restaurant">Restaurant:</form:label>
            <form:errors path="restaurant"/>
            <form:input path="restaurant" class="form-input"/>
        </div>
        <div class="form-group">
            <form:label path="rating">Rating:</form:label>
            <form:errors path="rating"/>
            <form:input type="number" path="rating" class="form-input"/>
        </div>
        <div class="form-group">
            <form:label path="notes">Notes:</form:label>
            <form:errors path="notes"/>
            <form:textarea path="notes" class="form-input"/>
        </div>
        <input type="submit" value="Update Burger" class="submit-button"/>
    </form:form>
    </div>
</body>
</html>
