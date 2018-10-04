<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>


<html>

<head>
	<title>
		Lista knjiga
	</title>
	<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

<div id="container">

		<div id="content">
	<table>
		<tr>
			<th>ID racuna</th>
			<th>Ukupan iznos</th>
			<th>Datum</th>
			<th>Prodavac</th>
		</tr>
		
		<c:forEach var="tempRacun" items="${racuni}">
			<tr>
				<td> ${tempRacun.idRacuna}</td>
				<td>${tempRacun.ukupanIznos}</td>
				<td>${tempRacun.datum}</td>
				<td>${tempRacun.prodavac}</td>
			</tr>
		</c:forEach>
	</table>
</div></div>
</body>

</html>