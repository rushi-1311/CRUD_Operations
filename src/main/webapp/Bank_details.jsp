<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Customer Details Form</title>
  <style>
	form{
		margin-left: 200px;
		margin-right: 200px;
	}
	h2{
		font-size: 30px;
		color : Red ;
	}
	hr{
		height : 3px;
		position : relative;
		background-color: black;
	}
	.s1{
		border: none;
	}
	</style>
</head>
<body>
<h2> Bank Details Submission </h2>
<hr>

  <form action = "Application_details"  method = "post">
    <fieldset>
      <legend><h4>Customer Bank Details</h4></legend>
      <label for="customerName">Customer Name:</label>
      <input type="text" id="customerName" name="customerName" required>
      <br>
      <br>
      <label for="customerID">Customer ID:</label>
      <input type="text" id="customerID" name="customerID" required>
      <br><br>
      <label for="ifscCode">IFSC Code:</label>
      <input type="text" id="ifscCode" name="ifscCode" required>
      <br><br>
      <label for="branchName">Branch Name:</label>
      <input type="text" id="branchName" name="branchName" required>
    </fieldset>

    <fieldset>
      <legend><h4>Customer Address</h4></legend>
      <label for="houseNumber">House Number:</label>
      <input type="text" id="houseNumber" name="houseNumber" required>
<br><br>
      <label for="landmark">Landmark:</label>
      <input type="text" id="landmark" name="landmark" required>
<br><br>
      <label for="city">City:</label>
      <input type="text" id="city" name="city" required>
<br><br>
      <label for="pincode">Pincode:</label>
      <input type="text" id="pincode" name="pincode" required>
<br><br>
      <label for="state">State:</label>
      <input type="text" id="state" name="state" required>
    </fieldset>
    
    <hr>
    

    <input type="submit" value="Submit"> 
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <input type="Reset" value="Reset">
  </form>

</body>
</html>
