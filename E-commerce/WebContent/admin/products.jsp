<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="vo.product_cat_vo" import="dao.product_cat" import="java.util.*"%>
   
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
					<h3>Create Products</h3>
					
					<form action="../products_insert" method="post">
						<div class="row">
							<div class="col-sm-6">
								<label>Title</label>
								<input type="text" class="form-control" name="title" placeholder="Enter title here">
							</div>
							<div class="col-sm-6">
								<label>Cost</label>
								<input type="text" class="form-control" name="cost" placeholder="Enter Cost here">
							</div>
						</div>	
							<div class="row">
								<div class="col-sm-6">
									<label>Quantity</label>
									<input type="text" class="form-control" name="quantity" placeholder="Enter Quantity here">
								</div>
								<div class="col-sm-6">
									<label>Select product category</label>
										<select name="product_category_id" class="form-control">
									<%
									product_cat d1=new product_cat();
									product_cat_vo p=new product_cat_vo();
									
									
									List<product_cat_vo> li= d1.getAll(p);
									
									//HttpSession session= request.getSession();
									session.setAttribute("list", li);
									%>
									<%@ taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>

										<x:forEach items="${sessionScope.list}" var="i">
										 
										 	<option value="${i.id}">${i.title}</option>
										</x:forEach>
									</select>
							
							</div>
						</div>	
								<div class="row">
									<div class="col-sm-12">
									<br>
									<label>Description</label>
									<textarea name="description" class="form-control" ></textarea>
									</div>
								</div>	
						
								<div class="row">
									<div class="col-sm-12">
									<br>
										<center><button class="btn btn-success" style="width:25%">Save</button></center>
									</div>
								</div>	
					</form>
					
					<form action="../allproducts" method="get">
						<input type="submit" value="show all products">
					</form>
			</div>
		</div>
	</div>
</body>
</html>