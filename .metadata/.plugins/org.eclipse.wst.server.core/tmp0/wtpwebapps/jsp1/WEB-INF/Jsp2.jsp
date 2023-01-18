<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Demo2</title>
</head>
<body>
	<%! List <int> list = new List(); %>
	<% list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5); %>
	<% for (int num : list) { %>
	<%= num %>
	<%=} %>
</body>
</html>