
<html>
<head>
<title>Underwriting</title>

<script>
	function eventSubmit(url){
		document.policy.action = url;
		document.policy.submit();
	}
</script>
</head>
<body>

<form name="policy">
	
	
    <table>
        <tr>
            <td>First Name:</td>
            <td><input name="firstName" type="text"/></td>
        </tr>

        <tr>
            <td>Last Name:</td>
            <td><input name="lastName" type="text"/></td>
            
        </tr>
        
        <tr>
            <td>Age :</td>
            <td><input name="age" type="text"/></td>
           
        </tr>
        
        <tr>
            <td colspan="3">
                <input type="button" value="Create" onClick="eventSubmit('createPolicy.do')" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>