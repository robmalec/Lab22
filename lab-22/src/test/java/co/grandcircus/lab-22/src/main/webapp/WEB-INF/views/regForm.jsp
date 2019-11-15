<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Thanks for registering!  Please enter your contact and account info below:</h1>
	<form action="confirmation" method="POST">
		<!-- Make sure all of these things are right -->
		First Name: <input type="text" name="first" id="txtFirst" required><br>
		Last Name: <input type="text" name="last" id="txtLast" required><br>
		Email: <input type="text" name="email" required> <br>
		Phone number: <input type="text" name="phone" required> <br>
		Password: <input type="text" name="password" required> <br>
		
		<!-- Submit button needs to be inside the form tag -->
		<button type="submit">Submit registration</button>
	</form>
</body>
</html>