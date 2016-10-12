<%@ taglib uri="sitemesh-decorator" prefix="decorator" %>
<%@ taglib uri="sitemesh-page" prefix="page" %>
<html>
	<head>
 		<title>
 			eInsure - <decorator:title default="Welcome!" />
 		</title>
 		<decorator:head />
 	</head>
 	
 	<body>
 	<table width="100%">
 		<tr id="header">
 			<h3>eInsure - rel 3.0.1 </h3>
 		</tr>
 		
 		<tr id="body">
 			<decorator:body />
 		</tr>
 		
 		<tr id="footer">
 			<h3>eInsure - All rights reserved </h3>
 		</tr>
 		
 	</table>
 
</html>



