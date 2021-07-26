package Feedback.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Feedback.model.Feedback;



public class FeedDao {
	 public int registerFeed(Feedback feedback) throws ClassNotFoundException {
	       
		 String sql = "INSERT INTO user" +
	            "  (name, Email,UserId,Feedback,Feedback_Id) VALUES " +
	            " (?, ?, ?, ?,?);";

	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false", "root", "1234");
	        		
	        	PreparedStatement preparedStatement = connection.prepareStatement(sql))
	        {
	            preparedStatement.setInt(1, 1);
	            preparedStatement.setString(2, feedback.getName());
	            preparedStatement.setString(3, feedback.getEmail());
	            preparedStatement.setString(4,   feedback.getUserId());
	            preparedStatement.setString(5,  feedback.getFeedback());
	            preparedStatement.setString(6,  feedback.getFeedback_id());
	           
	            
	            System.out.println(preparedStatement);
	            
	            result = preparedStatement.executeUpdate();
	        }
	        catch (Exception e) {
	           
	        }
	        return result;
	    }
	    
}
