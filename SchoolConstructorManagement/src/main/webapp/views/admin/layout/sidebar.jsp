<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Sidebar Start -->
        <div class="sidebar pe-4 pb-3">
            <nav class="navbar bg-light navbar-light">
                <a href="index.html" class="navbar-brand mx-4 mb-3">
                    <h3 class="text-primary">Công ty ABC</h3>
                </a>
                <div class="d-flex align-items-center ms-4 mb-4">
                    <div class="position-relative">
                        <img class="rounded-circle" src="${url }/assets/img/user.jpg" alt="" style="width: 40px; height: 40px;">
                        <div class="bg-success rounded-circle border border-2 border-white position-absolute end-0 bottom-0 p-1"></div>
                    </div>
                    <div class="ms-3">
                        <h6 class="mb-0">Jhon Doe</h6>
                        <span>Admin</span>
                    </div>
                </div>
                <div class="navbar-nav w-100">
                    <a href="/SchoolConstructorManagement/project"class="nav-link dropdown-toggle"><i class="fa fa-tachometer-alt me-2"></i>Quản lý dự án</a>
                    <div class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown"><i class="fa fa-laptop me-2"></i>Kế hoạch nguồn lực</a>
                        <div class="dropdown-menu bg-transparent border-0">
                            <a href="/SchoolConstructorManagement/resource?typeid=RT01" class="dropdown-item" class="bi-bi-circle">Nhân lực</a>
                            <a href="/SchoolConstructorManagement/resource?typeid=RT02" class="dropdown-item">Máy móc</a>
                            <a href="/SchoolConstructorManagement/resource?typeid=RT03" class="dropdown-item">Vật tư</a>
                        </div>
                    </div>
                    <a href="/SchoolConstructorManagement/progress" class="nav-item nav-link"><i class="fa fa-th me-2"></i>Tiến trình xây dựng</a>
                    <a href="/SchoolConstructorManagement/reportinsert" class="nav-item nav-link"><i class="fa fa-keyboard me-2"></i>Báo báo</a>
                    
                </div>
            </nav>
        </div>
        <!-- Sidebar End -->
</body>
</html>