<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="controller.allproducts"%>
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
					<h3>All Products</h3>
					
					
					<br><br>
				
					
					<table class="table table-bordered">
						<tr>
						<th>Action</th>
						<th>Action</th>
						<th>Id</th>
						<th>Title</th>
						<th>Cost</th>
						<th>Quantity</th>
						<th>product Category</th>
						<th>Description</th>
						</tr>
					<%@ taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>

						<x:forEach items="${sessionScope.list_product}" var="i">
						 
						 	<tr>
						 	<td><a href="../product_category?id=${i.id}" class="btn btn-primary">Delete</a></td>
						 	<td><a href="../edit?i=${i.id}" class="btn btn-primary">Update</a></td>
							<td>${i.id}</td>
							<td>${i.title}</td>
							<td>${i.cost}</td>
							<td>${i.quantity}</td>
							<td>${i.product_category_id}</td>
							<td>${i.description}</td>
							
							
							</tr>	
						   </x:forEach>
						</table>
						
			</div>
		</div>
	</div>
</body>
</html>