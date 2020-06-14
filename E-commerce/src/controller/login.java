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
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		
		String[] errors=new String[2];
		
		signupvo s= new signupvo();
		
		PrintWriter p = response.getWriter();
		
		if(!request.getParameter("email").equals("") && !request.getParameter("email").equals(" ")){
			s.setEmail(request.getParameter("email"));
		}
		else{
			errors[0]= "Email field is not valid";
		}
		
		if(!request.getParameter("password").equals("") && !request.getParameter("password").equals(" ")){
			//(BCrypt.hashpw(request.getParameter("password"),BCrypt.gensalt(12)
			s.setPassword(request.getParameter("password"));
		}
		else{
			errors[1]= "password field is not valid";
		}
		
		signupdao d=new signupdao();
		
		signupvo s1=d.login(s);
		
		if(s1!=null){
			
				HttpSession session=request.getSession();
				session.setAttribute("signup", s1);
				
			if(s1.getRole().equals("admin")){
				response.sendRedirect("admin/index.jsp");
			}
			else if(s1.getRole().equals("user")){
				response.sendRedirect("index.jsp");
			}
		}
		else{
			response.sendRedirect("login.jsp");
			//p.print("failed");
		}
		
	}

}
