<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div id="menu">
	<span>Menu</span>
	<ul>
		<li class="home"><a title="Home" href="<c:url value="/home"/>"><span>Home</span></a></li>
		<li><a href="category.html">Điện thoại</a>
			<div>
				<ul>
					<c:forEach items="${category}" var="items" varStatus="index">
						<li><a href="<c:url value="#"/>">${items.getName() }</a></li>
					</c:forEach>
				</ul>
			</div></li>
		<li><a href="<c:url value="#"/>">Tin tức</a></li>
		<li><a href="<c:url value="#"/>">Khuyến mại</a></li>
		<li><a href="<c:url value="#"/>">Chăm sóc khách hàng</a></li>
		<li><a href="<c:url value="#"/>">Liên hệ</a></li>
		<li><a href="<c:url value="#"/>">Dịch vụ</a></li>
	</ul>
</div>