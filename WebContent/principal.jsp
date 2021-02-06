<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/stilo.css">
<title>Agenda Contatos</title>
</head>
<body>
      
         
     <header class="conteiner-header">
      <h2>agenda contatos</h2>
      <div class="adicionar-contatos">
          <a href="contatos.jsp">Adicionar</a>
      </div>
  </header> 
  <h1>Lista de contatos</h1>
  <div class="container-tabela">
      <table class="table">
       <tr>
           <td>ID</td>
           <td>NOME</td>
           <td>TELEFONE</td>
           <td>EMAIL</td>
           <td>AÇÕES</td>
       </tr>
       <tr>
           <td>1</td>
           <td>pedro</td>
           <td>211111</td>
           <td>pedro@gmail.com</td>
           <td><button class="btn-vizualizar"><a href="">Visualizar</a></button></td>
           <td><button class="btn-editar"><a href="">Editar</a></button></td>
           <td><button class="btn-excluir"><a href="">Excluir</a></button></td>
           
       </tr>
      </table>
  </div>
  
</body>
</html>