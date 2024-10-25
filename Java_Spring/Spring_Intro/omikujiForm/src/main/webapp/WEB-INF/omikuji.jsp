<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Omikuji Fortune</title>
    <style>
        body {
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .card {
            background: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            box-sizing: border-box;
        }
        h1 {
            color: #333;
            text-align: center;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"],
        input[type="number"],
        textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            margin-bottom: 10px;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border-radius: 4px;
            margin-left: 300px;
        }
    </style>
</head>
<body>
    <div>
    <h1>Send an Omikuji!</h1>
    <div class="card">
        <form action="/omikuji" method="post">
            <label for="number">Pick any number from 5 to 25:</label>
            <input type="number" name="number" min="5" max="25" required>
            
            <label for="city">Enter the name of any city:</label>
            <input type="text" name="city" required>
            
            <label for="person">Enter the name of any real person:</label>
            <input type="text" name="person" required>
            
            <label for="hobby">Enter professional endeavor or hobby:</label>
            <input type="text" name="hobby" required>
            
            <label for="livingThing">Enter any type of living thing:</label>
            <input type="text" name="livingThing" required>
            
            <label for="somethingNice">Say something nice to someone:</label>
            <textarea name="somethingNice" required></textarea>
            
            <h4>send and show a friend</h3>
            <input type="submit" value="Send">
        </form>
    </div>
    </div>
</body>
</html>
    