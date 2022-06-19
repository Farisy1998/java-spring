<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.spring.springmvccore.dto.Employee,java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Details</title>
</head>
<body>
	<%
		List<Employee> employees = (List<Employee>) request.getAttribute("emps");
	for(Employee emp : employees){
		out.println(emp);
	}
	%>
</body>
</html>