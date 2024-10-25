<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fruit Store</title>
    <style>
        table {
            width: 50%;
            margin: auto;
            border: 30px solid rgb(255,182,187);
        }
        th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: center;
        }
        .orange {
            color: orange;
        }
    </style>
</head>
<body>
    <h1 style="margin-left:25%; color:rgb(255,182,187);">Fruit Store</h1>
    <table>
        <tr>
            <th>Name</th>
            <th>Price</th>
        </tr>
        <c:forEach var="fruit" items="${fruits}">
            <tr>
                <td class="<c:if test='${fruit.name.startsWith("G")}'>orange</c:if>">${fruit.name}</td>
                <td>${fruit.price}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
