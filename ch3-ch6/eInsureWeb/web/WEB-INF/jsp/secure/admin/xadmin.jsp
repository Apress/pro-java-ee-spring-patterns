<%@ page import="org.springframework.security.context.SecurityContextHolder" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>admin</title>
    </head>
<body>

<h1>Welcome: <%= SecurityContextHolder.getContext().getAuthentication().getName() %> is an Admin</h1>
<p><a href="../../">Home</a>
<p><a href="../../j_acegi_logout">Logout</a>
</body>
</html>