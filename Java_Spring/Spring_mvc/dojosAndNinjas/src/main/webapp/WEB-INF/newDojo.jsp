<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="display: flex; justify-content: center; align-items: center; height: 100vh;">
    <div style="padding: 20px; border: 1px solid black; border-radius: 8px; box-shadow: 0px 4px 8px grey; background-color: lightgrey;">
        <form:form action="/dojos" modelAttribute="dojo" method="post">
            <form:label path="name">Dojo Name:</form:label>
            <form:input path="name" />
            <form:errors path="name" cssClass="error" />
            <button type="submit">Create Dojo</button>
        </form:form>
    </div>
</div>
</body>
</html>