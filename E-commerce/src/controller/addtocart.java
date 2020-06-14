package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.signupvo;

/**
 * Servlet implementation class addtocart
 */
@WebServlet("/addtocart")
public class addtocart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addtocart() {
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
		
		List li;
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		if(session.getAttribute("signup") != null){
			
		
			String s1=request.getParameter("id");
			if(session.getAttribute("addtocart")==null){
				li=new ArrayList();
				li.add(s1);
				session.setAttribute("addtocart", li);
				}
				else{
					li=(List) session.getAttribute("addtocart");
					if(!li.contains(s1)){
						li.add(s1);
					}
				
						session.setAttribute("addtocart", li);
				}
		
			
			out.print(li.size());
		}
		else{
			out.print(0);
			session.invalidate();
		}
	}

}
