<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Product- Bigshop HTML Template</title>
<link href="assets/web/image/favicon.png" rel="icon" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<!-- CSS Part Start-->
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
		<jsp:include page="/WEB-INF/views/shere_view/menu.jsp" />
		<!--Top Navigation Start-->
		<div id="container">
			<!--Left Part-->
			<div id="column-left">
				<jsp:include page="/WEB-INF/views/web/product/Categories.jsp" />
				<jsp:include page="/WEB-INF/views/web/product/Latest.jsp" />
				<jsp:include page="/WEB-INF/views/web/product/Specials.jsp" />
			</div>
			<!--Left End-->
			<!--Middle Part Start-->
			<div id="content">
				<!--Breadcrumb Part Start-->
				<div class="breadcrumb">
					<a href="<c:url value="/home"/>">Trang chủ</a> » <a
						href="<c:url value="/home"/>">Chi tiết sản phẩm</a>
				</div>
				<!--Breadcrumb Part End-->
				<div class="product-info">
					<div class="left">
						<div class="image">
							<a
								href="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								title="${product.image }" class="cloud-zoom colorbox" id='zoom1'
								rel="adjustX: 0, adjustY:0, tint:'#000000',tintOpacity:0.2, zoomWidth:360, position:'inside', showTitle:false">
								<img
								src="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								title="${product.image }" alt="#" id="image" height="300" /><span
								id="zoom-image"><i class="zoom_bttn"></i> Hiển thị chi
									tiết</span>
							</a>
						</div>

						<div class="image-additional">
							<a
								href="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								title="#" class="cloud-zoom-gallery"
								rel="useZoom: 'zoom1', smallImage: 'image/product/iphone_1_350x350.jpg'">
								<img
								src="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								width="62" title="#" alt="#" />
							</a> <a
								href="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								title="#" class="cloud-zoom-gallery"
								rel="useZoom: 'zoom1', smallImage: 'image/product/htc_touch_hd_1_350x350.jpg' ">
								<img
								src="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								width="62" title="#" alt="#" />
							</a> <a
								href="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								title="#" class="cloud-zoom-gallery"
								rel="useZoom: 'zoom1', smallImage: 'image/product/htc_touch_hd_11_350x350.jpg' ">
								<img
								src="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								width="62" title="#" alt="#" />
							</a> <a
								href="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								title="#" class="cloud-zoom-gallery"
								rel="useZoom: 'zoom1', smallImage: 'image/product/iphone_2_350x350.jpg' ">
								<img
								src="${pageContext.request.contextPath}/assets/web/image/product/${product.image }"
								width="62" title="#" alt="#" />
							</a>
						</div>
					</div>
					<div class="right">
						<h1>${product.name}</h1>
						<div class="description">
							<span>Thương hiệu:</span> <a href="#">${product.brand }</a><br>
							<span> Mã sản phẩm:</span> ${product.productCode }<br> <span>Số
								lượng chỉ còn:</span> ${product.inventory }
						</div>
						<div class="price">
							Giá niêm yết: <span class="price-old"><fmt:formatNumber
									type="number" maxIntegerDigits="10" value="${product.price }" /></span>₫
							<div class="price-tag">
								<fmt:formatNumber type="number" maxIntegerDigits="10"
									value="${product.priceDis }" />
								₫
							</div>
						</div>
						<div class="cart">
							<div>
								<div class="qty">
									<strong>Qty:</strong> <a href="javascript:void(0);"
										class="qtyBtn mines">-</a> <input type="text" value="1"
										size="2" name="quantity" class="w30" id="qty"> <a
										href="javascript:void(0);" class="qtyBtn plus">+</a>
									<div class="clear"></div>
								</div>
								<input type="button" class="button" id="button-cart"
									value="Add to Cart">
							</div>
							<div>
								<span>&nbsp;&nbsp;&nbsp;- OR -&nbsp;&nbsp;&nbsp;</span>
							</div>
							<div>
								<a href="#" class="wishlist">Add to Wish List</a><br> <a
									href="#" class="wishlist">Add to Compare</a>
							</div>
						</div>
						<div class="review">
							<div>
								<img alt="0 reviews"
									src="${pageContext.request.contextPath}/assets/web/image/stars-3.png">&nbsp;&nbsp;<a
									onClick="$('a[href=\'#tab-review\']').trigger('click');">0
									reviews</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
									onClick="$('a[href=\'#tab-review\']').trigger('click');">Write
									a review</a>
							</div>
						</div>

						<!-- AddThis Button BEGIN -->
						<div class="addthis_toolbox addthis_default_style ">
							<a class="addthis_button_facebook_like"
								fb:like:layout="button_count"></a> <a
								class="addthis_button_tweet"></a> <a
								class="addthis_button_pinterest_pinit"></a> <a
								class="addthis_counter addthis_pill_style"></a>
						</div>
						<script type="text/javascript"
							src="../../../s7.addthis.com/js/300/addthis_widget.js#pubid=xa-506f325f57fbfc95"></script>
						<!-- AddThis Button END -->
						<div class="tags">
							<b>Tags:</b>
							<c:forEach items="${category}" var="items">
								<a href="#">${items.getName()}</a> 
							</c:forEach>
						</div>
					</div>
				</div>
				<!-- Tabs Start -->
				<div id="tabs" class="htabs">
					<a href="#tab-description">Mô tả sản phẩm</a> <a href="">Nhận
						xét từ khách hàng</a> <a href="#tab-review">Đánh giá sản phẩm
						riêng bạn</a>
				</div>
				<div id="tab-description" class="tab-content">
					<h3>Nổi bật:</h3>
					${product.shortDecription}
				</div>
				<div class="tab-content" id="tab-review">
					<div class="review-list">
						<div class="author">
							<b>Harnish</b> on 13/02/2013
						</div>
						<div class="rating">
							<img alt="1 reviews" src="image/stars-3.png">
						</div>
						<div class="text">Lorem Ipsum is simply dummy text of the
							printing and typesetting industry. Lorem Ipsum has been the
							industry's standard dummy text ever since the 1500s, when an
							unknown printer took a galley of type and scrambled.</div>
					</div>
					<h2 id="review-title">Write a review</h2>
					<br> <b>Your Name:</b><br> <input type="text" value=""
						name="name"> <br> <br> <b>Your Review:</b>
					<textarea style="width: 98%;" rows="8" cols="40" name="text"></textarea>
					<span style="font-size: 11px;"><span style="color: #FF0000;">Note:</span>
						HTML is not translated!</span><br> <br> <b>Rating:</b>&nbsp; <input
						type="radio" value="1" name="rating"> &nbsp; <input
						type="radio" value="2" name="rating"> &nbsp; <input
						type="radio" value="3" name="rating"> &nbsp; <input
						type="radio" value="4" name="rating"> &nbsp; <input
						type="radio" value="5" name="rating"> <br> <br>
					<div class="buttons">
						<div class="right">
							<a class="button" id="button-review">Continue</a>
						</div>
					</div>
				</div>
				<div class="tab-content" id="tab-review">
					<h1>làm phần nhận xét</h1>
				</div>
				<div class="clear"></div>
				<!-- Tabs End -->
				<!-- Related Products Start -->
				<div class="box">
					<div class="box-heading">Sản phẩm liên quan (4)</div>
					<div class="box-content">
						<div class="box-product">
							<div>
								<div class="image">
									<a href="product.html"><img alt="iPad Classic"
										src="image/product/ipod_classic_1-152x152.jpg"></a>
								</div>
								<div class="name">
									<a href="product.html">iPad Classic</a>
								</div>
								<div class="price">
									<span class="price-old">$119.50</span> <span class="price-new">$107.75</span>
								</div>
								<a class="button">Add to Cart</a>
							</div>
							<div>
								<div class="image">
									<a href="product.html"><img alt="Sports Watch Band"
										src="image/product/samsung_syncmaster_941bw-152x152.jpg"></a>
								</div>
								<div class="name">
									<a href="product.html">Sports Watch Band</a>
								</div>
								<div class="price">
									<span class="price-new">$95.00</span>
								</div>
								<a class="button">Add to Cart</a>
							</div>
							<div>
								<div class="image">
									<a href="product.html"><img alt="iPhone"
										src="image/product/iphone_1-152x152.jpg"></a>
								</div>
								<div class="name">
									<a href="product.html"></a>
								</div>
								<div class="price">
									<span class="price-old">$109.50</span> <span class="price-new">$101.50</span>
								</div>
								<a class="button">Add to Cart</a>
							</div>
							<div>
								<div class="image">
									<a href="product.html"><img alt="Casual Saddle Shoes"
										src="image/product/hp_1-152x152.jpg"></a>
								</div>
								<div class="name">
									<a href="product.html">Casual Saddle Shoes</a>
								</div>
								<div class="price">
									<span class="price-new">$95.00</span>
								</div>
								<a class="button">Add to Cart</a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
			<div class="social-part">
				<!--Facebook Fun Box Start-->
				<div id="facebook">
					<div class="facebook-inner">
						<div id="fb-root"></div>
						<script>
							(function(d, s, id) {
								var js, fjs = d.getElementsByTagName(s)[0];
								if (d.getElementById(id))
									return;
								js = d.createElement(s);
								js.id = id;
								js.src = "../../../connect.facebook.net/en_US/all.js#xfbml=1";
								fjs.parentNode.insertBefore(js, fjs);
							}(document, 'script', 'facebook-jssdk'));
						</script>
						<div class="fb-like-box"
							data-href="http://www.facebook.com/160281810726316"
							data-width="585" data-show-faces="true" data-stream="false"
							data-header="false" data-border-color="#fff"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/shere_view/footer.jsp" />
</body>
</html>