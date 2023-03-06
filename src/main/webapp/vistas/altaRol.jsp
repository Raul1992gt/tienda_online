<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta rol</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
	body {
  background-image: url("/img/fondo.jpg");
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
</head>
<body>

<jsp:include page="inicio.jsp"></jsp:include>

<div class="container" style="background-color: rgba(51, 51, 51, 0.6); color: white; border-radius: 25px">
	<h3 class="text-danger">${mensaje }</h3>

	<h1>Alta Rol</h1>
	<form action="/rol/alta" method="post">
		<div class="form-group">
			<label for="idRol">Id Rol:</label> 
			<input type="number"
				class="form-control" 
				id="idRol" 
				name="idRol"
				required>
		</div>
		<div class="form-group">
			<label for="nombre">Nombre:</label> 
			<input
				type="text" 
				class="form-control" 
				id="nombre"
				name="nombre" 
				minlength="3" 				
				required>
		</div>
		<button type="submit" class="btn btn-primary">Enviar</button>
		<button type="reset" class="btn btn-secondary">Borrar</button>
		<a href="/rol/roles" class="btn btn-primary"> Volver</a>
	</form>
</div>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>