<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class=col-sm-5>


		<c:if test="${not empty message}">
			<script>
				alert("${message}");
			</script>
		</c:if>


		<br>
		<div class="card">

			<div class="card-header">
				<center>
					<h5>Add Division</h5>
				</center>
			</div>
			<br>
			<div class="card-body">
				<sf:form class="form-horizontal" modelAttribute="division"
					action="${contextRoot}/manage/division" method="post">
					<div class="form-group">
						<label class="control-label col-sm-4">Division Name</label>
						<div class="col-sm-8">
							<sf:input type="text" path="divisionName" class="form-control"
								placeholder="Division Name" />
							<sf:errors path="divisionName" cssClass="help-block" element="em" />
							<sf:hidden path="divisionId" />
						</div>
					</div>
					<div class="form-group">
						<div class=" col-sm-2"></div>
						<div class=" col-md-3">
							<input type="button" name="submit" value="Add" class="btn" />
						</div>
						<div class=" col-sm-2"></div>
						<div class=" col-sm-3">
							<input type="submit" name="submit" value="Clear" class="btn" />
						</div>
						<div class=" col-sm-2"></div>
					</div>
				</sf:form>
			</div>

		</div>

	</div>

	<div class=col-sm-7>
		<br>
		<div class=card>

			<div class="card-header">
				<center>
					<h5>Division</h5>
				</center>
			</div>
			<br>
			<div class="card-body">

				<table id="divisionListTable"
					class="table table-condensed table-bordered">

					<thead>
						<tr>
							<th>Name</th>
							<th>delete</th>
						</tr>
					</thead>




				</table>
			</div>

		</div>

	</div>

</div>