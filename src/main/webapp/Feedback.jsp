<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack</title>
</head>
<body>
<form action=feed>
<div class="container">
<h1>FeedBack</h1>
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
UserId
<input type="number" placeholder="Enter userID" name ="Uid" id="uid" required>
</td>
</tr>
<tr>
<td>
Feedback
<textarea placeholder="Enter Feedback" name="feedback"></textarea>
</td>
</tr>
<tr>
<td>
<b>Feedback ID</b>
<input type="text" placeholder="Enter feedback id" name="id" required>
</td>
</tr>
</table>
<button >submit</button>
</div>
</form>
</body>
</html>