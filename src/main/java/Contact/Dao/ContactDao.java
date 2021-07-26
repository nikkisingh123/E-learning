package Contact.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Contact.Model.Contact;


public class ContactDao
{
	 public int registerContact(Contact contact) throws ClassNotFoundException {
	       
		 String sql = "INSERT INTO user" +
	            "  (name, Email,Phone,Message,UserId,ContactId) VALUES " +
	            " (?, ?, ?, ?,?,?);";

	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false", "root", "1234");
	        		
	        	PreparedStatement preparedStatement = connection.prepareStatement(sql))
	        {
	           
	            preparedStatement.setString(1, contact.getName());
	            preparedStatement.setString(2, contact.getEmail());
	            preparedStatement.setString(3,   contact.getPhone());
	            preparedStatement.setString(4,  contact.getMessage());
	            preparedStatement.setString(5,  contact.getUserID());
	            preparedStatement.setString(6,  contact.getContact_Id());
	           
	            
	            System.out.println(preparedStatement);
	            
	            result = preparedStatement.executeUpdate();
	        }
	        catch (Exception e) {
	           
	        }
	        return result;
	    }
	    
}


