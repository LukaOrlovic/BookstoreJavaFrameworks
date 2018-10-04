<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>


<html>

<head>
<title>Lista knjiga</title>

<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>SVE KNJIGE</h2>
		</div>
	</div>

	<div id="container">

		<div id="content">

				<input type="button" value="Dodaj knjigu"
				onClick="window.location.href='showFormAddKnjiga'; return false;"
				class="add-button"
			/>
			<table>
				<tr>
					<th>ID</th>
					<th>Naziv knjige</th>
					<th>Zanr</th>
					<th>Cena</th>
					<th>ID stope</th>
					<th>Ime i prezime autora</th>
					<th>Azuriraj</th>
				</tr>

				<c:forEach var="tempKnjiga" items="${knjige}">
				
					<c:url var="updateLink" value="/knjiga/azurirajForma">
						<c:param name="sifraKnjige" value="${tempKnjiga.sifraKnjige}"></c:param>
					</c:url>
					
					<c:url var="deleteLink" value="/knjiga/izbrisi">
						<c:param name="sifraKnjige" value="${tempKnjiga.sifraKnjige}"></c:param>
					</c:url>
					
					<tr>
						<td>${tempKnjiga.sifraKnjige}</td>
						<td>${tempKnjiga.nazivKnjige}</td>
						<td>${tempKnjiga.zanr}</td>
						<td>${tempKnjiga.cena}</td>
						<td>${tempKnjiga.poreskaStopa}</td>
						<td><a href="${pageContext.request.contextPath}/autor/list">${tempKnjiga.autor}
						</a></td>
						<td>
							<a href="${updateLink}">Azuriraj</a>
							|
							<a href="${deleteLink}"
							onclick="if (!(confirm('Jeste li sigurni da zelite da obriste ovu knjigu?'))) return false">Izbrisi</a>
						</td>
					</tr>
				</c:forEach>
			</table>

		</div>

	</div>
</body>

</html>