<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div class="box">
	<div class="box-heading">Danh mục</div>
	<div class="box-content box-category">
		<ul id="custom_accordion">
			<c:forEach items="${category}" var="items" varStatus="index">
				<li><a href="<c:url value="dien-thoai/${items.getId() }"/>">${items.getName() }</a></li>
			</c:forEach>
		</ul>
	</div>
</div>