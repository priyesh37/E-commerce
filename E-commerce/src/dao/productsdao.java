package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.product_cat_vo;
import vo.products;
import vo.signupvo;

public class productsdao {
		
	public boolean insert(products p)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
	
			Statement st=cn.createStatement();
			st.executeUpdate("insert into products(title,cost,description,quantity,product_category_id) values('"+p.getTitle()+"','"+p.getCost()+"','"+p.getDescription()+"','"+p.getQuantity()+"','"+p.getProduct_category_id()+"')");
			st.close();
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return true;
	}
	
public List<products> getAll(products p){
		
		List<products> li=new ArrayList<products>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from products");
			
			while(rs.next())
			{
				products p2=new products();
				int i=rs.getInt("id");
				String t=rs.getString("title");
				int c=rs.getInt("cost");
				int q=rs.getInt("quantity");
				int pc=rs.getInt("product_category_id");
				String d=rs.getString("description");
				
				p2.setId(i);
				p2.setTitle(t);
				p2.setCost(c);
				p2.setQuantity(q);
				p2.setProduct_category_id(pc);
				p2.setDescription(d);
				
				li.add(p2);
			}	
				
			rs.close();
			st.close();
			cn.close();
			
		}
			
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return li;
	}
	public products getone(int id){
	
		List li=new ArrayList();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from products where id='"+id+"'");
			
			products p2=new products();
			
			while(rs.next())
			{
				int i=rs.getInt("id");
				String t=rs.getString("title");
				int c=rs.getInt("cost");
				int q=rs.getInt("quantity");
				int pc=rs.getInt("product_category_id");
				String d=rs.getString("description");
				
				p2.setId(i);
				p2.setTitle(t);
				p2.setCost(c);
				p2.setQuantity(q);
				p2.setProduct_category_id(pc);
				p2.setDescription(d);
						
			}	
			return p2;
		}	
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return null;
	}
}
