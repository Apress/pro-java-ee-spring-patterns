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
<td>Prénom:</td>
<td><input name="firstName" type="text"/></td>
</tr>
<tr>
<td>Nom de famille:</td>
<td><input name="lastName" type="text"/></td>
</tr>
<tr>
<td>Age :</td>
<td><input name="age" type="text"/></td>
</tr>
<tr>
<td colspan="3">
<input type="button" value="Créer"
onClick="eventSubmit('createPolicy.do')" />
</td>
</tr>
</table>
</form>
</body>
</html>