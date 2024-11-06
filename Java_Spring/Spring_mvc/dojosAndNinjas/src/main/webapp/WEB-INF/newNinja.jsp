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
    <div style="width: 300px; padding: 20px; border: 1px solid grey; border-radius: 8px; box-shadow: 0px 4px 8px black; background-color: lightgrey;">
        <form:form action="/ninjas" modelAttribute="ninja" method="post">
             <br>
            <form:label path="firstName">First Name:</form:label>
             <br>
            <form:input path="firstName" />
             <br>
            <form:errors path="firstName" cssClass="error" />
             <br>

            <form:label path="lastName">Last Name:</form:label>
            <br>
            <form:input path="lastName" />
             <br>
            <form:errors path="lastName" cssClass="error" />
             <br>
            <form:label path="age">Age:</form:label>
             <br>
            <form:input path="age" />
             <br>
            <form:errors path="age" cssClass="error" />
             <br>

            <form:label path="dojo.id">Dojo:</form:label>
             <br>
            <form:select path="dojo.id">
                <form:options items="${dojos}" itemValue="id" itemLabel="name" />
            </form:select>
             <br>
            <form:errors path="dojo.id" cssClass="error" />
             <br>
            <button type="submit">Create Ninja</button>
            <br>
        </form:form>
    </div>
</div>
</body>
</html>