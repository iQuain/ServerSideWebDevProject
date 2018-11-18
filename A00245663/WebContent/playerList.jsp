<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
#buttons {
	text-align:center;
	width: 80%;
	margin-left:auto; 
    margin-right:auto;
}

#players {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 80%;
    margin-left:auto; 
    margin-right:auto;
}

#players td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
}

#players tr:nth-child(even){background-color: #f2f2f2;}

#players tr:hover {background-color: #ddd;}

#players th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #4CAF50;
    color: white;
}
</style>
<meta charset="ISO-8859-1">
<title>Player List</title>
</head>
<body>
	<h2 style="text-align:center; padding-top:0px; padding-bottom:0px;" class="w3-green">Player List</h2>
	<h3 style="text-align:center; padding-top:0px;" class="w3-light-grey"><i>This is the player list&excl;  You can view 
	all of the players that have signed up for the tournament and their details here&excl;</i></h3>

	<table id="players">
		<tr>
			<th>Username</th>
			<th>Team</th>
			<th>Car</th>
		</tr>
		
		<c:forEach items="${playerList}" var="Player">
			<c:url value="ListPlayerServlet" var="showUrl">
				<c:param name="id" value="${Player.id}" />
			</c:url>
			
			<tr>
				<td><c:out value="${Player.username}" /></td>
				<td><c:out value="${Player.team}" /></td>
				<td><c:out value="${Player.car}" /></td>
			</tr>
			<br />
			</c:forEach>
	</table>
	
	<table id="buttons">
		<tr>
			<td><a href="home.jsp"><button class="w3-button w3-round-xlarge w3-hover-blue w3-green w3-xlarge">Home</button></a></td>
			<td><a href="index.jsp"><button class="w3-button w3-round-xlarge w3-hover-blue w3-red w3-xlarge">Logout</button></a></td>
		</tr>
	</table>
</body>
</html>