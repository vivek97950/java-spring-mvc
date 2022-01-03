<div class="row content">

	<div class="col-sm-2 subsidenav">
		<c:if
			test="${userClickRooms == true  or userClickHomeBookingStatus== true}">
			<%@include file="./shared/rooms_sidebar.jsp"%>
		</c:if>
	</div>

	<div class="col-sm-10 text-left">
		<c:if
			test="${userClickRooms == true  or userClickHomeBookingStatus== true}">
			<h1>this is room page</h1>
		</c:if>
	</div>

</div>

