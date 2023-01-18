<%@page import="com.jsp.springmvc2.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="NavBar.jsp"></jsp:include>
<%StudentPOJO student = (StudentPOJO)request.getAttribute("student"); %>
<%String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>student details</title>
</head>
<body>
	<fieldset>
        <legend>enter student details</legend>
            <form action="./Add" method="post">
                <table>
                <tr>
                    <td>name =</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>email =</td>
                    <td><input type="email" name="email"></td>
                </tr>
                <tr>
                    <td>contact =</td>
                    <td><input type="text" name="contact"></td>
                </tr>
                <tr>
                    <td>username =</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>password =</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Add"></td>
                </tr>
                </table>
            </form>
        </fieldset> 
        <%
	if (student != null) {
	%>
	<h3 align="center">
		<%=student.getName()%>
		added successfully..!!
	</h3>
	<%
	} else if (msg != null) {
	%>
	<h3 align="center">
		<%=msg%>
	</h3>
	<%
	}
	%>
</body>
</html>