<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body>
<form action="course">
<div class="container">
<h1>Course Details</h1>
<table>
<tr>
<td>
Course Name
<input type="text" placeholder="Enter Name" name ="name" id="name" required>
</td>
</tr>
<tr>
<td>
Course Id
<input type="text" placeholder="Enter Course id" name ="id" id="id" required>
</td>
</tr>
<tr>
<td>
Course Resource
<input type="file" placeholder="" name ="file" id="file" required>
</td>
</tr>
<tr>
<td>
Course Description
<textArea placeholder="Enter Message" name="msg" id="msg" ></textArea>
</td>
</tr>
<tr>
<td>
Course Fee
<input type="text" placeholder="Enter fee" name="fee" id="userId" required>
</td>
</tr>

</table>
<button>Submit</button>
</div>
</form>
</body>
</html>