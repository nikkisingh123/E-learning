package Admin.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.Dao.UserDao;
import com.user.model.User;

import Admin.Dao.Admindao;
import Admin.Model.Admin;

public class AdminServ extends HttpServlet {
	private Admindao admindao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
			
		
		    
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String pass=request.getParameter("psd");
			String AdminId=request.getParameter("number");
			
			Admin admin=new Admin();
			admin.setName(name);
			admin.setEmail(email);
			admin.setPassword(pass);
			admin.setAdminId(AdminId);
		  
		    try {
	            admindao.registerAdmin(admin);
	            
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

		}
	}

		



