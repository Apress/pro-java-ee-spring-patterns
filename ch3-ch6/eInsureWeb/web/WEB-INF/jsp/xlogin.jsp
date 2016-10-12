<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
<title>Login</title>
</head>
<body>
<form action="j_spring_security_check" method="POST">
    <form:errors path="*" cssClass="errorBox" />
  <table>
    <tr>
      <td>User:</td>
        </td><input type='text' name='j_username' /></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><input type='password' name='j_password' /></td>
    </tr>
   
    <tr><td colspan='2'><input name="submit" type="submit" /></td></tr>
    <tr><td colspan='2'><input name="reset" type="reset" /></td></tr>
  </table>
</form>
</body>
</html>