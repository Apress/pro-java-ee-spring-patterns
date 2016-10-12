<%@ page import="org.springframework.security.context.SecurityContextHolder" %>
<h1>Welcome: <%= SecurityContextHolder.getContext().getAuthentication().getName() %></h1>
<p><a href="../">Home</a>
<p><a href="../j_acegi_logout">Logout</a>