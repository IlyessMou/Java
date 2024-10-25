<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>Your Fortune</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .card {
            background: rgb(159,197,248);
            padding: 20px;
            width: 400px;
        }
        h1 {
            color: #333;
            text-align: center;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            color: #007bff;
            text-align: center;
        }
    </style>
</head>
<body>
	<div>
	    <h1>Here's Your Omikuji!</h1>
	    <div class="card">
	
	        <p>${fortune}</p>
	    </div>
	    <a href="/omikuji">Go Back</a>
    </div>
</body>
</html>
