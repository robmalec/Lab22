<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>lol steak</title>
<link rel="stylesheet" type="text/css" href="style.css">
<mvc:resources mapping="/resources/**" location="/resources/" />
</head>
<body>
	<h1>Welcome to Grand Circus Coffee!</h1>
	<a class="btn-primary" href="/regForm">Register</a>


	<table class="table" style="font-family: Comic Sans MS">
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Quantity</th>
		</tr>
		<c:forEach items="${productList }" var="pr">
			<tr>
				<td>${pr.name }</td>
				<td>${pr.description }</td>
				<td>${pr.price }</td>
				<td>${pr.quantity }</td>
				<td><a href="addOne?id=${pr.id }" class="btn btn-primary">Add
						to cart</a></td>
			</tr>
		</c:forEach>
	</table>
	<h1>Total: $${total }</h1>
	<p style="font-family: Comic Sans MS">wow</p>
	<img src="/resources/steak.png" />

</body>
</html>