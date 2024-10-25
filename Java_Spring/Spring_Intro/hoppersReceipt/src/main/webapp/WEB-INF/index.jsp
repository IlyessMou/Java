<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Receipt</title>
</head>
<body>
    <h1>Receipt for Your Purchase</h1>
    <p><strong>Name:</strong> <c:out value="${name}"/></p>
    <p><strong>Item Name:</strong> <c:out value="${itemName}"/></p>
    <p><strong>Price:</strong> $<c:out value="${price}"/></p>
    <p><strong>Description:</strong> <c:out value="${description}"/></p>
    <p><strong>Vendor:</strong> <c:out value="${vendor}"/></p>
</body>
</html>