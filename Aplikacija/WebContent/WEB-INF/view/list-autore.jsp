<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html>

<head>
<title>Lista autora</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>SVI NASI AUTORI</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

			<input type="button" value="Dodaj autora"
				onClick="window.location.href='showFormAddAutor'; return false;"
				class="add-button"
			/>

			<table>
				<tr>
					<th>ID</th>
					<th>Ime i prezime</th>
					<th>Pol</th>
				</tr>

				<c:forEach var="tempAutor" items="${autori}">
					<tr>
						<td>${tempAutor.idAutora}</td>
						<td>${tempAutor.imePrezime}</td>
						<td>${tempAutor.pol}</td>
					</tr>
				</c:forEach>
			</table>

		</div>

	</div>

</body>

</html>