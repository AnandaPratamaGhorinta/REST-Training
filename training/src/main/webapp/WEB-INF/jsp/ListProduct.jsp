<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Products</title>
<link href="<c:url value="/css/common.css"/>" rel="stylesheet"
	type="text/css">
</head>
<body>

	<style>
.customers {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 70%;
	border-radius: 30px;
	height: 50px;
	margin-top: 30px;
	margin-left: 25px;
}

.customers td, #customers th {
	border: 4px solid #ddd;
	padding: 30px;
}

.customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

.customers tr:hover {
	background-color: #ddd;
	cursos: pointer;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: center;
	background-color: #04AA6D;
	color: white;
	font-size: 24px;
}

a {
	text-decoration: none;
}
</style>

	<a href="/addProducts">ADD PRODUCT</a>
	<table class="customers">
		<thead>
			<tr>
				<th>Code</th>
				<th>Name</th>
				<th>Type</th>
				<th>Price</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${products}" var="p">
				<tr>
					<td>${p.code}</td>
					<td>${p.name}</td>
					<td>${p.type}</td>
					<td>${p.price}</td>
					<td><a href="/updateProduct/${p.id}">Update</a> ||
					<a href="/deleteProducts/${p.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>



		</tbody>
	</table>
</body>
</html>