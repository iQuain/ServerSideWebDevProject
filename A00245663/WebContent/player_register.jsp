<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
	/* Bordered form */
form {
    border: 3px solid #f1f1f1;
}

/* Full-width inputs */
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
    opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
    width: 40%;
    border-radius: 50%;
}

/* Add padding to containers */
.container {
    padding: 16px;
}

/* The "Forgot password" text */
span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
        display: block;
        float: none;
    }
    .cancelbtn {
        width: 100%;
    }
}
</style>

<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Player Sign Up</title>
</head>
<body>
	<h2 style="text-align:center">Sign Up Today&excl;</h2>
	<form action="PlayerRegisterServlet" method="post">
		<div class="container">
			<label for="user"><b>Username</b></label>
			<input type="text" placeholder="Enter Username" name="username" required>
			
			<label for="team"><b>Team Name</b></label>
			<input type="text" placeholder="Enter Team Name" name="teamname" required>
			
			<label for="psw1"><b>Password</b></label>
			<input type="password" placeholder="Enter Password" name="password" required>
			
			<label for="psw2"><b>Confirm Password</b></label>
			<input type="password" placeholder="Enter Password Again" name="confirmpass" required>
		</div>
		<div class="container" style="background-color:#f1f1f1">
			<button type="submit">Register</button>
		</div>
	</form>

</body>
</html>