<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<form action="add">
<div class="container">
<h1>Admin REGISTRATION</h1>
<table>
<tr>
<td>
Name
<input type="text" placeholder="Enter Name" name ="name" id="name" required>
</td>
</tr>
<tr>
<td>
Email
<input type="text" placeholder="Enter Email" name ="email" id="email" required>
</td>
</tr>
<tr>
<td>
Password
<input type="Password" placeholder="Enter Password" name ="psd" id="psd" required>
</td>
</tr>
<tr>
<td>
AdminId
<input type="Number" placeholder="Enter Id" name ="number" id="number" required></td></tr>
</table>
<Button type="submit">Submit</Button> 
</div>
</form>
</body>
</html>