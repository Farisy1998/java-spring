<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="saveReg" method="post">
		<br>
		<table align="center">
			<tr>
				<td>ID: <input type="text" name="id" id="id" /></td>
			</tr>
			<tr>
				<td><span id="errorMsg"></span></td>
			</tr>
			<tr>
				<td>Name: <input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Email: <input type="text" name="email"></td>
			</tr>
			<tr>
				<td><input type="submit" name="saveBtn"></td>
			</tr>
		</table>
	</form>
	<br> ${user}

	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script>
		$(document).ready(function() {
			$("#id").change(function() {
				$.ajax({
					url : 'validateEmail',
					data : {
						id : $("#id").val()
					},
					success : function(responseText) {
						$("#errorMsg").text(responseText);
						if (responseText != "") {
							$("#id").focus();
						}
					}
				});
			});
		});
	</script>
</body>
</html>