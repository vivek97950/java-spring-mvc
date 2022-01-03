<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>


<div class="row">
	<div class=col-sm-5>
		<br>
		<div class="card">

			<div class="card-header">
				<center>
					<h5>Add Place</h5>
				</center>
			</div>
			<br>
			<div class="card-body">
				<sf:form class="form-horizontal" modelAttribute="places"
					action="${contextRoot}/manage/places" method="post">

					<div class="form-group">
						<label class="control-label col-sm-4">Division Name</label>
						<div class="col-sm-8">
							<%-- 
							<sf:select path="divisionId" items="${divisions}"
								itemLabel="divisionName" itemValue="divisionId"
								class="form-control" /> --%>

							<sf:select path="divisionId" class="form-control">
								<sf:option value="0" label="Select" />
								<sf:options items="${divisions}" itemLabel="divisionName"
									itemValue="divisionId" />
							</sf:select>




						</div>
					</div>

					<div class="form-group">
						<label class="control-label col-sm-4">Place Name</label>
						<div class="col-sm-8">
							<sf:input type="text" path="placeName" class="form-control"
								placeholder="Place Name" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-4">Discription</label>
						<div class="col-sm-8">
							<sf:input type="text" path="placeDiscription"
								class="form-control" placeholder="Description" />
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