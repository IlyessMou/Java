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
    <form:form action="${pageContext.request.contextPath}/expenses/${expense.id}" method="post" modelAttribute="expense">
        <div class="form-group">
            <form:label path="name">Expense Name:</form:label>
            <form:errors path="name"/>
            <form:input path="name" class="form-input"/>
        </div>
        <div class="form-group">
            <form:label path="vendor">Vendor:</form:label>
            <form:errors path="vendor"/>
            <form:input path="vendor" class="form-input"/>
        </div>
        <div class="form-group">
            <form:label path="amount">Amount:</form:label>
            <form:errors path="amount"/>
            <form:input type="double" path="amount" class="form-input"/>
        </div>
        <div class="form-group">
            <form:label path="description">Description:</form:label>
            <form:errors path="description"/>
            <form:textarea path="description" class="form-input"/>
        </div>
        <input type="submit" value="Update Expense" class="submit-button"/>
        <a href="/expenses" class="button">cancel</a>
    </form:form>
    </div>
</body>
</html>
