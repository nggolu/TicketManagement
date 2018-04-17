<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp" />

	<div class="container">
		<form action="applyFilters" method="post">
			<div class="form-group">
				<label for="email">Type</label><select class="form-control"
					id="sel1" name="type" >
					<option value="">Select Any value</option>
					<option value="Stationery Request">Stationery Request</option>
					<option value="Attendance Issue">Attendance Issue</option>
					<option value="WFH request">WFH request</option>
					<option value="Rating issue">Rating issue</option>
					<option value="Project issue">Project issue</option>
					<option value="Compensation issue">Compensation issue</option>
					<option value="Transport Request">Transport Request</option>
					<option value="Asset Request">Asset Request</option>
					<option value="Software issuet">Software issue</option>
					<option value="Hardware issue">Hardware issue</option>
				</select>
			</div>
			<div class="form-group">
				<label for="pwd">Priority:</label> <label class="radio-inline"><input
					type="radio" name="priority" value="Normal" >Normal</label>
				<label class="radio-inline"><input type="radio"
					name="priority" value="Urgent" >Urgent</label> <label
					class="radio-inline"><input type="radio" name="priority"
					value="Immediate" >Immediate</label>
			</div>
			<div class="form-group">
				<label for="email">Status</label><select class="form-control"
					id="sel1" name="status">

					<option value="">Select One</option>
					<option value="Raised">Raised</option>
					<option value="Reopened">Reopened</option>
					<option value="In Progress">In Progress</option>
					<option value="Done">Done</option>
					<option value="Closed">Closed</option>

				</select>
			</div>
			<c:choose>
				<c:when test="${userType=='admin' }">
					<div class="form-group">
						<label for="email">Employee name:</label> <input type="text"
							class="form-control" id="email" placeholder="Enter Title"
							name="employeeName" />
				</c:when>
			</c:choose>
			<button type="submit" class="btn btn-default">Apply Filters</button>
		</form>
	</div>


	<br />
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>