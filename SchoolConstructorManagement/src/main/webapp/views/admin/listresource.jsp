<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
    <link href="${url }assets/img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap" rel="stylesheet">
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="${url }assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="${url }assets/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="${url }assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="${url }assets/css/style.css" rel="stylesheet">
    
</head>

<body>
    <%@include file="layout/header.jsp"%>
	<%@include file="layout/sidebar.jsp"%>

            <!-- Table Start -->
            <div class="container-fluid pt-4 px-4">
                <div class="row g-4">
                    <div class="col-12">
                        <div class="bg-light rounded h-100 p-4">
                            <h6 class="mb-4">Bảng nguồn lực</h6>
                            <div class="table-responsive">
                            	<a href="addresource" class="btn btn-outline-primary m-2">Thêm mới</a>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th scope="col">Mã nguồn lực</th>
                                            <th scope="col">Tên nguồn lực</th>
                                            <th scope="col">Số lượng dự kiến</th>
                                            
                                            <th scope="col">Giá dự kiến tài nguyên</th>
                                            <th scope="col">Tổng giá dự kiến</th>
                                            <th scope="col">Mô tả</th>
                                            <th scope="col">Chức năng</th>
                                          
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="rs" items="${requestScope.resources }">
                                        	<tr>
                                            	<th scope="row">${rs.resourceId }</th>
                                            	<td>${rs.resourceName }</td>
                                            	<td>${rs.estimatedQuantity }</td>
                                            	
                                            	<td>${rs.resourceDescription }</td>
                                            	<td>${rs.expectedAmount }</td>
                                            	<td>${rs.expectedTotal }</td>
                                            	<td>
                                            		<a href="updateresource?resourceId=${rs.resourceId}">Sửa |</a> 
													<a href="#" onclick="deleteResource('${rs.resourceId}','${rs.typeId }');">Xóa</a>
                                            	</td>
                                        	</tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>	
            <!-- Table End -->

			<%@include file="layout/footer.jsp"%>
            <!-- Footer Start -->
         
        <!-- Content End -->


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="${url }assets/lib/chart/chart.min.js"></script>
    <script src="${url }assets/lib/easing/easing.min.js"></script>
    <script src="${url }assets/lib/waypoints/waypoints.min.js"></script>
    <script src="${url }assets/lib/owlcarousel/owl.carousel.min.js"></script>
    <script src="${url }assets/lib/tempusdominus/js/moment.min.js"></script>
    <script src="${url }assets/lib/tempusdominus/js/moment-timezone.min.js"></script>
    <script src="${url }assets/lib/tempusdominus/js/tempusdominus-bootstrap-4.min.js"></script>

    <!-- Template Javascript -->
    <script src="${url }	assets/js/main.js"></script>
    <script>
		function deleteResource(resourceId,typeId) {
			console.log("Type ID: " + typeId);
			let ans = confirm("Bạn có đồng ý xóa?");
			if(ans && typeId){
				window.location = "deleteresource?resourceId="+resourceId+"&typeid="+typeId;
			}
		}
	</script>
</body>

</html>