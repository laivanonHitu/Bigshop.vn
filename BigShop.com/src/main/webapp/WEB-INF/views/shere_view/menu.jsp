<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<div id="menu">
	<span>Menu</span>
	<ul>

		<li class="home"><a title="Home" href="<c:url value="/home"/>"><span>Home</span></a></li>
		<c:forEach items="${menu}" var="list" varStatus="index">
		
			<li>
				<a href="<c:url value="#"/>">${list.getTitle() }</a> 
			</li>
			
		</c:forEach>
	</ul>
</div>