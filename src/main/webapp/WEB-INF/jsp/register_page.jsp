<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
${error}<br>
<form method="post" action="/registration">
    <input type="text" name="username" placeholder="Username"/><br>
    <input type="password" name="password" placeholder="Password"><br>
    <input type="password" name="repassword" placeholder="Repeat password"><br>
    <button>Registration</button>
    <a href="/login">Login</a>
</form>
</body>
</html>
