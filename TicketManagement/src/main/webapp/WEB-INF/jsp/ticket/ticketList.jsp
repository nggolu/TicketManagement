<%@page import="com.nagarro.ticketmanagement.model.Ticket"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<div>
	<c:if test="${empty mode}">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<a href="applyFilters" class="btn btn-primary btn-lg btn-block">apply
				Filters Ticket</a>
		</div>
		
	</c:if>
	<c:choose>
		<c:when test="${mode=='filtered' }">
			<a href="/home" class="btn btn-primary btn-lg btn-block">Home</a>
		</c:when>
	</c:choose>
	<br/><br/>
	<table class="table table-striped" id="ticketTable">
		<thead>
			<tr>
				<th>Ticket Id</th>
				<c:if test="${userType=='admin' }">
					<th>Employee</th>
				</c:if>
				<th>Title</th>
				<th>Message</th>
				<th>priority</th>
				<th>Type</th>
				<th>Status</th>
				<th>AssignTo</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ticket" items="${tickets}">
				<tr>
					<th>${ticket.id }</th>
					<c:if test="${userType=='admin' }">
						<th>${ticket.employee.name }</th>
					</c:if>
					<th>${ticket.title}</th>
					<th>${ticket.message}</th>
					<th>${ticket.priority}</th>
					<th>${ticket.type}</th>
					<th><c:if test="${empty ticket.assignedTicket}">
    							Raised
							</c:if> <c:choose>
							<c:when test="${ticket.assignedTicket != 'null' }">
									 ${ticket.assignedTicket.status }
								</c:when>
						</c:choose></th>
					<th><c:if test="${empty ticket.assignedTicket}">
    							None
							</c:if> <c:choose>
							<c:when test="${ticket.assignedTicket != 'null' }">
									${ticket.assignedTicket.employee.name}
								</c:when>
						</c:choose></th>
					<th><a href="viewTicket/?id=${ticket.id}"> View </a></th>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script>
		$(document).ready(function() {
			var table = $('#ticketTable').DataTable({

			});
		});
	</script>
</div>