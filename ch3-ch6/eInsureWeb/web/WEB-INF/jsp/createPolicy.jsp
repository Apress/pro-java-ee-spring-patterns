<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Underwriting</title>
<style>
    .error { color: red; }
  </style>  
</head>

<form:form action="" method="POST" commandName="policydetails">
	
	First Name <form:input path="firstName"/> <form:errors path="firstName" cssClass="error"/><br/>
	Last Name <form:input path="lastName"/> <form:errors path="lastName" cssClass="error"/><br/>
	Age <form:input path="age"/> <form:errors path="age" cssClass="error"/><br/>	
	
	<input type="submit" value="Save" />
</form:form>
</body>
</html>
