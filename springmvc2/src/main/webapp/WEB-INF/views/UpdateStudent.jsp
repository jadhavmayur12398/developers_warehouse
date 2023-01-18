<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student details</title>
</head>
<body>
	<fieldset>
		<legend>Select Student</legend>
		<form action="./update" method="post">
		<table>
			<tr>
				<td>Enter Student id :</td>
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