<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
</head>
<body>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

      <c:catch var ="catchException">
         	<c:if test = "${status == '0'}">
	wrong credentials
	<c:set var="staus" value="1"/> 
	  	</c:if>
	  	
      </c:catch>

<form action = "check.html">

<tr><td>username : </td><td><input type="text" name="username"/></td></tr>
<tr><td>password : </td><td><input type="text" name="password"/></td></tr>
<tr><td><input type="submit"></td></tr>
</form>


</body>
</html>