<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Underwriting</title>

</head>
<body>

<form >
	
	
    <table>
        <tr>
            <td>First Name:</td>
            <td><c:out value="${policydetails.firstName}"/></td>
            
            
        </tr>

        <tr>
            <td>Last Name:</td>
            <td><c:out value="${policydetails.lastName}"/></td>
            
        </tr>
        
        <tr>
            <td>Age :</td>
            <td><c:out value="${policydetails.age}"/></td>
           
        </tr>
        
    </table>
    
</form>

</body>
</html>