package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.product_cat_vo;
import dao.product_cat;

/**
 * Servlet implementation class product_category
 */
@WebServlet("/product_category")
public class product_category extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product_category() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		product_cat d1=new product_cat();
		 
		int i=Integer.parseInt(request.getParameter("id"));
		
		
		boolean b1=d1.delete(i);
		if(b1){
			response.sendRedirect("getall");
		}
		else{
				System.out.print("item cant remove");
		}
		

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		
		product_cat_vo p = new product_cat_vo();
		
		if(!request.getParameter("title").equals("") && !request.getParameter("title").equals(" ")){
			p.setTitle(request.getParameter("title"));
		}
		else{
			//errors[0]= "Name field is not valid";
		}
		product_cat d=new product_cat();
		
		boolean b=d.insert(p);
		if(b){
			response.sendRedirect("admin/product_category.jsp");
		}
		else{
			response.sendRedirect(" ");
		}
		
		
		
		
		
	}

}
