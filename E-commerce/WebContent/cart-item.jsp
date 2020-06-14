<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="vo.*" import="dao.productsdao" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A-SHOP</title>
	<link rel="stylesheet" href="css/common.css">
	<%@include file="common/cdn.jsp"%>
</head>
<body>

	<%@include file="common/header.jsp"%>
		
		<div class="container-fluid">
			<table class="table table-bordered">
				<tr>
					<th>#</th>
					<th>Id</th>
					<th>Name</th>
					<th>Cost</th>
				</tr>
			<%
			if(session.getAttribute("addtocart") !=null){
				ListIterator lit =((List) session.getAttribute("addtocart")).listIterator();
				productsdao pd=new productsdao();
				int a=0;
				int total=0;
				while(lit.hasNext()){
					a++;
					int id= Integer.parseInt((String)lit.next());
				
					 products p1=pd.getone(id);
					
					total+=p1.getCost();
			%>
					<tr>
					<td><%=a%></td>
					<td><%= p1.getId() %></td>
					<td><%= p1.getTitle() %></td>
					<td><%= p1.getCost() %></td>
					</tr>
				<%	
				}
				%>
					<tr>
						<td colspan="3"]><strong>Total</strong> </td>
						<td><%=total %></td>
					</tr>
					<tr>
						<td style="text-align: center" colspan="4"><button class="btn btn-success">Pay Now</button></td>
					</tr>
				<%	
			}
			 	%>
			 
			</table>
		</div>
		
		<%@include file="common/footer.jsp"%>
</body>
</html>	