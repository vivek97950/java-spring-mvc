$(function() {

	// for adding a loader
	$(window).load(function() {
		setTimeout(function() {
			$(".se-pre-con").fadeOut("slow");
		}, 500);
	});

	// for handling CSRF token
	var token = $('meta[name="_csrf"]').attr('content');
	var header = $('meta[name="_csrf_header"]').attr('content');

	if ((token != undefined && header != undefined)
			&& (token.length > 0 && header.length > 0)) {
		// set the token header for the ajax request
		$(document).ajaxSend(function(e, xhr, options) {
			xhr.setRequestHeader(header, token);
		});
	}

	// solving the active menu problem
	switch (menu) {
	case 'home':
		$('#home').addClass('active');
		break;
	case 'availability':
		$('#home').addClass('active');
		$('#availability').addClass('active');
		break;
	case 'newBooking':
		$('#home').addClass('active');
		$('#newBooking').addClass('active');
		break;
	case 'reports':
		$('#reports').addClass('active');
		break;
	case 'rooms':
		$('#rooms').addClass('active');
		break;
	case 'setting':
		$('#setting').addClass('active');
		break;
	case 'division':
		$('#setting').addClass('active');
		$('#division').addClass('active');
		break;
	case 'places':
		$('#setting').addClass('active');
		$('#places').addClass('active');
		break;
	case 'person':
		$('#setting').addClass('active');
		$('#person').addClass('active');
		break;
	case 'add_rooms':
		$('#setting').addClass('active');
		$('#add_rooms').addClass('active');
		break;
	case 'purpose':
		$('#setting').addClass('active');
		$('#purpose').addClass('active');
		break;
	case 'notice':
		$('#setting').addClass('active');
		$('#notice').addClass('active');
		break;
	default:
		if (menu == "home")
			$('#reports').addClass('active');
		break;
	}

	// code for jquery dataTable
	var $table = $('#divisionListTable');

	// execute the below code only where we have this table
	if ($table.length) {
		// console.log('Inside the table!');

		var jsonUrl = '';
		jsonUrl = window.contextRoot + '/json/data/all/division';
		$table
				.DataTable({

					lengthMenu : [ [ 3, 5, 10, -1 ], [ '3', '5', '10', 'ALL' ] ],
					pageLength : 5,
					ajax : {
						url : jsonUrl,
						dataSrc : ''
					},
					columns : [
							{
								data : 'divisionName'
							},
							{
								data : 'divisionId',
								bSortable : false,

								mRender : function(data, type, row) {
									var str = '';
									str += '<a href="'
											+ window.contextRoot
											+ '/manage/'
											+ data
											+ '/division" class="btn btn-primary"><span class="glyphicon glyphicon-pencil"></span></a>';
									return str;

								}
							} ]
				});
	}

});