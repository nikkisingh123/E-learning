package com.amdocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.amdocs.model.Feedback;

public class FeedDao {
	public int registerFeed(Feedback feedback) throws ClassNotFoundException {

		String sql = "INSERT INTO user" + "  (user_id,name, email,f_id,feedback) VALUES " + " (?, ?, ?, ?,?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false",
				"root", "1234");

				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, feedback.getUserId());
			preparedStatement.setString(2, feedback.getName());
			preparedStatement.setString(3, feedback.getEmail());
			preparedStatement.setString(4, feedback.getFeedbackId());
			preparedStatement.setString(5, feedback.getFeedback());
			

			System.out.println(preparedStatement);

			result = preparedStatement.executeUpdate();
		} catch (Exception e) {

		}
		return result;
	}

}
