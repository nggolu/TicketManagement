<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="header.jsp" />

	<c:choose>
		<c:when test="${userType=='employee' }">
			<div class="row">
				<div class="col-sm-2"></div>
				<div class="col-sm-8">
					<a href="employeeTickets" class="btn btn-primary btn-lg btn-block">View
						Ticket</a>
				</div>

			</div>
		</c:when>
	</c:choose>


	<c:choose>
		<c:when test="${userType=='employee' }">
			<jsp:include page="ticket/ticketForm.jsp" />
		</c:when>
		<c:otherwise>
			<jsp:include page="ticket/ticketList.jsp" />
		</c:otherwise>
	</c:choose>


	<jsp:include page="footer.jsp" />
</body>
</html>