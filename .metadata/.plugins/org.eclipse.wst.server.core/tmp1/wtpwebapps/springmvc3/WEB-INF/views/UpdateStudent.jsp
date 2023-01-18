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
		<legend>Select The Student</legend>
		<form action="./select" method="post">
			<table>
				<tr>
					<td>Enter The Student Id</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Select"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>