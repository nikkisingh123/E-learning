package com.user.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.user.model.User;

public class UserDao {
  
    
    public int registerUser(User user) throws ClassNotFoundException {
        String sql = "INSERT INTO user" +
            "  (name, Email, UserId, RegDate, Phone_Number,password, Address) VALUES " +
            " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/tech?useSSL=false", "root", "1234");
        		
        	PreparedStatement preparedStatement = connection.prepareStatement(sql))
        {
            preparedStatement.setString(1, user.getName());
        
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3, user.getUserId());
            preparedStatement.setString(4, user.getRegDate());
            preparedStatement.setString(5, user. getPhone_Number());
            preparedStatement.setString(6, user.getPassword());
            preparedStatement.setString(7, user.getAddress());
            
            System.out.println(preparedStatement);
            
            result = preparedStatement.executeUpdate();
        }
        catch (Exception e) {
           
        }
        return result;
    }
    
            
    
}
