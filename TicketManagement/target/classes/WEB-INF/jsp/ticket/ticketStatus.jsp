<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${userType =='admin' && !empty ticket.assignedTicket.status && employee.name==ticket.assignedTicket.employee.name }">
		<div class="col-sm-3">
			<form action="ticketStatus/?id=${ticket.id}" method="post">

				<div class="form-group">
					<label for="email">Status :</label><select class="form-control"
						id="sel1" name="status" 
						required>
						<option value="">Select One</option>
						<option value="Reopened">Reopened</option>
						<option value="In Progress">In Progress</option>
						<option value="Done">Done</option>
						<option value="Closed">Closed</option>
					</select>
					<button type="submit">Change Status</button>
				</div>
			</form>

		</div>
	</c:when>
</c:choose>