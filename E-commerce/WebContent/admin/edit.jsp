<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="dao.signupdao" import="vo.signupvo"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A-SHOP</title>
	<link rel="stylesheet" href="css/common.css">
	<%@include file="../common/cdn.jsp"%>
</head>
<body>
		<%@include file="../common/logincheck.jsp" %>

	<%
	signupvo s=new signupvo();
	%>
	
		<div class="container signup">
			<h1>Sign Up Form</h1>
			<form method="post"action="../signup">
				<div class="row">
					<div class="col-sm-6">
						<label>Name</label>
						<input class="form-control" type="text" name="name" value="<%=s.getName()%>">
					</div>
					<div class="col-sm-6">
						<label>conatct</label>
						<input class="form-control" type="text" name="contact" value="c" required pattern="[6-9]{1}[0-9]{9}">
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-6">
						<label>Email</label>
						<input class="form-control" type="email" name="email" value="e">
					</div>
					<div class="col-sm-6">
						<label>password</label>
						<input class="form-control" type="password" name="password" value="p">
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-success">Submit</button>
						<a href="signin.jsp">Already Signed Up?</a>
					</div>
				</div>	
			</form>
		</div>
	<%@include file="../common/footer.jsp"%>
</body>
</html>