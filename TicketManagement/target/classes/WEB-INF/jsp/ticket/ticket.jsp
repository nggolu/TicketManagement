<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>




<jsp:include page="../header.jsp" />
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-2"></div>
			<div class="col-sm-3">
				<h2>Generated ticket</h2>
			</div>
			<c:if
				test="${empty ticket.assignedTicket.status &&  userType=='admin' }">
				<div class="col-sm-3">
					<h2>
						<button>
							<a href="assignTicket/?id=${ticket.id}">Assign this ticket </a>
						</button>
					</h2>
				</div>
			</c:if>

		</div>


		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">
				<b>Type : </b>
			</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">
				${ticket.type }</div>
		</div>
		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">
				<b>Priority : </b>
			</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">
				${ticket.priority }</div>
		</div>
		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">
				<b>Title : </b>
			</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">
				${ticket.title }</div>
		</div>
		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">
				<b>Message : </b>
			</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">
				${ticket.message }</div>
		</div>


		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">
				<b>Status : </b>
			</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">
				<c:if test="${empty ticket.assignedTicket.status }">
    							Raised
				</c:if>
				<c:choose>
					<c:when test="${ticket.assignedTicket.status  !='null'}">${ticket.assignedTicket.status }</c:when>
				</c:choose>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2" style="background-color: lavender;">
				<b>Assign to : </b>
			</div>
			<div class="col-sm-6" style="background-color: lavenderblush;">
				<c:if test="${empty ticket.assignedTicket.status }">
    							none
				</c:if>
				<c:choose>
					<c:when test="${ticket.assignedTicket.employee.name !='null'}">${ticket.assignedTicket.employee.name }</c:when>
				</c:choose>
			</div>
		</div>
		<br/>
		<%-- <c:if test="${ticket.filePath!='null' }">
			<a href="${path}${ticket.filePath}" target="_blank">${path}${ticket.filePath}</a>
		</c:if> --%>
		<%-- <c:choose>
			<c:when test="${ticket.filePath !='null'}">
				<a href="${path}${ticket.filePath}" target="_blank">${path}${ticket.filePath}</a>
			</c:when>
		</c:choose> --%>

		<jsp:include page="ticketStatus.jsp" />
		<br />
	</div>
	<jsp:include page="../comments/comment.jsp" />
	<br />
	<br />
	<jsp:include page="../footer.jsp" />
	<!-- <script type="text/javascript">
		function openInNewTab(url1) {
			var url = encodeURIComponent(url1);

			console.log(url);
			var win = window.open('<c:out value="${path}${ticket.filePath}"/>',
					'_blank');
			win.focus();
		}
	</script> -->
</body>

</html>