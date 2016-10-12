<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<title>Underwriting</title>

</head>
<body>

<form name="policysearch" action="policysearch.do">
	<%-- The search criteria inputs are not shown for simplicity --%>
	
    <table>
    	<tr>
            <td>Policy Id</td>
            <td>First Name</td>
            <td>Last Name</td>
            <td>Age</td>
            
        </tr>
        <c:forEach var="policyDtl" items="${policyDtlList}" >
        <tr>
    	
    		<td><c:out value="${policyDtl.policyId}"/></td>
            <td><c:out value="${policyDtl.firstName}"/></td>
            <td><c:out value="${policyDtl.lastName}"/></td>
    		<td><c:out value="${policyDtl.age}"/></td>
    	
        </tr>
        </c:forEach>
        <tr>
            <td colspan="3">
                <input type="submit" value="Search" />
                
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>