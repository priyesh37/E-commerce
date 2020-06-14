package dao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import vo.signupvo;


public class signupdao {

	public boolean insert(signupvo s)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
	
			Statement st=cn.createStatement();
			st.executeUpdate("insert into signup(name,contact,email,password) values('"+s.getName()+"','"+s.getContact()+"','"+s.getEmail()+"','"+s.getPassword()+"')");
			st.close();
			cn.close();
		}
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return true;
	}
	
	public signupvo login(signupvo s)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from signup where email='"+s.getEmail()+"'");
			
			signupvo s1=new signupvo();
			
			while(rs.next())
			{
				
				int i=rs.getInt("id");
				String n=rs.getString("name");
				String e=rs.getString("email");
				String c=rs.getString("contact");
				String p=rs.getString("password");
				String r=rs.getString("role");
				
				s1.setId(i);
				s1.setName(n);
				s1.setEmail(e);
				s1.setContact(c);
				s1.setPassword(p);
				s1.setRole(r);
			}	
				
			rs.close();
			st.close();
			cn.close();
			
			boolean bd=s.getPassword().equals(s1.getPassword());
			if(bd)
			{
				return s1;
			}
			else{
				return null;
			}
		}
			
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return null;
	}
	public List<signupvo> getAll(signupvo s){
		
		List<signupvo> li=new ArrayList<signupvo>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from signup");
			
			while(rs.next())
			{
				signupvo s2=new signupvo();
				int i=rs.getInt("id");
				String n=rs.getString("name");
				String e=rs.getString("email");
				String c=rs.getString("contact");
				String p=rs.getString("password");
				String r=rs.getString("role");
				
				s2.setId(i);
				s2.setName(n);
				s2.setEmail(e);
				s2.setContact(c);
				s2.setPassword(p);
				s2.setRole(r);
				li.add(s2);
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
	
	public boolean delete(int i)
	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
			Statement st=cn.createStatement();

			st.executeUpdate("delete from signup where id='"+i+"'");
		
			st.close();
			cn.close();
		}
		
		catch(Exception e)
		{
			System.out.println("invalid");
		}
		return true;
	}
	public boolean edit(int i)
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost/e-commerce","root","root");
		Statement st=cn.createStatement();

		ResultSet rs=st.executeQuery("select * from signup where id='"+i+"'");

			while(rs.next())
			{
				signupvo s2=new signupvo();
				int id1=rs.getInt("id");
				String n =rs.getString("name");
				String c=rs.getString("contact");
				String e=rs.getString("email");
				String p=rs.getString("password");
				
				s2.setId(id1);
				s2.setName(n);
				s2.setEmail(e);
				s2.setContact(c);
				s2.setPassword(p);
						
			}
		}
		catch(Exception e)
		{	
			System.out.println("invalid");
		}

		return true;
	}
}	
