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
		<form action="cadastroContatos" method="post" class="form-contato" id="formUser"
		 onsubmit="return validarCampos() ? true : false">
		
			<label>Nome</label> <input type="text" id="nome"  name="nome" value="${contato.nome }"><br>
			<label>Número</label> <input type="text" id="telefone"  name="telefone" value="${contato.telefone }"><br>
			<label>Email</label> <input type="email" id="email"  name="email" value="${contato.email }"><br>
			<input type="submit" value="adicionar"> 
			<input type="submit" value="cancelar" onclick="document.getElementById('formUser').action ='cadastroContatos?acao=reset'">
			
		</form>
	</div>
	
	<script type="text/javascript">
	
	       function validarCampos() {
	    	   
	    	   if(document.getElementById("nome").value == '') {
	    		   
	    		   alert("Informe o nome");
	    		   break;
	    	   }
	    	   else if(document.getElementById("telefone").value == '') {
	    		   
	    		   alert("Informe o Telefone");
	    		   break;
	    	   }
	    	   else if(document.getElementById("email").value == '') {
	    		   
	    		   alert("Informe o email");
	    		   break;
	    	   }
	    	   
	    	   return true;
	       }
	 
	</script>
</body>
</html>