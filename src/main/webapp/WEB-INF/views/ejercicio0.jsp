<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ejercicio 0</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

	<h6>Lima, ${fecha}</h6>

	<form action="index.html" method="post">
		Usuario: <input type="text" name="idUsuario" value="" /> <br />
		Clave: <input type="password" name="clave" value="" /><br /> <input
			type="submit" value="Iniciar sesión" />
	</form>

	<h6>${mensaje}</h6>

</body>
</html>

