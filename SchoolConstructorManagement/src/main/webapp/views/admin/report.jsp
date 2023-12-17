<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>DASHMIN - Bootstrap Admin Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">
<c:url var="url" value="/views/admin/"></c:url>
<!-- Favicon -->
<link href="${url }/assets/img/favicon.ico" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link href="${url }/assets/lib/owlcarousel/assets/owl.carousel.min.css"
	rel="stylesheet">
<link
	href="${url }/assets/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css"
	rel="stylesheet" />

<!-- Customized Bootstrap Stylesheet -->
<link href="${url }/assets/css/bootstrap.min.css" rel="stylesheet">

<!-- Template Stylesheet -->
<link href="${url }/assets/css/style.css" rel="stylesheet">
<style>
body {
	font-family: Arial, sans-serif;
	margin: 20px;
}

h1 {
	color: #333;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: left;
}

th {
	background-color: #f2f2f2;
}
</style>
</head>
<body>
	<%@include file="layout/header.jsp"%>
	<%@include file="layout/sidebar.jsp"%>
	<div class="col-lg-12">

		<div class="card">
			<div class="card-body">
			<c:set var="rp" value="${requestScope.report }"></c:set>
				<h1>${rp.reportName }</h1> 
				<p>Ngày viết báo cáo: ${rp.reportDate }</p>
				
				<h2>Tiến Độ Dự Án Dự Kiến</h2>
				
				<pre style="font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">${rp.reportProgress }</pre>

				<h2>Tài Nguyên Nguồn Lực</h2>
				

				<pre>${rp.reportResource }</pre>
					
					
				
				<h2>Thách Thức và Mối Nguy</h2>
				

				<pre>
					${rp.challenge }
				</pre>

				<h2>Kế Hoạch Tiếp Theo và Dự Kiến</h2>
				

				<pre>
					${rp.nextPlan }
				</pre>

				<h2>Tổng Kết và Đánh Giá</h2>
				<pre>${rp.evaluation }</pre>
			</div>
		</div>
	</div>
</body>
</html>