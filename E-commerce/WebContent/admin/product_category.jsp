<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="controller.product_category"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<%@include file="../common/cdn.jsp"%>
<link rel="stylesheet" type="text/css" href="../common/cm.css">
</head>
<body>
		<%@include file="../common/logincheck.jsp"%>
		<%@include file="header.jsp"%>
		
	<div class="container-fluid">
	
		<div class="row">
			<div class="col-sm-3 sidebar-col">
					<%@include file="../common/sidebar.jsp"%>
						
			</div>
			<div class="col-sm-9 main-col">
					<h3>Create Product Category</h3>
					
					<form action="../product_category" method="post">
						<div class="row">
							<div class="col-sm-6">
								<label>Title</label>
								<input type="text" class="form-control" name="title" placeholder="Enter title here">
							</div>
							<div class="col-sm-6">
								<label style="display:block;">&nbsp;</label>
								<button class="btn btn-success">Save</button>
							</div>
						</div>			
					</form>
					
					<br><br>
					<form action="../getall" method="get">
						<input type="submit" value="show all products">
					</form>
					
						
			</div>
		</div>
	</div>
</body>
</html>