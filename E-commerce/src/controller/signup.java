package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.signupvo;
import dao.signupdao;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String[] errors=new String[4];
		
		signupvo s= new signupvo();
		
		PrintWriter p = response.getWriter();
		
		if(!request.getParameter("name").equals("") && !request.getParameter("name").equals(" ")){
			s.setName(request.getParameter("name"));
		}
		else{
			errors[0]= "Name field is not valid";
		}
		
		if(!request.getParameter("contact").equals("") && !request.getParameter("contact").equals(" ")){
			s.setContact(request.getParameter("contact"));
		}
		else{
			errors[1]= "cantact field is not valid";
		}
		
		if(!request.getParameter("email").equals("") && !request.getParameter("email").equals(" ")){
			s.setEmail(request.getParameter("email"));
		}
		else{
			errors[2]= "Email field is not valid";
		}
		
		if(!request.getParameter("password").equals("") && !request.getParameter("password").equals(" ")){
			//(BCrypt.hashpw(request.getParameter("password"),BCrypt.gensalt(12)
			s.setPassword(request.getParameter("password"));
		}
		else{
			errors[3]= "password field is not valid";
		}
		
		signupdao d=new signupdao();
		
		boolean b=d.insert(s);
		if(b){
			response.sendRedirect("success.jsp");
		}
		else{
			response.sendRedirect("signup.jsp?info=failed");
		}
		
		
	}
		
}
