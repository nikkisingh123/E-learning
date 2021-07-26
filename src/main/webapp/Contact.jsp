<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact</title>
</head>
<body>
<form action="contact">
<div class="container">
<h1>Contact Details</h1>
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
Phone
<input type="number" placeholder="Enter Phone number" name ="number" id="number" required>
</td>
</tr>
<tr>
<td>
Message
<textArea placeholder="Enter Message" name="msg" id="msg" ></textArea>
</td>
</tr>
<tr>
<td>
UserID
<input type="text" placeholder="Enter UserId" name="id" id="userId" required>
</td>
</tr>
<tr>
<td>
Contact Id
<input type="text" placeholder ="Enter Contact Id" name="contactid" id="contactId" required>
</td>
</tr>

</table>
<button>Submit</button>
</div>
</form>
</body>
</html>