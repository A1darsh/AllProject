
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="Head.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>12222222222123477
</head>
<body bgcolor="blue">
	<%
      int i=Integer.parseInt(request.getParameter("num1"));
      int j=Integer.parseInt(request.getParameter("num2"));
      int k=i+j;
      out.print("the sum is:"+k);
   	int con=12;
      %><br>
     the con is: <%=con %>
</body>
</html>