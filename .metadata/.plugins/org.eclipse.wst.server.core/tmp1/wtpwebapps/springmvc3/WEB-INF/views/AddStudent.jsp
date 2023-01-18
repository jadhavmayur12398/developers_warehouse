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
		<legend>Enter The Student Details</legend>
		<form action="./add" method="post">
			<table>
				<tr>
					<td><label>Name</label></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td><label>Email</label></td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td><label>Contact</label></td>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<td><label>UserName</label></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>Password</label></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" name="Add"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>