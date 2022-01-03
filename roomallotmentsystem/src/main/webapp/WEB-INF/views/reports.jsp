<div class="row content">

	<div class="col-sm-2 subsidenav">
		<c:if
			test="${userClickReports == true  or userClickBookingReports== true}">
			<%@include file="./shared/reports_sidebar.jsp"%>
		</c:if>
	</div>

	<div class="col-sm-10 text-left">
		<c:if
			test="${userClickReports == true  or userClickHomeBookingReports== true}">
			<h1>this is Reports page</h1>
		</c:if>
	</div>

</div>

