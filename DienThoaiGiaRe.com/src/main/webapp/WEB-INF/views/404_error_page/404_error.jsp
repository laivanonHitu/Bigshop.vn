<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Free 404 White for Iphone, Android & Smartphone Mobile
	Website Template | Home :: w3layouts</title>
<style type="text/css">
.logo {
	width: 430px;
	position: absolute;
	top: 25%;
	left: 35%;
}
</style>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/web/css/stylesheet.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/web/css/slideshow.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/web/js/colorbox/colorbox.css"
	media="screen" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/assets/web/css/carousel.css"
	media="screen" />
<!-- CSS Part End-->
<!-- JS Part Start-->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/jquery.jcarousel.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/colorbox/jquery.colorbox-min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/tabs.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/jquery.easing-1.3.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/cloud_zoom.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/custom.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/assets/web/js/jquery.dcjqaccordion.js"></script>
<!-- JS Part End-->
</head>
<body>
	<div class="main-wrapper">
		<jsp:include page="/WEB-INF/views/shere_view/header.jsp" />
		<div class="clear"></div>
		<hr/>
		<h1>TRANG WEB KHÔNG TỒN TẠI</h1>
		<div class="logo">
			<img src="assets/web/images_error/404.png" alt="" />
			<p>
				<a href="<c:url value="/home"/>">QUAY VỀ TRANG CHỦ</a>
			</p>
		</div>
	</div>
	
	<jsp:include page="/WEB-INF/views/shere_view/footer.jsp" />
</body>
</html>
