<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users View</title>
</head>
<body>
	<h2>Registered Users:</h2>
	<%= request.getAttribute("users") %>
	<br>
	<c:forEach items="${usersList}" var="user">
		${user.id}
		${user.name}
		${user.email}
	</c:forEach>
</body>
</html>