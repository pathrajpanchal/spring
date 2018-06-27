<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
<f:form action="enterindb.ahtml"  modelAttribute="x" >
<tr><td>Firstname :</td><td><f:input path="firstname"></f:input></td></tr>
<tr><td>Username :</td><td><f:input path="username"></f:input></td></tr>
<tr><td>Password :</td><td><f:input path="Password" type="password"></f:input></td></tr>
<input type="submit">
</f:form>

</body>
</html>