package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.product_cat_vo;
import vo.signupvo;

public class product_cat {
		
	public boolean insert(product_cat_vo p)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
	
			Statement st=cn.createStatement();
			st.executeUpdate("insert into product_category(title) values('"+p.getTitle()+"')");
			st.close();
			
			
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return true;
	}
	
public List<product_cat_vo> getAll(product_cat_vo p){
		
		List<product_cat_vo> li=new ArrayList<product_cat_vo>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from product_category");
			
			while(rs.next())
			{
				product_cat_vo p2=new product_cat_vo();
				int i=rs.getInt("id");
				String t=rs.getString("title");
				
				
				p2.setId(i);
				p2.setTitle(t);
				
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

public boolean delete(int id)
{
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
		Statement st=cn.createStatement();

		st.executeUpdate("delete from product_category where id='"+id+"'");
	
		st.close();
		cn.close();
	}
	
	catch(Exception e)
	{
		System.out.println("invalid");
	}
	return true;
}
}
