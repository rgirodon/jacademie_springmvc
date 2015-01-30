<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
    <title>Hello SpringMVC</title>
</head>
<body>

    <h1>Hello <c:out value="${user.firstName}"/></h1>
    <p>
        <spring:message code="label.lastname"/>: <c:out value="${user.lastName}"/><br>
        <spring:message code="label.firstname"/>: <c:out value="${user.firstName}"/><br>
        <spring:message code="label.email"/>: <c:out value="${user.email}"/><br>
        <spring:message code="label.age"/>: <c:out value="${user.age}"/><br>
    </p>

</body>
</html>