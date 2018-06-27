<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign up</title>
</head>
<body>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<form:form action="signupprocess.html" modelAttribute="x" method="get">
<tr><td>Firstname : </td><td><form:input path="firstname" type="text"></form:input></td></tr>
<tr><td>Username :</td><td><form:input path="username" type="text"></form:input></td></tr>
<tr><td>Password :</td><td><form:input path="password" type="password"></form:input></td></tr>   
<tr><td><input type="submit"></td></tr>
</form:form>
</body>
</html>