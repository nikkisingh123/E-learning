package Feedback.Servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Feedback.Dao.FeedDao;
import Feedback.model.Feedback;

public class FeedbackServ {
	private FeedDao feeddao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			
		
		    
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String UserId=request.getParameter("Uid");
			String Feedback=request.getParameter("feedback");
			String FeedbackId=request.getParameter("id");
			
			Feedback feedback=new Feedback();
			feedback.setName(name);
			feedback.setEmail(email);
			feedback.setUserId(UserId);
			feedback.setFeedback(Feedback);
			feedback.setFeedback_id(FeedbackId);
		  
		    try {
	           feeddao.registerFeed(feedback);
	            
	        } 
		    catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	}
}


	

