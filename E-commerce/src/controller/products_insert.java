package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.signupvo;
import vo.products;
import dao.product_cat;
import dao.signupdao;
import dao.productsdao;

/**
 * Servlet implementation class products_insert
 */
@WebServlet("/products_insert")
public class products_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public products_insert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String[] errors=new String[5];
		
		products p= new products();
		
		//PrintWriter p = response.getWriter();
		
		if(!request.getParameter("title").equals("") && !request.getParameter("title").equals(" ")){
			p.setTitle(request.getParameter("title"));
		}
		else{
			errors[0]= "title field is not valid";
		}
		
		if(!request.getParameter("cost").equals("") && !request.getParameter("cost").equals(" ")){
			String s1=request.getParameter("cost");
			p.setCost(Integer.parseInt(s1));
		}
		else{
			errors[1]= "cost field is not valid";
		}
		if(!request.getParameter("quantity").equals("") && !request.getParameter("quantity").equals(" ")){
			String s2=request.getParameter("quantity");
			p.setQuantity(Integer.parseInt(s2));
		}
		else{
			errors[2]= "Quantity field is not valid";
		}
		
		if(!request.getParameter("product_category_id").equals("") && !request.getParameter("product_category_id").equals(" ")){
			String s3=request.getParameter("product_category_id");
			p.setProduct_category_id(Integer.parseInt(s3));
		}
		else{
			errors[3]= "product_category_id field is not valid";
		}
		
		if(!request.getParameter("description").equals("") && !request.getParameter("description").equals(" ")){
			p.setDescription(request.getParameter("description"));
		}
		else{
			errors[4]= "description field is not valid";
		}
		
		productsdao d=new productsdao();
		
		boolean b=d.insert(p);
		if(b){
			response.sendRedirect("success.jsp");
		}
		else{
			response.sendRedirect("");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
