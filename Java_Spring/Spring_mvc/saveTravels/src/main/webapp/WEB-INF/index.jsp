<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Save Travels</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <div class="container">
    <h2>Save Travels</h2>
        <table>
            <thead>
                <tr>
                    <th>Expense</th>
                    <th>Vendor</th>
                    <th>Amount</th>
                    <th>Actions</th>
  
                </tr>
            </thead>
            <tbody>
        <c:forEach var="expense" items="${expenses}">
            <tr>
                <td><a href="/expenses/${expense.id}"> ${expense.name}</a></td>
                <td>${expense.vendor}</td>
                <td><strong> $ </strong>${expense.amount}</td>
                 <td style="display: flex; justify-content: space-around;">
                <a href="/expenses/edit/${expense.id}">Edit</a>
                <form action="/expenses/${expense.id}" method="post">
					    <input type="hidden" name="_method" value="delete">
					    <input type="submit" value="Delete" style="background-color: chocolate; border: none; border-radius: 20px; cursor: pointer;">
					</form>
            	</td>
            	
            </tr>
        </c:forEach>
    </tbody>
            
        </table>
        <h1>Add an expense:</h1>
        <form:form action="/expenses" method="post" modelAttribute="expense" style="display:grid;">
            <div class="form-group">
                <form:label path="name">Expense Name:</form:label>
                <br><form:errors path="name"/>
                <form:input path="name" class="form-input"/>
            </div>
            <div class="form-group">
                <form:label path="vendor">Vendor:</form:label>
                <br><form:errors path="vendor"/>
                <form:input path="vendor" class="form-input"/>
            </div>
            <div class="form-group">
                <form:label path="amount">Amount:</form:label>
                <br><form:errors path="amount"/>
                <form:input type="double" path="amount" class="form-input"/>
            </div>
            <div class="form-group">
                <form:label path="description">Description:</form:label>
                <br><form:errors path="description"/>
                <form:textarea path="description" class="form-input"/>
            </div>
            <input type="submit" value="Submit" class="submit-button"/>
        </form:form>

    </div>
</body>
</html>
    