<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.widetech.training.domain.Order"%>




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
		test
		</thead>
		<tbody>
			
			
			<c:forEach items="${order}" var="p">
				<tr>
					<td>${p.createdAt}</td>
					<td></td>
					</td>
				</tr>
			</c:forEach>



		</tbody>
	</table>
</body>
</html>