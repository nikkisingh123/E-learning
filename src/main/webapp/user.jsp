<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User</title>
</head>
<body>
<form action="register">
<div class="container">
<h1>USER REGISTRATION</h1>
<P>Please fill this to register Yourself</P>
<hr>
<label for="name">
<b>Name</b></label>
<input type="text" placeholder="Enter name" name="name" id="name" required>
<br>
<label for="email">
<b>Email</b></label>
<input type="text" placeholder="Enter Email" name="email" id="email" required>
<br>
<label for="UserId">
<b>UserId</b></label>
<input type="text" placeholder="Enter userId" name="UserId" id="id" required>
<br>

<label for="RegDate">
<b>RegDate</b></label>
<input type="text" placeholder="Enter RDate" name="RDate" id="Date" required>
<br>
<label for="Phone">
<b>Phone Number</b></label>
<input type="text" placeholder="phone number" name="phone" id="pno" required>
<br>

<label for="psw"><b>Password</b></label>
<input type="password" placeholder="Enter Password" name="psw" id="psw" required>
<br>

<label for="Address">
<b>Address</b></label>
<input type="text" placeholder="Enter address" name="address" id="address" required>
<br>

<label for="upload">
<b>Upload Photo</b></label>
<input type="file" name="photo" id="photo" required>
<br>
</div>
 <button type="submit" class="registerbtn">Register</button>
</form>
</body>
</html>