# TicketManagement
Ticket Management System  manages the tickets raised by employee and assigned by admin

This will be single application with different interfaces for employee and admin users. 

Login: Employees/Admins will login into the application using their credentials after which they will be directed to their specific views.

Employee View: It will have the following functionalities:
1.	Add Ticket: To raise a new ticket an employee must specify certain details as under:
a.	Type
b.	Priority
c.	Title
d.	Message
e.	Attachments – Optional

When the ticket is raised, a unique Ticket ID is assigned to the ticket.

Tickets are classified into following types
a.	Stationery Request
b.	Attendance Issue
c.	WFH request
d.	Rating issue
e.	Project issue
f.	Compensation issue
g.	Transport Complaint
h.	Transport Request
i.	Asset Request
j.	Software issue
k.	Hardware issue

Tickets can have any of the following priority:
a.	Normal
b.	Urgent
c.	Immediate

All tickets have a status and owner associated to them based on their current state and person owning that ticket:
a.	Raised
b.	In Progress
c.	Done
d.	Closed
e.	Reopened 

Initially the status is Raised and unassigned to anyone. The admin can pick that ticket up for work and assign to himself and it will then move to In Progress state. 

2.	Ticket List and Filter View: Employee can view the tickets raised by him only. The ticket list will be shown in a paginated manner. Employee can also search any ticket by its Ticket ID or Title. He will also have the privilege to sort the list based on Ticket ID, Priority, etc. He can filter the list based on the current Status, Type and Priority.

3.	Ticket Details View: Employee can view the ticket details. He can add any comments on the ticket.

Admin View: It will have the following functionalities:
1.	Ticket List and Filter view: The admin users can view all the tickets raised/ assigned/unassigned to her. The ticket list will be shown in a paginated manner. The admin can assign any ticket to herself. She can also search any ticket by its Ticket ID or Title. She will also have the privilege to sort the list based on Ticket ID, Priority etc. She can also filter the list based on the status, Type, Employee and Priority.

2.	Ticket Details View: Admin can view the details of any ticket. She can assign the ticket to herself. She can change the status of the ticket. She can add any comments on the ticket. Any new comment added by admin will trigger an email to the Employee who has raised the ticket.

### How do I get set up? ###
1)Software Setup 
	-Ecllipse
	-Mysql
2)Change the password and username in application.properties file according to your databse
3)import the database flightSearchdata

* Summary of set up
* Configuration
* Dependencies
* Database configuration
* How to run tests
* Deployment instructions

### Contribution guidelines ###

* Writing tests
* Code review
* Other guidelines

### Who do I talk to? ###

* Repo owner or admin
* Other community or team contact
