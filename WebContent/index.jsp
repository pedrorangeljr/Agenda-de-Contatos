<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/stilo.css">
<title>Login</title>
</head>
<body>

  <div class="container-login">

		<h1>Login Usuário</h1>

		<form action="LoginServlet" class="login" method="post">
			<input type="text" id="login" name="login" placeholder="Login">
			<br> <input type="password" id="senha" name="senha"
				placeholder="senha"> <br> <input class="btn"
				type="submit" value="Logar">
		</form>

	</div>

</body>
</html>