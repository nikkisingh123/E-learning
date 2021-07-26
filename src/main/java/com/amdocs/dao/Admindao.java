package com.amdocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.amdocs.model.Admin;

public class Admindao {

	public int registerAdmin(Admin admin) throws ClassNotFoundException {
		String sql = "INSERT INTO user" + "  (admin_id,name,email,password) VALUES " + " (?, ?, ?, ?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false",
				"root", "1234");

				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, admin.getAdminId());
			preparedStatement.setString(2, admin.getName());
			preparedStatement.setString(3, admin.getEmail());
			preparedStatement.setString(4, admin.getPassword());

			System.out.println(preparedStatement);

			result = preparedStatement.executeUpdate();
		} catch (Exception e) {

		}
		return result;
	}

}
