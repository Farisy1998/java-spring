<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Record:</h2>
	<%
		String id = (String) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		String programme = (String) request.getAttribute("programme");
		String batch = (String) request.getAttribute("batch");
		out.println("ID: "+id+", Name: "+name+", Programme: "+programme+", Batch: "+batch);
	%>
	
	ID: <b>${id }</b>
	Name: <b>${name}</b>
	Programme: <b>${programme}</b>
	Batch <b>${batch }</b>
	
</body>
</html>