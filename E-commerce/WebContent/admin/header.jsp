<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="vo.signupvo"%>
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
        <a class="nav-link" href="../index.jsp">Home</a>
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
      				<a class="dropdown-ıtem" href="index.jsp">Dashboard</a><br>
      				<a class="dropdown-ıtem" href="../logout">Logout</a>
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