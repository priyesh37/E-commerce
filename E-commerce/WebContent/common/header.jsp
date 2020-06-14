<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="vo.signupvo" import="vo.product_cat_vo" import="dao.product_cat" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	<nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="#">A-SHOP</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="index.jsp">Home</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="admin/products.jsp" id="navbardrop" data-toggle="dropdown" >Products</a>
      			<div class="dropdown-menu">
      				<%
									product_cat d1=new product_cat();
									product_cat_vo p=new product_cat_vo();
									
									
									List<product_cat_vo> li= d1.getAll(p);
									
									//HttpSession session= request.getSession();
									session.setAttribute("list", li);
					%>
						<%@ taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>

										<x:forEach items="${sessionScope.list}" var="i">
										 
										 	<a class="dropdown-item" href="#" value="${i.id}">${i.title}<br></a>
										</x:forEach>
      			</div>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="about.jsp">About</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="contact.jsp">Contact</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="signup.jsp">Sign up</a>
      </li>
     	<li class="nav-item dropdown">
      		<%
      			if(session.getAttribute("signup")!=null){
      				signupvo v=(signupvo)session.getAttribute("signup");
      		%>
      		 <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown" 
      		 href=""><%=v.getName() %>
      			<span class="caret"></span></a>
      			<div class="dropdown-menu">
      					
      				<%
      				if(v.getRole().equals("admin")){
      				%>
      				<a class="dropdown-ıtem" href="admin/index.jsp">Dashboard</a><br>
      				<a class="dropdown-ıtem" href="logout">Logout</a>
      				<%			
      				}
      				else if(v.getRole().equals("user")){
      				%>
      				<a class="dropdown-ıtem" href="user/index.jsp">Dashboard</a><br>
      				<a class="dropdown-ıtem" href="logout">Logout</a>
      				</dıv>
      		
      			<%				
      				}
      			}
      			else{
      			%>	
        				<a class="nav-link" href="login.jsp">Login</a>
				<%	  
      			}
      			%>
       </li>
    </ul>
  </div>  
</nav>
</body>
</html>