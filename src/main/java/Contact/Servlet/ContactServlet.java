package Contact.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Contact.Dao.ContactDao;
import Contact.Model.Contact;


//@WebServlet("/ContactServlet")
public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ContactDao contactdao;

   
    public ContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String Phone=request.getParameter("number");
		String Message=request.getParameter("msg");
		String UserID=request.getParameter("id");
		String ContactId=request.getParameter("contactid");
		
		Contact contact=new Contact();
		contact.setName(name);
		contact.setEmail(email);
		contact.setPhone(Phone);
		contact.setMessage(Message);
		contact.setUserID(UserID);
		contact.setContact_Id(ContactId);
	    
		try {
           contactdao.registerContact(contact);
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}

