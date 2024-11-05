<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
    <title>All Books</title>
    <style>
        table {
            width: 70%;
            border-collapse: collapse;
        }
        th, td {
            padding: 10px;
            border: 3px solid black;
            text-align: left;
        }
    </style>
</head>
<body style="justify-items: center;">
    <h1>All Books</h1>
    <table>
        <thead>
            <tr style="background-color:lightgrey;">
                <th>ID</th>
                <th>Title</th>
                <th>Language</th>
                <th>Number of Pages</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.id}</td>
                    <td><a href="/books/${book.id}">${book.title}</a></td>
                    <td>${book.language}</td>
                    <td>${book.numberOfPages}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
    