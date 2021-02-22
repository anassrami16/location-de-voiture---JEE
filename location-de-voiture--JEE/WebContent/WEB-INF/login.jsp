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
	<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/res/images/icons/favicon.ico" />
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	


</head>
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
					<li class="nav-item"><a href="login.html" class="nav-link active"></a></li>
					<li class="nav-item"><a href="" class="nav-link">se connecter</a></li>
					<li class="nav-item"><a href="" class="nav-link">Louer ma voiture</a></li>
					
				</ul>
			</div>
			
		</div>
		
	</nav>

	<!-- End Navigation -->
	<div class="wrap">
		<h2>Login</h2>
		<div class="social-media">
			<button><a href="#"><i class="fa fa-facebook"></i> Sign in with Facebook</a></button>
			<button><a href="#"><i class="fa fa-google"></i> Sign in with Google</a></button>
	</div>
			<form action="Login" method="Post">
			<label>Email:</label><br>
			    <input type="text" required="required" name="email">
				<label>Password:</label><br>
				<input type="Password" required="required" name="password">	
				<input type="submit" value="Sign In">
			</form>	
		
	</div>

	



	<!-- Image Carousel -->


		<!-- Carousel Content -->
	
		<!-- End Carousel Content -->


		<!-- Previous & Next Buttons -->

		<!-- End Previous & Next Buttons -->


	<!-- End Image Carousel -->


	<!-- Main Page Heading -->


	<!-- Three Column Section -->

	<!-- End Three Column Section -->


	<!-- Emoji Navbar First -->


	<!-- Start Fixed Background IMG -->

	<!-- End Fixed Background IMG -->
 
	
	<!-- Emoji Navbar Second -->


	<!-- Modal Popup -->

		
	<!-- Start Two Column Section -->

	<!-- End Two Column Section -->


	<!-- Start Jumbotron -->

	<!-- End Jumbotron -->


	<!-- Start Footer -->

	<!-- End Footer -->


	<!-- Start Socket -->

	<!-- End Socket -->



	<!-- Script Source Files -->

	<!-- jQuery -->
	<script src="${pageContext.request.contextPath}/res/js/jquery-3.5.1.min.js"></script>
	<!-- Bootstrap 4.5 JS -->
	<script src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
	<!-- Popper JS -->
	<script src="${pageContext.request.contextPath}/res/js/popper.min.js"></script>
	<!-- Font Awesome -->
	<script src="${pageContext.request.contextPath}/res/js/all.min.js"></script>

	<!-- End Script Source Files -->
</body>
</html>