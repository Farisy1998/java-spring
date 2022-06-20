<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		Integer salary = (Integer) request.getAttribute("salary");
		out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	%>
	<br>
	<br>
	<table>
		<tr>
			<th>ID</th>
			<td>$id</td>
		</tr>
		<tr>
			<th>Name</th>
			<td>$name</td>
		</tr>
		<tr>
			<th>Salary</th>
			<td>$salary</td>
		</tr>
	</table>
</body>
</html>