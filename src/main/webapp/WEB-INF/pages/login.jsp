<%--
  Created by IntelliJ IDEA.
  User: dname
  Date: 9/29/2018
  Time: 12:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/login" method="post">
        <p>Username
            <input type="text" name="username"  /></p>
        <p>
            ${messages.name}</p>

        <p>Password
            <input type="password" name="pass" /></p>
        <p>
            ${messages.pass}</p>

        <p>Login
            <input type="submit" name="submit" value="Login" /></p>
    </form>
</body>
</html>
