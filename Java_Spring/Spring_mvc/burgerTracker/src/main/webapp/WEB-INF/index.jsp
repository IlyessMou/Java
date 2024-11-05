<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Burger Tracker</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
    <div class="container">
    <h2>Burger Tracker</h2>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Restaurant</th>
                    <th>Rating</th>
                </tr>
            </thead>
            <tbody>
        <c:forEach var="burger" items="${burgers}">
            <tr>
                <td>${burger.name}</td>
                <td>${burger.restaurant}</td>
                <td>${burger.rating}</td>
            </tr>
        </c:forEach>
    </tbody>
            
        </table>
        <h1>Add a Burger:</h1>
        <form:form action="/burgers" method="post" modelAttribute="burger" style="display:grid;">
            <div class="form-group">
                <form:label path="name">Burger Name:</form:label>
                <br><form:errors path="name"/>
                <form:input path="name" class="form-input"/>
            </div>
            <div class="form-group">
                <form:label path="restaurant">Restaurant:</form:label>
                <br><form:errors path="restaurant"/>
                <form:input path="restaurant" class="form-input"/>
            </div>
            <div class="form-group">
                <form:label path="rating">Rating:</form:label>
                <br><form:errors path="rating"/>
                <form:input type="number" path="rating" class="form-input"/>
            </div>
            <div class="form-group">
                <form:label path="notes">Notes:</form:label>
                <br><form:errors path="notes"/>
                <form:textarea path="notes" class="form-input"/>
            </div>
            <input type="submit" value="Submit" class="submit-button"/>
        </form:form>

    </div>
</body>
</html>
    