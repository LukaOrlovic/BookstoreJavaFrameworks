<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html>

<head>
<title>Pocetna strana</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>POCETNA STRANA</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">


			<h1>
				Dobro dosli na zvanicnu stranicu nase knjzare. 
				Ispod izaberite da li zelite da radite sa:
				Autorima, Knjigama ili Racunima.
			</h1>
			<p>
				<a href="${pageContext.request.contextPath}/autor/list">Autori</a>
			</p>

			<p>
				<a href="${pageContext.request.contextPath}/knjiga/list">Knjige</a>
			</p>
			
			<p>
				<a href="${pageContext.request.contextPath}/racun/list">Racuni</a>
			</p>

		</div>

	</div>

</body>

</html>