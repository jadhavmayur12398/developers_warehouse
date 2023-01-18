<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
	<fieldset>
		<legend>Login Hear...</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" name="login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>