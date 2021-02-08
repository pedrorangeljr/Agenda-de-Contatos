<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
      <a href="cadastroContatos?acao=listartodos"></a>
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
         <c:forEach items="${contatos }" var="contato">
         
           <td><c:out value="${contato.id }"></c:out></td>
           <td><c:out value="${contato.nome }"></c:out></td>
           <td><c:out value="${contato.telefone }"></c:out></td>
           <td><c:out value="${contato.email }"></c:out></td>
           <td><button class="btn-editar"><a href="cadastroContatos?acao=editar&contato=${contato.nome }">Editar</a></button></td>
           <td><button class="btn-excluir"><a href="cadastroContatos?acao=delete&contato=${contato.nome }">Excluir</a></button></td>
           
       </tr>
       </c:forEach>
      </table>
  </div>
  
</body>
</html>