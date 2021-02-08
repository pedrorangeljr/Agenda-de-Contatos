<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		
		    <label>Id</label> <input type="text" readonly="readonly" id="id" name="id" value="${contato.id }"><br>
			<label>Nome</label> <input type="text" id="nome" required name="nome" value="${contato.nome }"><br>
			<label>Número</label> <input type="text" id="telefone" required name="telefone" value="${contato.telefone }"><br>
			<label>Email</label> <input type="email" id="email" required name="email" value="${contato.email }"><br>
			<input type="submit" value="adicionar"> <input type="submit" value="cancelar">
			
		</form>
	</div>
</body>
</html>