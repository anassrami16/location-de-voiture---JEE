<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="fr">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, viewport-fit=cover">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Louezz</title>
	<link rel="shortcut icon" href="res/img/favicon.ico">
	<!-- Bootstrap 4.5 CSS -->
	<link rel="stylesheet" href="res/css/bootstrap.min.css">
	<!-- Style CSS -->
	<link rel="stylesheet" href="res/css/accueil.css">
	<link rel="stylesheet" href="res/css/navbar.css">
	<!-- Google Fonts -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700&display=swap" rel="stylesheet">
</head>
<body>

	
	<!-- Navigation -->
	<c:import url="/navbar.jsp"/>
	<!-- End Navigation -->


	<!-- Image Carousel -->

	<div id="carousel" class="carousel slide" data-ride="carousel" data-interval="650000">


		<!-- Carousel Content -->
		<div class="carousel-inner">

			<div class = "carousel-item active">
				<img src="res/img/carousel/1.jpg" alt="" class="w-100">

				<div class="carousel-caption">
					<div class="container">
						<div class="row d-flex align-items-start">
							<div class="col-7 bg-custom d-none d-lg-block py-3 px-0">
								<h1>Bienvenue sur Louezz</h1>
								<div class="border-top border-primary w-50 mx-auto my-3">
									<h3>Louez une voiture en quelques taps</h3>
								</div>
							</div>
							<div class="col-4 bg-custom d-none d-lg-block py-3 px-0 ml-5">
								<form action="/consulterOffres" method="get">
									<fieldset>
										<!-- Ville -->
										<div class="w-75 mx-auto my-3" data-validate = "indispensable">
											<label for="inputVille" class="form-label">Ville</label>
											<input class="input100 form-control" type="text" name="ville" id="inputville" placeholder="">
										</div>
										<!-- Date debut -->
										<div class="w-75 mx-auto my-3">
											<label for="input-dateDebut" class="form-label">Date début </label>
											<input class="input100 form-control" type="date" name="dateDebut" id="input-dateDebut" placeholder="">
										</div>
										<!-- Date fin -->
										<div class="w-75 mx-auto my-3">
											<label for="input-dateFin" class="form-label">Date fin </label>
											<input class="input100 form-control" type="date" name="dateFin" id="input-dateFin" placeholder="">
										</div>
										<!-- button de recherche -->
										<div class="w-50 mx-auto my-3">
											<input type="submit" value="Rechercher" class="btn btn-primary" ></input>
										</div>
									</fieldset>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class = "carousel-item">
				<img src="res/img/carousel/2.jpg" alt="" class="w-100">
			</div>

			<div class = "carousel-item">
				<img src="res/img/carousel/3.jpg" alt="" class="w-100">
			</div>
		</div>
		<!-- End Carousel Content -->


		<!-- Previous & Next Buttons -->
		<a href="#carousel" class="carousel-control-prev" role="button" data-slide="prev">
			<span class="fas fa-chevron-left fa-3x"></span>
		</a>
		<a href="#carousel" class="carousel-control-next" role="button" data-slide="next">
			<span class="fas fa-chevron-right fa-3x"></span>
		</a>

		<!-- End Previous & Next Buttons -->

	</div>
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
	<script src="js/jquery-3.5.1.min.js"></script>
	<!-- Bootstrap 4.5 JS -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Popper JS -->
	<script src="js/popper.min.js"></script>
	<!-- Font Awesome -->
	<script src="js/all.min.js"></script>

	<!-- End Script Source Files -->
</body>
</html>