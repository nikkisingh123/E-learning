<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course</title>
</head>
<body bgcolor="orange">
	<form action="course">
		<center>
			<h1>Course Details</h1>
			<table border="1" width="30%" cellpadding="5">
				<thead>
					<tr>
						<th colspan="2">Enter Information Here</th>
					</tr>
				</thead>
				<tr>
					<td>Course Name <input type="text" placeholder="Enter Name"
						name="name" id="name" required>
					</td>
				</tr>
				<tr>
					<td>Course Id <input type="text" placeholder="Enter Course id"
						name="id" id="id" required>
					</td>
				</tr>
				<tr>
					<td>Course Resource <input type="file" placeholder=""
						name="file" id="file" required>
					</td>
				</tr>
				<tr>
					<td>Course Description <textArea placeholder="Enter Message"
							name="msg" id="msg"></textArea>
					</td>
				</tr>
				<tr>
					<td>Course Fee <input type="text" placeholder="Enter fee"
						name="fee" id="userId" required>
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