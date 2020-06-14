<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<h1>User List</h1>
					<table class="table table-bordered">
						<tr>
						<th>Action</th>
						<th>Action</th>
						<th>Id</th>
						<th>Name</th>
						<th>Contact</th>
						<th>Email</th>
						<th>Role</th>
						
						</tr>
					<%@ taglib prefix="x" uri="http://java.sun.com/jstl/core_rt" %>

						<x:forEach items="${sessionScope.list}" var="i">
						 
						 	<tr>
						 	<td><a href="../delete?i=${i.id}" class="btn btn-primary">Delete</a></td>
						 	<td><a href="../edit?i=${i.id}" class="btn btn-primary">Update</a></td>
							<td>${i.id}</td>
							<td>${i.name}</td>
							<td>${i.contact}</td>
							<td>${i.email}</td>
							<td>${i.role}</td>
								
							</tr>	
						   </x:forEach>
						</table>
			</div>
		</div>
	</div>
</body>
</html>