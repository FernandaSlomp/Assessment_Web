<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="css/estilo.css"/>
	<title>Document</title>
	<p>Olá</p>
</head>
<body>

	<div>
		
		<c:forEach items="${results}" var="game">
			<div>
				<h5>${game.getName()}</h5>
			</div>
		</c:forEach>
       

										<form:form action="result" method="post" modelAttribute="id">
											<form:label path="palavra" class="form-label">Palavra-chave:</form:label>
											<form:input path="palavra" class="form-control"/><br/>
											<br>
											<form:button class="btn btn-primary">Enviar</form:button>
										</form:form>
	</div>
	
</body>
</html>