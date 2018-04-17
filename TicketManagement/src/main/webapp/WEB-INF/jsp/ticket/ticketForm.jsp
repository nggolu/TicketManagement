


<div class="container">
	<h2>Generate ticket</h2>
	<form action="ticket" method="post" enctype="multipart/form-data">
		<div class="form-group">
			<label for="email">Type</label><select class="form-control" id="sel1"
				name="type" required>
				<option value="">Select-anyOne</option>
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
				type="radio" name="priority" value="Normal" required>Normal</label>
			<label class="radio-inline"><input type="radio"
				name="priority" value="Urgent" required>Urgent</label> <label
				class="radio-inline"><input type="radio" name="priority"
				value="Immediate" required>Immediate</label>
		</div>
		<div class="form-group">
			<label for="email">Title:</label> <input type="text"
				class="form-control" id="email" placeholder="Enter Title"
				name="title" required />
		</div>
		<div class="form-group">
			<label for="email">Message:</label>
			<textarea class="form-control" rows="5" id="comment" name="message"
				required></textarea>
		</div>
		<div class="form-group">
			<label for="pwd">Upload File</label> <input type="file"
				class="form-control" id="pwd" placeholder="" name="file"  />
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	<br/>
	
</div>
