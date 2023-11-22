<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

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
</head>

<body>
	<%@include file="layout/header.jsp"%>
	<%@include file="layout/sidebar.jsp"%>
	<div class="container-xxl position-relative bg-white d-flex p-0">
		<!-- Chart Start -->
		<div class="container-fluid pt-4 px-4">
			<div class="card">
			<div class="card-body">
				<h5 class="card-title">Thêm công việc</h5>

				<!-- Multi Columns Form -->
				<form class="row g-3" action="/SchoolConstructorManagement/addprogress"
					method="post">
					<c:if test="${requestScope.error != null}">
						<p class="text-danger mt-2">${requestScope.error}</p>
					</c:if>
					<div class="col-md-12">
						<label class="form-label">Mã tiến trình</label> <input type="text"
							class="form-control" name="progressid">
					</div>
					<div class="col-md-6">
						<label class="form-label">Ngày cập nhật</label> <input type="date"
							class="form-control" name="updatedate">
					</div>
					<div class="col-12">
						<label class="form-label">Mô tả</label> <input type="text"
							class="form-control" name="progressdescription">
					</div>
					
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Submit</button>
					</div>
				</form>
				<!-- End Multi Columns Form -->

			</div>
		</div>
		</div>
	</div>
	<%@include file="layout/footer.jsp"%>

	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="${url }/assets/lib/chart/chart.min.js"></script>
	<script src="${url }/assets/lib/easing/easing.min.js"></script>
	<script src="${url }/assets/lib/waypoints/waypoints.min.js"></script>
	<script src="${url }/assets/lib/owlcarousel/owl.carousel.min.js"></script>
	<script src="${url }/lib/tempusdominus/js/moment.min.js"></script>
	<script src="${url }/lib/tempusdominus/js/moment-timezone.min.js"></script>
	<script
		src="${url }/assets/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

	<!-- Template Javascript -->
	<script src="${url }/assets/js/main.js"></script>
</body>

</html>