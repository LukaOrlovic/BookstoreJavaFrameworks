<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>


<html>

<head>
<title>Sacuvaj knjigu</title>
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
		<h3>Cuvanje nove knjige</h3>
	</div>

	<form:form action="saveKnjiga" modelAttribute="knjiga" method="POST">

		<form:hidden path="sifraKnjige"/>

		<table>

			<tbody>


				<tr>
					<td><label>Naziv knjige:</label></td>
					<td><form:input path="nazivKnjige" value="${knjiga.nazivKnjige}"/></td>
				</tr>
				<tr>
					<td><label>Zanr:</label></td>
					<td><form:input path="zanr" value="${knjiga.zanr}"/></td>

				</tr>
				<tr>
					<td><label>Cena:</label></td>
					<td><form:input path="cena" /></td>

				</tr>

				<c:if test="${autor!=null}">Autor je:${autor}. Stopa je: ${poreskaStopa}</c:if>
				<form:select path="autor">
					<form:option value="NONE"> --SELECT--</form:option>
					<form:options items="${autori}"></form:options>
				</form:select>



				<form:select path="poreskaStopa">
					<form:option value="NONE"> --SELECT--</form:option>
					<form:options items="${stope}"></form:options>
				</form:select>


				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Sacuvaj" class="save" /></td>

				</tr>

			</tbody>
		</table>


	</form:form>
	
	






	<div style=""></div>
	<p>
		<a href="${pageContext.request.contextPath}/knjiga/list">Nazad</a>
	</p>


</body>

</html>