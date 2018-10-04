<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>


<html>

<head>
<title>Sacuvaj autora</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/add-customer-style.css" />


</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Knjizara</h2>
		</div>

	</div>

	<div id="container">
		<h3>Cuvanje novog autora</h3>
	</div>

	<form:form action="saveAutor" modelAttribute="autor" method="POST">

		<table>

			<tbody>

				
				<tr>
					<td><label>Ime i prezime:</label></td>
					<td><form:input path="imePrezime" /></td>
				</tr>
				<tr>	
					<td><label>Pol:</label></td>
					<td><form:input path="pol" /></td>

				</tr>
				<tr>	
					<td><label></label></td>
					<td><input type="submit" value="Sacuvaj" class="save" /></td>

				</tr>

			</tbody>
		</table>


	</form:form>
	
	<div style="clear; both;"></div>
	<p>
		<a href="${pageContext.request.contextPath}/autor/list">Nazad</a>
	</p>


</body>

</html>