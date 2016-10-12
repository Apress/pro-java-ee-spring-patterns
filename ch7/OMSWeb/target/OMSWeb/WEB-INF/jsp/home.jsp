<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
<title>Place an Order</title>
</head>
<body>
<form action="saveOrder.do" method="POST">
    <form:errors path="*"  />
  <table>
    <tr>
      <td>Item Id:</td>
      <td><input type='text' name='itemId' readonly="readonly"/></td>
      <td><input value="Find Item" name="FindItem" type="button" onClick="openItemSearchWindow()"/></td> 
    </tr>
    <tr>
      <td>Item Name</td>
      <td><input type='text' name='ItemName' /></td>
    </tr>
    <tr>
      <td>Item Description</td>
      <td><input type='text' name='ItemDesc' /></td>
    </tr>
   
    <tr><td colspan='2'><input value="Save" name="Save" type="submit" /></td></tr>
    
  </table>
</form>
</body>
</html>