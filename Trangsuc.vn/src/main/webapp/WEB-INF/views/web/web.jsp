<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<title>Trang chủ</title>
<body>

	<!-- 
Body Section 
-->
	<div class="row">

		<%@include file="/WEB-INF/views/layouts/web/category.jsp"%>
		<div class="span9">
			<div class="well np">
				<div id="myCarousel" class="carousel slide homCar">

					<div class="carousel-inner">
						<c:forEach var="item" items="${ slides }" varStatus="index">
							<c:if test="${ index.first }">
								<div class="item active">
							</c:if>
							<c:if test="${ not index.first }">
								<div class="item">
							</c:if>
							<img style="width: 100%"
								src="<c:url value="/assets/user/img/slide/${item.image}"/>"
								alt="bootstrap ecommerce templates">
							<div class="carousel-caption">
								<h4>${ item.title }</h4>
								<p>
									<span>${ item.content }</span>
								</p>
							</div>
					</div>
					</c:forEach>
				</div>

				<a class="left carousel-control" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
		</div>
		<!--
New Products
-->
		<div class="well well-small">
			<h3>Sản phẩm mới</h3>
			<hr class="soften" />
			<div class="row-fluid">
				<div id="newProductCar" class="carousel slide">
					<div class="carousel-inner">
						<div class="item active">
							<ul class="thumbnails">
								<c:forEach var="item" items="${products}" varStatus="loop"
									begin="0" end="3">
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool"
												href="<c:url value="/details-product/${ item.id_product }"/>"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="#" class="tag"></a> <a
												href="<c:url value="/details-product/${ item.id_product }"/>"><img
												src="<c:url value="/assets/user/img/${ item.img }"/>"
												alt="bootstrap-ring"></a>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>

						<div class="item">
							<ul class="thumbnails">
								<c:forEach var="item" items="${products}" varStatus="loop"
									begin="0" end="3">
									<li class="span3">
										<div class="thumbnail">
											<a class="zoomTool" href="product_details.html"
												title="add to cart"><span class="icon-search"></span>
												QUICK VIEW</a> <a href="#" class="tag"></a> <a
												href="<c:url value="/details-product/${ item.id_product }"/>"><img
												src="<c:url value="/assets/user/img/${ item.img }"/>"
												alt="bootstrap-ring"></a>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
					<a class="left carousel-control" href="#newProductCar"
						data-slide="prev">&lsaquo;</a> <a class="right carousel-control"
						href="#newProductCar" data-slide="next">&rsaquo;</a>
				</div>
			</div>

		</div>
		<!--
	Featured Products
	-->
		<div class="well well-small">
			<h3>
				<a class="btn btn-mini pull-right"
					href="<c:url value="/details-product/${ item.id_product }"/>"
					title="View more">VIew More<span class="icon-plus"></span></a> 
					Sản phẩn nổi bật
			</h3>
			<hr class="soften" />
			<div class="row-fluid">

				<c:if test="${ products.size() > 0 }">
					<ul class="thumbnails">

						<c:forEach var="item" items="${ products }" varStatus="loop">
							<li class="span4">
								<div class="thumbnail">
									<a class="zoomTool" href="#" title="add to cart"><span
										class="icon-search"></span> QUICK VIEW</a> <a
										href="<c:url value="/details-product/${ item.id_product }"/>"><img
										src="<c:url value="/assets/user/img/${ item.img }"/>" alt=""></a>
									<div class="caption">
										<h5>${ item.name }</h5>
										<h4>  
											<a class="defaultBtn" href="product_details.html"
												title="Click to view"><span class="icon-zoom-in"></span></a>
											<a class="shopBtn" href="<c:url value="AddCart/${ item.id_product }"/>" title="add to cart"><span
												class="icon-plus"></span></a> <span class="pull-right"><fmt:formatNumber
													type="number" groupingUsed="true" value="${ item.price }" />₫</span>
										</h4>
									</div>
								</div>
							</li>

							<c:if
								test="${ (loop.index + 1) % 3 == 0 || (loop.index + 1)  == products.size() }">
					</ul>
					<c:if test="${ (loop.index + 1) < products.size() }">
						<ul class="thumbnails">
					</c:if>
				</c:if>

				</c:forEach>

				</c:if>

			</div>
		</div>
		<hr>
		<div class="well well-small">
			<a class="btn btn-mini pull-right" href="#">Xem thêm <span
				class="icon-plus"></span></a> Tất cả sản phẩm
		</div>
	</div>
	</div>

</body>
