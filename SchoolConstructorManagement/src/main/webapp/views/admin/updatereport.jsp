<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600;700&display=swap"
                rel="stylesheet">

            <!-- Icon Font Stylesheet -->
            <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

            <!-- Libraries Stylesheet -->
            <link href="${url }/assets/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
            <link href="${url }/assets/lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

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

                th,
                td {
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
            <%@include file="layout/header.jsp" %>
                <%@include file="layout/sidebar.jsp" %>
                    <div class="col-lg-12">

                        <div class="card">
                            <div class="card-body">
                                
                                <form class="row g-3" action="/SchoolConstructorManagement/updatereport" method="post">
                                <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">Mã báo cáo</label>
                                        <input type="text" class="form-control" id="exampleFormControlTextarea1"
                                            name="reportId" value="${report.reportId }" readonly="readonly">
                                    </div>
                                	<div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">Tên báo cáo</label>
                                        <input type="text" class="form-control" id="exampleFormControlTextarea1"
                                            name="reportName" value="${report.reportName }">
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">Ngày viết báo cáo</label>
                                        <input type="date" class="form-control" id="exampleFormControlTextarea1"
                                            name="reportDate" value="${report.reportDate }">
                                    </div>
                                    <h2>Tiến Độ Dự Án Dự Kiến</h2>
                                    <p>Mô tả tổng quan về tiến độ dự kiến của dự án.</p>
                                    <c:set var="rp" value="${requestScope.report }"></c:set>
                                    <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">
                                        </label>
                                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"
                                            name="reportProgress">${report.reportProgress }</textarea>
                                    </div>
                                    <h2>Tài Nguyên Nguồn Lực</h2>
                                    <p>Mô tả tình trạng sử dụng nhân sự và vật liệu theo kế hoạch.</p>

                                    <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">
                                        </label>
                                        <textarea class="form-control" id="exampleFormControlTextarea1"
                                            rows="3" name="reportResource">${report.reportResource }</textarea>
                                    </div>
                                    <h2>Thách Thức và Mối Nguy</h2>
                                    <p>Mô tả bất kỳ thách thức hoặc mối nguy nào có thể ảnh hưởng
                                        đến tiến trình dự án.</p>

                                    <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">
                                        </label>
                                        <textarea class="form-control" id="exampleFormControlTextarea1"
                                            rows="3" name="challenge">${report.challenge }</textarea>
                                    </div>

                                    <h2>Kế Hoạch Tiếp Theo và Dự Kiến</h2>
                                    <p>Nêu rõ kế hoạch tiếp theo của dự án.</p>

                                    <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">
                                        </label>
                                        <textarea class="form-control" id="exampleFormControlTextarea1"
                                            rows="3" name="nextPlan">${report.nextPlan }</textarea>
                                    </div>
                                    <h2>Tổng Kết và Đánh Giá</h2>
                                    <div class="mb-3">
                                        <label for="exampleFormControlTextarea1" class="form-label">
                                        </label>
                                        <textarea class="form-control" id="exampleFormControlTextarea1"
                                            rows="3" name="evaluation">${report.evaluation }</textarea>
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                        <button type="reset" class="btn btn-secondary">Reset</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
        </body>

        </html>