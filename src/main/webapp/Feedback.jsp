<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FeedBack</title>
</head>
<body bgcolor="Aquamarine">
<form action=feed>
<center>
<h1>FeedBack</h1>
<table border="1" width="30%" cellpadding="5">
<thead>
						<tr>
							<th colspan="2">Enter Information Here</th>
						</tr>
					</thead>
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
 <tr>
                        <td><input type="submit" value="Submit" /></td>
                       
                    </tr>
</table>
</center>

</form>
</body>
</html>