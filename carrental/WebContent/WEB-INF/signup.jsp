<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover">
   <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>louezz</title>
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/res/img/favicon.ico">
	<!-- Bootstrap 4.5 CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/css/bootstrap.min.css">
	<!-- Style CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/res/style.css">
	<link rel="stylesheet" href="res/css/navbar.css">
	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700&display=swap" rel="stylesheet">
	<link rel="icon" type="${pageContext.request.contextPath}/res/image/png" href="images/icons/favicon.ico" />
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	


</head>
<script type="text/javascript">
	function checkpassword()
	{
		var p=f.pass.value;
		var cp=f.cpass.value;
		if(p!=cp)
			alert("mismatch")
		
	}
</script>




<body>

<!-- Navigation -->
	<c:import url="/navbar.jsp"/>
	<!-- End Navigation -->
	
	
	<div class="wrap">
		<h2>Sign up</h2>

			<form name="f">
			<label>First Name:</label><br>
			    <input type="text">
			    <label>Last Name:</label><br>
			    <input type="text">
			    <label>Date of birth:</label><br>
			    <input type="Date">
			    <label>Address:</label><br>
			    <input type="text">
			    <label>Username:</label><br>
			    <input type="text">
			    <label>Email:</label><br>
			    <input type="text">
				<label>Password:</label><br>
				<input type="Password" name="pass">	
				<label>Confirm Password:</label><br>
				<input type="Password" name="cpass">
				<label><input type="checkbox">  I accept all the terms and conditions</label>
				<input type="submit" value="Sign Up" onclick="checkpassword()">
				<a href="login"> you have an account?</a>
				
				

			</form>	
		
	</div>

















</body>
</html>