package com.amdocs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amdocs.dao.Coursedao;
import com.amdocs.model.Course;



public class CourseServ {
	private static final long serialVersionUID = 1L;
	private Coursedao courseDao;

	public CourseServ() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String courseID = request.getParameter("id");
		String courseResource = request.getParameter("file");
		String cource_Desc = request.getParameter("msg");
		String course_fee = request.getParameter("fee");

		Course course = new Course();
		 course.setName(name);
		 course.setCourseId(courseID );
		 course.setCourseResource(courseResource);
		 course.setCourseDesc(cource_Desc);
		 course. setCourseFee(course_fee );

		try {
			Coursedao.registerCourse(course);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
