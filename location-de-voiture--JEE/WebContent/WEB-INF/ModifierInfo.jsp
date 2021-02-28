<%@page import="com.modules.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, viewport-fit=cover">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>louezz</title>
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath}/res/img/logo.png" />
<!-- Bootstrap 4.5 CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/css/bootstrap.min.css">
<!-- Style CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/css/style0.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/res/css/style00.css">
<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700&display=swap"
	rel="stylesheet">

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN"
	crossorigin="anonymous">



</head>
<%
	User user = (User) request.getAttribute("user");
%>

<script type="text/javascript">
	function myFunction() {
		i = i % 6;
		i++;
		if (i == 0) {
			i = 1;
		}
		document.getElementById("mouad").style = 'background-image: url('
				+ 'res/img/' + i + '.jpg)';
	}

	var i = 1;
	var interval = setInterval(function() {
		myFunction();
	}, 6000);
</script>

<body id="mouad"
	style="background-image: url('${pageContext.request.contextPath}/res/img/ins.png');">


	<!-- Navigation -->
	<%@ include file="navbar.jsp"%>



	<div class="box">

		<div class="row content">

			<div class="container">
				<div class="col-12 mt-2"></div>
				<div class="row top-buffer">
					<div class="col-md-3 col-sm-0"></div>
					<div class="col-md-6 col-sm-12 mb-sm-5">
						<form method="post" action="profile?action=changeinfo"
							class="px-3">
							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fa fa-user mr-1"></i> Prenom</label>
								<div class="col-sm-10 col-md-9">

									<input type="text" class="form-control"
										id="exampleFormControlInput1" placeholder="Nom Societ"
										name="firstname" value="<%=user.getPrenom()%>">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fa fa-user mr-1"></i> Nom</label>
								<div class="col-sm-10 col-md-9">

									<input type="text" class="form-control"
										id="exampleFormControlInput1" placeholder="Nom Societ"
										name="lastname" value="<%=user.getNom()%>">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fas fa-phone-square-alt mr-2"></i>Tel</label>
								<div class="col-sm-10 col-md-9">

									<input type="text" class="form-control"
										id="exampleFormControlInput1" placeholder="Tel" name="telephone"
										value="<%=user.getTelephone()%>">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fas fa-phone-square-alt mr-2"></i>Date of birth:</label>
								<div class="col-sm-10 col-md-9">



									<input type="Date" name="date" class="form-control"
										id="exampleFormControlInput1" value="<%=user.getDate_naissance()%>" required="required"> 
								</div>
							</div>




							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fas fa-city mr-2"></i>adresse</label>
								<div class="col-sm-10 col-md-9">

									<input type="text" class="form-control"
										id="exampleFormControlInput1" placeholder="ville" name="adress"
										value="<%=user.getAdresse_utilisateur()%>">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fas fa-globe-africa mr-2"></i>CIN</label>
								<div class="col-sm-10 col-md-9">

									<input type="text" class="form-control"
										id="exampleFormControlInput1" placeholder="pays"
										name="cin" value="<%=user.getCin()%>">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail"
									class="col-sm-2 col-form-label col-md-3"><i
									class="fas fa-map-marked mr-2"></i>Num permis</label>
								<div class="col-sm-10 col-md-9">

									<input type="text" class="form-control"
										id="exampleFormControlInput1" placeholder="rue" name="num_permis"
										value="<%=user.getNum_permis()%>">
								</div>
							</div>

							<div class="form-group row justify-content-end">
								<div class="col-sm-10 col-md-9">
									<button class="btn btn-danger btn-sm co">Modiffier</button>
								</div>

							</div>

						</form>
					</div>
					<div class="col-sm-0 col-md-3"></div>
				</div>
			</div>
		</div>

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

</body>
	<%@ include file="footer.jsp"%>

</html>