<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>VIEW JSP</title>
</head>
<body>
	<h2>VIEW JSP KYJ</h2>
	${requestScope.id} - ${requestScope.age}<br>
	${param.id} <br>
</body>
</html>