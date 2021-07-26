<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body bgcolor="pink">
	<form action="add">
		<center>
			
				<h1>ADMIN REGISTRATION</h1>
				<table border="1" width="30%" cellpadding="5">
					<thead>
						<tr>
							<th colspan="2">Enter Information Here</th>
						</tr>
					</thead>
					<tbody>
					<tr>
						<td>Name <input type="text" placeholder="Enter Name"
							name="name" id="name" required>
						</td>
					</tr>
					<tr>
						<td>Email <input type="text" placeholder="Enter Email"
							name="email" id="email" required>
						</td>
					</tr>
					<tr>
						<td>Password <input type="Password"
							placeholder="Enter Password" name="psd" id="psd" required>
						</td>
					</tr>
					<tr>
						<td>AdminId <input type="Number" placeholder="Enter Id"
							name="number" id="number" required></td>
					</tr>
					 <tr>
                        <td><input type="submit" value="Submit" /></td>
                       
                    </tr>
		
			</tbody>
			</table>
			
		</center>
	</form>
</body>
</html>