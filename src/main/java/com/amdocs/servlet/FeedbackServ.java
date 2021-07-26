package com.amdocs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.dao.FeedDao;
import com.amdocs.model.Feedback;

public class FeedbackServ {
	private static final long serialVersionUID = 1L;
	private FeedDao feeddao = new FeedDao();

	public FeedbackServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String UserId = request.getParameter("Uid");
		String Feedback = request.getParameter("feedback");
		String FeedbackId = request.getParameter("id");

		Feedback feedback = new Feedback();
		feedback.setName(name);
		feedback.setEmail(email);
		feedback.setUserId(UserId);
		feedback.setFeedback(Feedback);
		feedback.setFeedbackId(FeedbackId);

		try {
			feeddao.registerFeed(feedback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
