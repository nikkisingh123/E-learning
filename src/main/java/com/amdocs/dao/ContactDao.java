package com.amdocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.amdocs.model.Contact;

public class ContactDao {
	public int registerContact(Contact contact) throws ClassNotFoundException {

		String sql = "INSERT INTO user" + "(user_id,name, Email,Phone_no,Message,contact_id) VALUES "
				+ " (?, ?, ?, ?,?,?);";

		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false",
				"root", "1234");

				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
			preparedStatement.setString(1, contact.getUserID());
			preparedStatement.setString(2, contact.getName());
			preparedStatement.setString(3, contact.getEmail());
			preparedStatement.setString(4, contact.getPhone());
			preparedStatement.setString(5, contact.getMessage());			
			preparedStatement.setString(6, contact.getContact_Id());

			System.out.println(preparedStatement);

			result = preparedStatement.executeUpdate();
		} catch (Exception e) {

		}
		return result;
	}

}
