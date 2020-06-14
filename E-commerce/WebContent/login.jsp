<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/common.css">
	<%@include file="common/cdn.jsp"%>
</head>
<body>

	<%@include file="common/header.jsp"%>
	
		<div class="container signup">
			<h1>Sign in Form</h1>
			<form method="post"action="login">
				
				<div class="row">
					<div class="col-sm-6">
						<label>Email</label>
						<input class="form-control" type="email" name="email">
					</div>
					<div class="col-sm-6">
						<label>password</label>
						<input class="form-control" type="password" name="password">
					</div>
				</div>
				
				<div class="row">
					<div class="col-sm-12">
						<button type="submit" class="btn btn-success">Submit</button>
						<a href="signup.jsp">Create a account</a>
					</div>
				</div>	
			</form>
		</div>
	<%@include file="common/footer.jsp"%>

</body>
</html>