<#assign page_title = "Conpleted Tasks">

<html>
<head>
    <#include '/head.ftl'>
	
</head>
<body>

	<#include '/navigation.ftl'>

<div style="padding: 25px;">

	<div class="datatable-wrapper">
		<table id="results-datatable" class="table table-striped" style="width:100%">
			<thead>
				<tr>
    				<th>Name</th>
    				<th>Type</th>
    				<th>Description</th>
    				<th>UUID</th>
    				<th>Submitted</th>
    				<th>Started</th>
    				<th>Completed</th>
    				<th data-type="@data-sort">Wait Time</th>
    				<th data-type="@data-sort">Task Time</th>
    				<th data-type="@data-sort">Successful</th>
    				<th>Message</th>
    				<th> </th>
				</tr>
			</thead>
			<tfoot>
				<tr>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th></th>
    				<th> </th>
				</tr>			
			</tfoot>
		</table>
	</div>

</div>

<script>

	var getResultsUrl = "/api/v1/tasks/completed";
		
	var resultsDatatableColumns = 
	[
	    { "data": "task_name",
	    	className : "results-task-name-column"
	    },
	    { "data": "task_type",
	    	className : "results-task-type-column"
	    },
	    { "data": "task_description",
	    	className : "results-task-description-column"
	    },
	    { "data": "task_uuid",
	    	className : "results-task-uuid-column",
	    	visible: true
	    },
	    { "data": "task_submitted_date",
	    	className : "results-task-submitted-date-column"
	    },
	    { "data": "task_started_date",
	    	className : "results-task-started-date-column"
	    },
	    { "data": "task_completed_date",
	    	className : "results-task-completed-date-column"
	    },
	    { "data":
	    	{
				_:    "task_wait_time.task_wait_time_display",
				sort: "task_wait_time.task_wait_time_seconds"
			},
	    	className : "results-task-wait-time-column"
	    },
	    { "data":
	    	{
				_:    "task_execution_time.task_execution_time_display",
				sort: "task_execution_time.task_execution_time_seconds"
			},
	    	className : "results-task-execution-time-column"
	    },
	    { "data": "task_successful",
	    	className : "results-task-successful-column",
         	render: function ( data, type, row ) {
         		if (!data) {
         			return "<i class='fas fa-exclamation-circle'></i>"
         		} else {
         			return "<i class='fas fa-check-circle'></i>"
         		}
         	}
	    },
	    { "data": "task_message",
	    	className : "results-task-message-column"
	    },
	   	{
			className : "results-column-ellipsis",
			"bSortable": false,
			"mRender": function(data, type, row){
				return createResultsEllipsis(row);
			},
		}
	];

	$( document ).ready(function() {
	
		$(document).mouseup(function (e) {
			hideResultsEllipsisMenu(e);
		});

		if (!$.fn.DataTable.isDataTable('#results-datatable')) {
	
			resultsDatatable = $('#results-datatable').DataTable({
				"processing": true,
				"serverSide": false,
				"sServerMethod": "GET",
				"pageLength": 25,
				"ajax": {
					"url": getResultsUrl,
					/*
					"data": function (d, callback, settings) {
						d.length = d.length;
						d.start = d.start;
						d.sortColumn = d.order[0].column;
						d.sortDirection = d.order[0].dir;
						d.searchValue = d.search.value;
					},
					*/		
					'error': function (error) {
						console.log("error processing results");
						console.log(error);
					},
				},
				initComplete: function () {
					// Apply the search
					var api = this.api();
					api.column(4).visible( false );


					api.columns().every( function () {
						var that = this;
 
						$( 'input', this.footer() ).on( 'keyup change clear', function () {
 							if ( that.search() !== this.value ) {
								that
									.search( this.value )
                            		.draw();
                    		}
						} );
            		} );
        		},
				"paging": true,
				"info": true,
				"columns": resultsDatatableColumns,
				dom: 'Blrf<"custom-toolbar">tip',
				select: {
					style: 'os',
					selector: 'td:first-child'
				},
				buttons: [],
			});

		} else {
			$('#results-datatable').DataTable().ajax.reload();
		}
		
		$('#results-datatable tfoot th').each( function () {
	        if ($(this).index() < 4) {
		        $(this).html( '<input type="text" placeholder="Filter" />' );
	        }
	    } );

	});

	function createResultsEllipsis(row){
		
		var str = '';
		
		str += '<div class="fileMenu"><ul class="dropDownMenu"><li class="has-children">';
		str += '<button class="btn-link file-menu">';
		str += '<i class="fas fa-ellipsis-v"></i>'
		str += '</button>';
		str += '<ul>';
		str += '<li><button style="width:100%; text-align:left;" class="btn-link" onclick="javascript: downloadAsCSV(\'' + row.task_uuid + '\', \'' + row.task_name + '\');  hideResultsEllipsisMenu(); return false;">Download Results As CSV</button></li>';		
		
		return str;
	}

	$('#results-datatable').on('click', '.fileMenu ul li.has-children > button', function(e){
		console.log("clicked...");
		e.preventDefault();
		if ($(this).next('ul').css("display") === 'none') {
			$(this).next('ul').stop(true, false, true).fadeIn(300);
		} else {
			$(this).parent().find('ul').fadeOut(300);
		}
		return false;
	});
	
	function hideResultsEllipsisMenu(e) {
	    var container = $(".fileMenu ul li.has-children > ul");
	    if (e == undefined || !container.is(e.target) 
	        && container.has(e.target).length === 0) {
	        container.hide();
	    }
	}

	function downloadAsCSV(uuid, name) {
		
		$.ajax({
			type 		: "GET", 
			url 		: "/api/v1/tasks/" + uuid + "/results", 
			data 		: {},
            dataType	: "text",
			cache		: false,
			processData	: false,
		    contentType	: false,
		    headers		: { 'Accept': 'text/csv', 'Content-Type': 'text/csv' },
		})

		.done(function(data) {
			
			var hiddenElement = document.createElement('a');
			hiddenElement.href = 'data:text/csv;charset=utf-8,' + encodeURI(data);
	    	hiddenElement.target = '_blank';
	    	hiddenElement.download = name + ".csv";
	    	hiddenElement.click();
    
		})
		.fail(function(data) {
		
			console.log("fail...");
			console.log(data);
	
		})
		.always(function() {
		});
	}

</script>

</body>
</html>