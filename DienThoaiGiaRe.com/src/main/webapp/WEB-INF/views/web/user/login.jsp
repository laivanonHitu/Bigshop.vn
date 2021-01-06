<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Bigshop HTML Template</title>
<link href="assets/web/image/favicon.png" rel="icon" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- CSS Part Start-->
<link rel="stylesheet" type="text/css"
	href="assets/web/css/stylesheet.css" />
<link rel="stylesheet" type="text/css"
	href="assets/web/css/slideshow.css" media="screen" />
<link rel="stylesheet" type="text/css"
	href="assets/web/css/colorbox.html" media="screen" />
<link rel="stylesheet" type="text/css"
	href="assets/web/css/carousel.css" media="screen" />
<!-- CSS Part End-->
<!-- JS Part Start-->
<script type="text/javascript" src="assets/web/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="assets/web/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript"
	src="assets/web/js/jquery.jcarousel.min.js"></script>
<script type="text/javascript"
	src="assets/web/js/colorbox/jquery.colorbox-min.js"></script>
<script type="text/javascript" src="assets/web/js/tabs.js"></script>
<script type="text/javascript"
	src="assets/web/js/jquery.easing-1.3.min.js"></script>
<script type="text/javascript" src="assets/web/js/cloud_zoom.js"></script>
<script type="text/javascript" src="assets/web/js/custom.js"></script>
<script type="text/javascript"
	src="assets/web/js/jquery.dcjqaccordion.js"></script>
<!-- JS Part End-->
</head>
<body>

	<div class="main-wrapper">
		<jsp:include page="/WEB-INF/views/shere_view/header.jsp" />
		<jsp:include page="/WEB-INF/views/shere_view/menu.jsp" />
		<!--Top Navigation Start-->
		<div id="container">
			<!--Left Part-->
			<div id="column-left">
				<jsp:include page="/WEB-INF/views/web/product/Categories.jsp" />
				<jsp:include page="/WEB-INF/views/web/product/Latest.jsp" />
				<jsp:include page="/WEB-INF/views/web/product/Specials.jsp" />
			</div>
			<div id="content">
				<div id="content">
					<!--Breadcrumb Part Start-->
					<div class="breadcrumb">
						<a href="index-2.html">Home</a> » <a href="#">Account</a> » <a
							href="login.html">Login</a>
					</div>
					<!--Breadcrumb Part End-->
					<h1>Account Login</h1>
					<div class="login-content">
						<div class="left">
							<h2>Chưa có tài khoản</h2>
							<div class="content">
								<p>
									<b>Tạo tài khoản ngay</b>
								</p>
								<p>Trở thành thành viên cùng với chúng tôi để tham gia nhiều
									sự kiện hấp dẫn</p>
								<a class="button" href='<c:url value="/dang-ky-tai-khoan"/>'>Tiếp
									tục</a>
							</div>
						</div>
						<div class="right">
							<h2>Đăng nhập</h2>
							<%-- <form method="post"
								action="${pageContext.request.contextPath}/thuc-hien-dang-nhap">
								<div class="content">
									<b>Tên tài khoản:</b><br>
									<input name="uname" type="text" placeholder="nhập tên tài khoản" />
									<br> <br> <b>Mật khẩu:</b><br>
									<input name="upwd"  type="password" placeholder="nhập tên mật khẩu"/>
									<br> <br> Quên mật khẩu? <a href="#"
										style="color: red">Nhấp vào đây</a><br> <br> <input
										type="submit" class="button" value="Đăng nhập">
								</div>
							</form> --%>

							<form:form modelAttribute="user" method="post"
								action="${pageContext.request.contextPath}/thuc-hien-dang-nhap">
								<div class="content">
									<b>Tên tài khoản:</b><br> <input name="uname" type="text"
										placeholder="nhập tên tài khoản" /> <br> <br> <b>Mật
										khẩu:</b><br> <input name="upwd" type="password"
										placeholder="nhập tên mật khẩu" /> <br> <br> Quên
									mật khẩu? <a href="#" style="color: red">Nhấp vào đây</a><br>
									<br> <input type="submit" class="button" value="Đăng nhập">
								</div>
							</form:form>




							<%-- <form enctype="multipart/form-data"
								method="post" action="<c:url value="/login-user"/>">
								<div class="content">
									<p>I am a returning customer</p>
									<b>E-Mail Address:</b><br>
									<input type="text" placeholder="nhập tên tài khoản" name="user">
									<br> <br> <b>Password:</b><br>
									<input type="password" placeholder="nhập tên mật khẩu" name="password">
									<br> <br> <a href="#">Forgotten Password</a><br>
									<br> <input type="submit" class="button" value="Login" >
								</div>
							</form> --%>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/shere_view/footer.jsp" />
</body>
</html>