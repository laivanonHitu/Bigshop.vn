<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Bigshop HTML Template</title>
<link href="assets/web/image/favicon.png" rel="icon" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- CSS Part Start-->
<link rel="stylesheet" type="text/css" href="assets/web/css/stylesheet.css" />
<link rel="stylesheet" type="text/css" href="assets/web/css/slideshow.css" media="screen" />
<link rel="stylesheet" type="text/css" href="assets/web/css/colorbox.html" media="screen" />
<link rel="stylesheet" type="text/css" href="assets/web/css/carousel.css" media="screen" />
<!-- CSS Part End-->
<!-- JS Part Start-->
<script type="text/javascript" src="assets/web/js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="assets/web/js/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="assets/web/js/jquery.jcarousel.min.js"></script>
<script type="text/javascript" src="assets/web/js/colorbox/jquery.colorbox-min.js"></script>
<script type="text/javascript" src="assets/web/js/tabs.js"></script>
<script type="text/javascript" src="assets/web/js/jquery.easing-1.3.min.js"></script>
<script type="text/javascript" src="assets/web/js/cloud_zoom.js"></script>
<script type="text/javascript" src="assets/web/js/custom.js"></script>
<script type="text/javascript" src="assets/web/js/jquery.dcjqaccordion.js"></script>
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
				<jsp:include page="/WEB-INF/views/product/Categories.jsp" />
				<jsp:include page="/WEB-INF/views/product/Latest.jsp" />
				<jsp:include page="/WEB-INF/views/product/Specials.jsp" />
			</div>
			<div id="content">
					 <p class="welcome">" The clean and modern look allows you to&nbsp; use the theme for every kind of eCommerce online shop. Great Looks on Desktops, Tablets and Mobiles."</p>
				      <!--Slideshow Part Start-->
				      <div class="slider-wrapper">
				        <div id="slideshow" class="nivoSlider"> <a href="assets/web/#"><img src="assets/web/image/slider/slider-1.jpg" alt="slideshow-1" /></a> <a href="assets/web/#"><img src="assets/web/image/slider/slider-2.jpg" alt="slideshow-2" /></a> <a href="assets/web/#"><img src="assets/web/image/slider/slider-3.jpg" alt="slideshow-3" /></a> <a href="assets/web/#"><img src="assets/web/image/slider/slider-4.jpg" alt="slideshow-4" /></a> </div>
				      </div>
					<script type="text/javascript">
					$(document).ready(function() {
						$('#slideshow').nivoSlider();
					});
					</script>
					<jsp:include page="/WEB-INF/views/product/Featured.jsp" />
				</div>
		 	<div class="clear"></div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/shere_view/footer.jsp" />
</body>
</html>