<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div class="box">
	<h1>số lượng sản phẩm: ${products.size()}</h1>
	<div class="box-heading">Sản phẩm nổi bật</div>
	<div class="box-content">
		<div class="box-product">

			<c:forEach items="${ProductBycategory}" var="items">
				<div>
					<div class="image">
						<a href="<c:url value="chi-tiet-san-pham/${items.getId()}"/>"><img
							src="assets/web/image/product/${items.getImage()}"
							alt="Fancy Saddle" height="100" /></a>
					</div>
					<div class="name">
						
					</div>
					<div class="name-product"><a href="<c:url value="/chi-tiet-san-pham/${items.getId()}"/>">${items.getName() }</a></div>
					<div class="price">
						<fmt:formatNumber type="number" maxFractionDigits="10"
							value="${items.getPrice() }" />
						₫
					</div>
					<div class="rating">
						<img src="assets/web/image/stars-2.png" alt="Based on 0 reviews." />
					</div>
					<div class="cart">
						<a href="${pageContext.request.contextPath}/them-vao-gio-hang/${items.getId()}"
							onClick="addToCart('43');" class="button">Add to Cart</a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>
</div>