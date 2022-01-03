<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="School-website">
<meta name="author" content="Vivek Dixit">
<meta name="_csrf" content="${_csrf.token}">
<meta name="_csrf_header" content="${_csrf.headerName}">
<title>RoomAllotmentSystem - ${title}</title>

<script>
	window.menu = '${title}';
	window.submenu = '${subtitle}';
	window.contextRoot = '${contextRoot}';
</script>
<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet" />

<!-- Bootstrap Readable Theme -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet" />


<!-- Bootstrap DataTables -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet" />


<!-- Custom CSS -->
<link href="${css}/myapp.css" rel="stylesheet" />

<style type="text/css">
</style>

</head>

<body>

	<div class="se-pre-con"></div>


	<%@include file="./shared/navbar.jsp"%>


	<div class="container-fluid text-center">
		<div class="row content">
			<div class="col-sm-1 sidenav">
				<%@include file="./shared/sidebar.jsp"%>
			</div>
			<div class="col-sm-11 text-left">
				<c:if
					test="${userClickHome == true or userClickAvailability==true or userClickNewBooking==true}">
					<%@include file="./home.jsp"%>
				</c:if>
				<c:if test="${userClickReports == true }">
					<%@include file="./reports.jsp"%>
				</c:if>
				<c:if test="${userClickRooms == true }">
					<%@include file="./rooms.jsp"%>
				</c:if>
				<c:if
					test="${userClickSetting == true or userClickPlaces== true  or userClickDivision== true or userClickPerson== true  or userClickAddRooms== true  or userClickPurpose== true  or userClickNotice== true}">
					<%@include file="./setting.jsp"%>
				</c:if>
			</div>
		</div>
	</div>


	<%@include file="./shared/footer.jsp"%>


	<!-- jQuery -->
	<script src="${js}/jquery.js"></script>

	<script src="${js}/jquery.validate.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>

	<!-- DataTable Plugin -->
	<script src="${js}/jquery.dataTables.js"></script>

	<!-- DataTable Bootstrap Script -->
	<script src="${js}/dataTables.bootstrap.js"></script>

	<!-- DataTable Bootstrap Script -->
	<script src="${js}/bootbox.min.js"></script>

	<!-- Self coded javascript -->
	<script src="${js}/myapp.js"></script>

</body>

</html>