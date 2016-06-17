<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Sign in
</h1>

<form action="/signinterceptor/sign/in" method="post">
id : <input type="text" id="id" name="id"/><br/>
pw : <input type="password" id="password" name="password"/><br/>
<input type="submit" value="Sign-in"/>


</form>

</body>
</html>
