<div class="row content">

	<div class="col-sm-2 subsidenav">

		<%@include file="./shared/setting_sidebar.jsp"%>

	</div>

	<div class="col-sm-10 text-left">
		<c:if test="${userClickPlaces== true}">
			<%@include file="./places.jsp"%>
		</c:if>
		<c:if test="${userClickDivision == true}">
			<%@include file="./division.jsp"%>
		</c:if>
		<c:if test="${userClickPerson == true}">
			<%@include file="./person.jsp"%>
		</c:if>
		<c:if test="${userClickAddRooms == true}">
			<%@include file="./add_rooms.jsp"%>
		</c:if>
		<c:if test="${userClickPurpose == true}">
			<%@include file="./purpose.jsp"%>
		</c:if>
		<c:if test="${userClickNotice == true}">
			<%@include file="./notice.jsp"%>
		</c:if>

	</div>

</div>

