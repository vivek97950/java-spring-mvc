
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class=col-sm-5>
		<br>
		<div class="card">

			<div class="card-header">
				<center>
					<h5>Add Purpose</h5>
				</center>
			</div>
			<br>
			<div class="card-body">
				<sf:form class="form-horizontal" modelAttribute="purpose"
					action="${contextRoot}/manage/purpose" method="post">

					<div class="form-group">
						<label class="control-label col-sm-4">Purpose</label>
						<div class="col-sm-8">
							<sf:input type="text" path="purposeName" class="form-control"
								placeholder="Purpose Name" />
						</div>
					</div>
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
