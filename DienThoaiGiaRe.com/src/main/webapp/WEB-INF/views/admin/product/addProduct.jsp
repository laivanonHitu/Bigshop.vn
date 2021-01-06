<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<meta name="description" content="overview &amp; stats" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<meta http-equiv="Conten-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">


<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/admin/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/admin/font-awesome/4.2.0/css/font-awesome.min.css" />

<!-- page specific plugin styles -->

<!-- text fonts -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/admin/fonts/fonts.googleapis.com.css" />

<!-- ace styles -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/admin/css/ace.min.css"
	class="ace-main-stylesheet" id="main-ace-style" />

</head>
<body class="no-skin">
	<div id="navbar" class="navbar navbar-default">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>

		

		<div class="navbar-container" id="navbar-container">
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<div class="navbar-header pull-left">
				<a href="${pageContext.request.contextPath}/index.html"
					class="navbar-brand"> <small> <i class="fa fa-leaf"></i>
						Ace Admin
				</small>
				</a>
			</div>
		</div>
	</div>

	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<jsp:include page="/WEB-INF/views/shere_view/admin/menu.jsp"></jsp:include>

		<div class="main-content">
			<div class="main-content-inner">
				<div class="breadcrumbs" id="breadcrumbs">
					<script type="text/javascript">
						try {
							ace.settings.check('breadcrumbs', 'fixed')
						} catch (e) {
						}
					</script>

					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a
							href="${pageContext.request.contextPath}/#">Home</a></li>
						<li class="active">Tất cả sản phẩm</li>
					</ul>
					<!-- /.breadcrumb -->

					<div class="nav-search" id="nav-search">
						<form class="form-search">
							<span class="input-icon"> <input type="text"
								placeholder="Search ..." class="nav-search-input"
								id="nav-search-input" autocomplete="off" /> <i
								class="ace-icon fa fa-search nav-search-icon"></i>
							</span>
						</form>
					</div>
				</div>

				<div class="page-content">
					<div class="page-header">
						<h1>
							Trang chủ <small> <i
								class="ace-icon fa fa-angle-double-right"></i> overview &amp;
								stats
							</small>
						</h1>
					</div>

					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div class="alert alert-block alert-success">
								<button type="button" class="close" data-dismiss="alert">
									<i class="ace-icon fa fa-times"></i>
								</button>

								<i class="ace-icon fa fa-check green"></i>Xin chào Admin web <strong
									class="green"> Ace, Để truy cập
									trang web bán hàng tại nhập vào <a
									href="${pageContext.request.contextPath}/home" target="_blank">đây</a>
								</strong>
							</div>
						</div>
					</div>
				</div>




				<form:form class="table" modelAttribute="product"
					action="${pageContext.request.contextPath}/admin/save"
					method="POST" enctype="multipart/form-data">
					<table>
						<caption>Thêm sản phẩm</caption>
						<form:hidden path="id" />
						<tr>
							<td>Hình ảnh:</td>
							<td><input type="file" value="chọn hình ảnh"
								name="fileImageUpload" id="image" accept="image/png, image/jpg" /></td>
						</tr>

						<tr>
							<td>Tên sản phẩm:</td>
							<td><form:input path="name" /></td>
						</tr>

						<tr>
							<td>Giá sản phẩm:</td>
							<td><form:input path="price" /></td>
						</tr>

						<tr>
							<td>Giá khuyễn mại:</td>
							<td><form:input path="priceDis" /></td>
						</tr>

						<tr>
							<td>khối lượng (cm):</td>
							<td><form:input path="weight" /></td>
						</tr>

						<tr>
							<td>Mô tả ngắn:</td>
							<td><form:textarea id="editor" title="mô tả chi tiết" path="decription" /></td>
						</tr>

						<tr>
							<td>Mô tả dài:</td>
							<td><form:textarea id="editor1" title="mô tả ngắn gọn" path="shortDecription" /></td>
						</tr>

						<tr>
							<td>Ngày tạo:</td>
							<td><input type="date" name="modifieddate"></td>
						</tr>

						<tr>
							<td>Thương hiệu:</td>
							<td><form:input path="brand" /></td>
						</tr>

						<tr>
							<td>Mã sản phẩm(vd : #cs5d8ed):</td>
							<td><form:input path="productCode" /></td>
						</tr>

						<tr>
							<td colspan="2" align="center"><input type="submit"
								value="Submit"></td>
						</tr>

					</table>
				</form:form>

			</div>
		</div>
	</div>
	<jsp:include page="/WEB-INF/views/shere_view/admin/footer.jsp"></jsp:include>
	<a href="${pageContext.request.contextPath}/#" id="btn-scroll-up"
		class="btn-scroll-up btn btn-sm btn-inverse"> <i
		class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
	</a>

	<script type="text/javascript">
		window.jQuery
				|| document.write("<script src='<%=request.getContextPath()%>/assets/js/jquery.min.js'>"
						+ "<"+"/script>");
	</script>

	<script type="text/javascript">
		if ('ontouchstart' in document.documentElement)
			document
					.write("<script src='<%=request.getContextPath()%>/assets/js/jquery.mobile.custom.min.js'>"
							+ "<"+"/script>");
	</script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery-ui.custom.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery.ui.touch-punch.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery.easypiechart.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery.sparkline.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery.flot.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery.flot.pie.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/jquery.flot.resize.min.js"></script>

	<!-- ace scripts -->
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/ace-elements.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/admin/js/ace.min.js"></script>

	<script
		src="${pageContext.request.contextPath}/assets/ckeditor/ckeditor.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/ckfinder/ckfinder.js"></script>

	<script type="text/javascript">
		var editor = CKEDITOR.replace("editor1");
		CKFinder.setupCKEditor(editor1, '<%=request.getContextPath()%>/assets/ckfinder/');
	</script>
	<script type="text/javascript">
		var editor = CKEDITOR.replace("editor");
		CKFinder.setupCKEditor(editor, '<%=request.getContextPath()%>/assets/ckfinder/');
	</script>
</body>
</html>