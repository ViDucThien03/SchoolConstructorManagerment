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
	<div class="col-lg-6">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Thêm tài nguyên</h5>

              <!-- Vertical Form -->
              <form class="row g-3" action="/SchoolConstructorManagement/updateresource"
					method="post">
				<c:set var="rs" value="${requestScope.resource }"></c:set>
                <div class="col-12">
                  <label class="form-label">Mã tài nguyên</label>
                  <input type="text" class="form-control" name="resourceId" value="${resource.resourceId }" readonly="readonly">
                </div>
                <div class="col-12">
                  <label class="form-label">Tên tài nguyên</label>
                  <input type="text" class="form-control" name="resourceName" value="${resource.resourceName }">
                </div>
                <div class="col-12">
                  <label  class="form-label">Số lượng hiện tại</label>
                  <input type=text class="form-control" name="currentQuantity" value="${resource.currentQuantity }">
                </div>
                <div class="col-12">
                  <label class="form-label">Số lượng dự kiến</label>
                  <input type="text" class="form-control" name="estimatedQuantity" value="${resource.estimatedQuantity }">
                </div>
                <div class="col-12">
                  <label class="form-label">Mô tả</label>
                  <input type="text" class="form-control"  name="resourceDescription" value="${resource.resourceDescription }">
                </div>
                
                <div class="col-12">
                  <label class="form-label">Loại tài nguyên</label>
                  <input type="text" class="form-control" name="typeId" value="${resource.typeId }">
                </div>
                <div class="col-12">
                  <label  class="form-label">Mã dự án</label>
                  <input type="text" class="form-control"  name="projectId" value="${resource.projectId }" readonly="readonly">
                </div>
                <div class="text-center">
                  <button type="submit" class="btn btn-primary">Cập nhật</button>
                  <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
              </form><!-- Vertical Form -->

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
	<script>
</script>
	<!-- Template Javascript -->
	<script src="${url }/assets/js/main.js"></script>
</body>

</html>