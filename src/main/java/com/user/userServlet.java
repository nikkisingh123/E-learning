package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.Dao.UserDao;
import com.user.model.User;

//@WebServlet("/register")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
private UserDao userdao;



public userServlet() {
	super();
}



protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
		
	
	    
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String UserId=request.getParameter("UserId");
		String Rdate=request.getParameter("RDate");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String pass=request.getParameter("psw");
		
		User user=new User();
		user.setName(name);
		user.setEmail(email);
	    user.setUserId(UserId);
	    user.setRegDate(Rdate);
	    user.setPhone_Number(phone);
	    user.setPassword(pass);
	    user.setAddress(address);
		
	    try {
            userdao.registerUser(user);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	}
}

	


