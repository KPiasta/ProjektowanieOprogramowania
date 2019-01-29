<%--
  Created by IntelliJ IDEA.
  User: lordmordulec
  Date: 18.01.19
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <title>Wniosek</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <script><%@include file="/WEB-INF/js/wniosek.js"%> </script>
</head>
<body>

<span>
<div class="container">
    <h2>Trener: ${wniosek.skladajacy}

        <div style="float:RIGHT;" class="dropdown">
        <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Zmien Status
            <span class="caret"></span></button>
        <ul class="dropdown-menu">

            <li><a href="http://localhost:8080/wnioski/${wniosek.id}/status/0">Zaakceptowany</a></li>
            <li><a href="http://localhost:8080/wnioski/${wniosek.id}/status/1">Niezaakceptowany</a></li>
            <li><a href="http://localhost:8080/wnioski/${wniosek.id}/status/2">Niezweryfikowany</a></li>
            <li><a href="http://localhost:8080/wnioski/${wniosek.id}/status/3">Odrzucony</a></li>
        </ul>
        </div>
    </h2>
    <h2>Status:${wniosek.status}
       <a style="float:RIGHT;" href="http://localhost:8080/wnioski/all">Wyświetl listę wniosków</a>
    </h2>
    <h2>Nazwa Druzyny: ${wniosek.druzyna}</h2>
    <h2>Data zlozenia wniosku: ${wniosek.data}</h2>
    <h2>Zawodnicy:</h2>

    <ul class="list-group">
        <c:forEach items="${zawodnicy}" var="z">
            <li class="list-group-item">${z.imie}  ${z.nazwisko}</li>
        </c:forEach>

    </ul>
</div>

</body>
</html>
