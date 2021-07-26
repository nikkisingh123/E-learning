package com.amdocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.amdocs.model.User;

public class UserDao {

	public int registerUser(User user) throws ClassNotFoundException {
		String sql = "INSERT INTO user"
				+ "  (user_id,name, phone_no,email,address,reg_date,password,upload_photo) VALUES "
				+ " (?, ?, ?, ?, ?,?,?,?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false",
				"root", "1234");

			PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, user.getUserId());
			preparedStatement.setString(2, user.getName());
			preparedStatement.setString(3, user.getPhoneNumber());
			preparedStatement.setString(4, user.getEmail());
			preparedStatement.setString(5, user.getAddress());
			preparedStatement.setString(6, user.getRegDate());
			preparedStatement.setString(7, user.getPassword());
			preparedStatement.setString(8, user.getUploadPhoto());

			System.out.println(preparedStatement);
             result = preparedStatement.executeUpdate();
		} catch (Exception e) {
			
		}
		
		return result;
	}

}
