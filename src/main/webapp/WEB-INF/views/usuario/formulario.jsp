<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="container">

		<h2>Registro de Usuario</h2>
		<form:form method="POST" action="usuario/crear"
			modelAttribute="usuario">
			<div class="form-group">
				<form:label path="cuenta" class="col-sm-2 col-form-label" >Cuenta</form:label>
				<form:input path="cuenta" />
			</div>
			<div class="form-group">
				<form:label path="clave" class="col-sm-2 col-form-label">Clave</form:label>
				<form:password path="clave" />
			</div>
			<div class="form-group">
				<form:label path="direccion" class="col-sm-2 col-form-label">Direcci&oacute;n</form:label>
				<form:textarea path="direccion" rows="5" cols="30" />
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>

		<!-- Content here -->
	</div>
</body>
</html>

