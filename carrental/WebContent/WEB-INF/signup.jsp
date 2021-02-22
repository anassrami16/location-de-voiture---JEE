<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark fixed-top">
		<div class="container">
			<a href="index.html" class="navbar-brand">Louezz</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria controls="navbarResponsive" aria-expended="false" aria-label="toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a href="signup.html" class="nav-link active"></a></li>
					<li class="nav-item"><a href="" class="nav-link">se connecter</a></li>
					<li class="nav-item"><a href="" class="nav-link">Louer ma voiture</a></li>
					
				</ul>
			</div>
			
		</div>
		
	</nav>
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
				<a href="login.html"> you have an account?</a>
				
				

			</form>	
		
	</div>

















</body>
</html>