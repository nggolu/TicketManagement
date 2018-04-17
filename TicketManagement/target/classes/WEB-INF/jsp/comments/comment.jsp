<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Comments</h1>
<c:forEach var="comment" items="${comments}">

	<div class="row test">
		<div class="col-sm-1"></div>
		<div class="col-sm-1">
			<b>${comment.employee.name } </b>
		</div>
		<div class="col-sm-6">${comment.text }</div>
	</div>
	<br />
</c:forEach>

<form action="addComment" method="post">

	<div class="form-group">

		<input type="hidden" class="form-control" id="txt"
			placeholder="Enter Comment" value="${ticket.id }" name="ticketId" />
		<input type="text" class="form-control" id="txt"
			placeholder="Enter Comment" name="text" required />
	</div>

	<button type="submit" class="btn btn-default">Add Comment</button>
</form>