package com.amdocs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import com.amdocs.model.Course;

public class Coursedao {
	public static int registerCourse(Course course) throws ClassNotFoundException {

		String sql = "INSERT INTO course" + "(name,course_id,course_r,c_desc,c_fee) VALUES "
				+ " (?, ?, ?, ?,?);";
		
		int result = 0;

		Class.forName("com.mysql.jdbc.Driver");

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false",
				"root", "1234");

				PreparedStatement preparedStatement = connection.prepareStatement(sql)) {


			preparedStatement.setString(1,  course.getName());
			preparedStatement.setString(2,  course. getCourseId());
			preparedStatement.setString(3,  course. getCourseResource());
			preparedStatement.setString(4,  course.getCourseDesc());			
			preparedStatement.setString(5,  course. getCourseFee());

			System.out.println(preparedStatement);

			result = preparedStatement.executeUpdate();
		} catch (Exception e) {

		}
		return result;
	}

}
