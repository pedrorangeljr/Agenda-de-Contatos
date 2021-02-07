<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/stilo.css">
<title>contatos</title>
</head>
<body>
     	<div class="formulario">
		<h1>Adicionar Contatos</h1>
		<form action="cadastroContatos" method="post" class="form-contato">
			<label>Nome</label> <input type="text" id="nome" name="nome"><br>
			<label>Número</label> <input type="text" id="telefone" name="telefone"><br>
			<label>Email</label> <input type="email" id="email" name="email"><br>
			<input type="submit" value="adicionar"> <input type="submit" value="cancelar">
		</form>
	</div>
</body>
</html>