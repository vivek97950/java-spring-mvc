<div class="row content">

	<div class="col-sm-2 subsidenav">

		<%@include file="./shared/home_sidebar.jsp"%>

	</div>

	<div class="col-sm-10 text-left">
		<c:if test="${userClickAvailability== true}">
			<h1>this is availability page</h1>
		</c:if>
		<c:if test="${userClickNewBooking==true}">
			<%@include file="./newBooking.jsp"%>
		</c:if>
	</div>

</div>

