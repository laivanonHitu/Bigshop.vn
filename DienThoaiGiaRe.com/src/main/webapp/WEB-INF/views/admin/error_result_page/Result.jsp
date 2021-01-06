<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>File Upload Result</title>
</head>
<body>
    <center>
        <h2>The file(s) was uploaded successfully!</h2>
        <h3><a href="${pageContext.request.contextPath}/admin">go to home page admin</a></h3>
        <img alt="" src="${path}/${image}">
        <img alt="" src="${pageContext.request.contextPath}/assets/web/image/product/${product.image}">
    </center>
</body>
</html>