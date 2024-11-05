<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create a New Book</title>
    <style>
        .form-container {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        form {
            width: 300px;
            padding: 20px;
            border: 1px solid grey;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            background-color: lightgrey;
        }

        label, input, textarea, button {
            display: block;
            width: 100%;
            margin-bottom: 10px;
        }

        button {
            width: auto;
            padding: 10px;
            background-color: green;
            color: white;
            border-radius: 7px;
            margin-left:auto;
            margin-right:auto;
        }

        button:hover {
            background-color: gold;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <form action="/books" method="POST">
            <h1>New Book</h1>
            <label for="title">Title:</label>
            <input type="text" name="title" required>

            <label for="description">Description:</label>
            <textarea name="description" required></textarea>

            <label for="language">Language:</label>
            <input type="text" name="language" required>

            <label for="pages">Number of Pages:</label>
            <input type="number" name="pages" required>

            <button type="submit">Add Book</button>
        </form>
    </div>
</body>
</html>
    