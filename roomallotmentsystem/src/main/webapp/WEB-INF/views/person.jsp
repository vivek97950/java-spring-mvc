
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class=col-sm-5>
		<br>
		<div class="card">

			<div class="card-header">
				<center>
					<h5>Add User</h5>
				</center>
			</div>
			<br>
			<div class="card-body">
				<sf:form class="form-horizontal" modelAttribute="person"
					action="${contextRoot}/manage/person" method="post">

					<div class="form-group">
						<label class="control-label col-sm-4">User Name</label>
						<div class="col-sm-8">
							<sf:input type="text" path="personName" class="form-control"
								placeholder="User Name" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-4">Password</label>
						<div class="col-sm-8">
							<sf:input type="text" path="personPassword" class="form-control"
								placeholder="Password" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-4">Mobile No.</label>
						<div class="col-sm-8">
							<sf:input type="text" path="mobileNo" class="form-control"
								placeholder="Mobile No" />
						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-4">Place Name</label>
						<div class="col-sm-8">
							<sf:input type="text" path="placeName" class="form-control"
								placeholder="Place Name" />
						</div>
					</div>
					<sf:hidden path="placeId" />

					<div class="form-group">
						<div class=" col-sm-2"></div>
						<div class=" col-md-3">
							<input type="button" name="submit" value="Add" class="btn" />
						</div>
						<div class=" col-sm-2"></div>
						<div class=" col-sm-3">
							<input type="button" name="submit" value="Clear" class="btn" />
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
					<h5>Places</h5>
				</center>
			</div>
			<br>
			<div class="card-body">

				<table id="productsTable"
					class="table table-condensed table-bordered">

					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Edit</th>
							<th>Activate</th>
						</tr>
					</thead>

					<tfoot>
						<tr>

						</tr>
					</tfoot>


				</table>
			</div>

		</div>

	</div>



</div>
