<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, viewport-fit=cover">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Louezz</title>
<!-- Bootstrap 4.5 CSS -->
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/res/img/logo.png" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/css/bootstrap.min.css">
<!-- Style CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/style.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/css/style.css">
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700&display=swap"
	rel="stylesheet">
</head>
<script type="text/javascript">
	function myFunction() {
		i = i % 3;
		i++;
		if(i==0){i=1;}
		var s='res/img/carousel/' + i + '.jpg';
		document.getElementById("mouad").src =s;
	}

	var i = 1;
	var interval = setInterval(function() {
		myFunction();
	}, 6000);
</script>
<body>


	</div>
	<!-- Navigation -->
	<%@ include file="navbar.jsp"%>
	<!-- End Navigation -->


	<!-- Image Carousel -->

	<div id="carousel" class="carousel slide" data-ride="carousel"
		>


		<!-- Carousel Content -->
		<div class="carousel-inner">

			<div class="carousel-item active">
				<img src="${pageContext.request.contextPath}/res/img/carousel/1.jpg" id="mouad" alt="" class="w-100">

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
										<div class="w-75 mx-auto my-3" data-validate="indispensable">
											<label for="inputVille" class="form-label">Ville</label> <input
												class="input100 form-control" type="text" name="ville"
												id="inputville" placeholder="ville" required="required">
										</div>
										<!-- Date debut -->
										<div class="w-75 mx-auto my-3">
											<label for="input-dateDebut" class="form-label">Date
												début </label> <input class="input100 form-control" type="date"
												name="dateDebut" id="input-dateDebut" placeholder="" required="required">
										</div>
										<!-- Date fin -->
										<div class="w-75 mx-auto my-3">
											<label for="input-dateFin" class="form-label">Date
												fin </label> <input class="input100 form-control" type="date"
												name="dateFin" id="input-dateFin" placeholder="02-02-2020" required="required">
										</div>
										<!-- button de recherche -->
										<div class="w-50 mx-auto my-3">
											<input type="submit" value="Rechercher"
												class="btn btn-primary"></input>
										</div>
									</fieldset>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>


		</div>
		<!-- End Carousel Content -->


		<!-- Previous & Next Buttons -->
		<a href="#carousel" class="carousel-control-prev" role="button"
			data-slide="prev"> <span class="fas fa-chevron-left fa-3x"></span>
		</a> <a href="#carousel" class="carousel-control-next" role="button"
			data-slide="next"> <span class="fas fa-chevron-right fa-3x"></span>
		</a>

		<!-- End Previous & Next Buttons -->

	</div>

	<script
		src="${pageContext.request.contextPath}/res/js/jquery-3.5.1.min.js"></script>
	<!-- Bootstrap 4.5 JS -->
	<script
		src="${pageContext.request.contextPath}/res/js/bootstrap.min.js"></script>
	<!-- Popper JS -->
	<script src="${pageContext.request.contextPath}/res/js/popper.min.js"></script>
	<!-- Font Awesome -->
	<script src="${pageContext.request.contextPath}/res/js/all.min.js"></script>

	<!-- End Script Source Files -->
</body>
	<%@ include file="footer.jsp"%>

</html>