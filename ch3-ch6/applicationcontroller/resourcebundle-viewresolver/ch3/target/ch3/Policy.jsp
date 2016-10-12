<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<title>Underwriting</title>
<script>
function eventSubmit(url){
document.uwr.action = url;
document.uwr.submit();
}
</script>
</head>
<body onLoad="displayError(<%=request.getAttribute("ERROR_MESSAGE")%>)">
<form action="" name="uwr">
Name of Insured <input type="text" value="" />
<br/>
<input type="submit" value="Create" onClick="eventSubmit('createPolicy.do')"/>
<input type="submit" value="Update" onClick="eventSubmit('updatePolicy.do')"/>
</form>

</body>
</html>