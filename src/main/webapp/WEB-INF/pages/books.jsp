<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
    
    <title>Hello SpringMVC</title>
    
</head>
<body>

    <h1><spring:message code="label.books.list" /></h1>


	<table>
		<tr>
 		   <th><spring:message code="label.books.title" /></th>
 		   <th><spring:message code="label.books.author" /></th>

		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
			   <td><c:out value="${book.title}" /></td>
			   <td><c:out value="${book.author}" /></td>
			</tr>
		</c:forEach>
	</table>
       
</body>
</html>