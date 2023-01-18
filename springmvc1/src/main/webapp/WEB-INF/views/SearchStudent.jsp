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
		<legend>Search Student</legend>
		<form action="./search" method="post">
			<table>
				<tr>
					<td>Enter Student Id</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>