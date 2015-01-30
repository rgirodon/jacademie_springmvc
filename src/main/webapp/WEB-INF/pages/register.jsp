<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Register</title>
    <meta charset="UTF-8">
</head>
<body>

    <form:form modelAttribute="user" method="POST" action="register.do">
        <label for="lastname"><spring:message code="label.lastname"/> </label>
        <form:input path="lastName" id="lastname" />
        <br>

        <label for="firstname"><spring:message code="label.firstname"/> </label>
        <form:input path="firstName" id="firstname" />
        <br>

        <label for="email"><spring:message code="label.email"/> </label>
        <form:input path="email" id="email" type="email"/>
        <br>

        <label for="age"><spring:message code="label.age"/> </label>
        <form:input path="age" id="age" type="number" />
        <br>

        <button type="submit"><spring:message code="label.register"/></button>

    </form:form>

</body>
</html>