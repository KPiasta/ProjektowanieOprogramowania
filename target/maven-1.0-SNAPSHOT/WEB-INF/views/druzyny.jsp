
<%--
  Created by IntelliJ IDEA.
  User: rita-ola
  Date: 1/21/19
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style><%@include file="/WEB-INF/style/druzyny.css"%></style>
    <script><%@include file="/WEB-INF/js/druzyny.js"%> </script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--%>
    <title>Druzyny</title>
</head>

<body>



    <h2>Zarejestrowane drużyny</h2>

    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Nazwa drużyny</th>
                <th>Sezon</th>
                <th>Drukuj</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${druzyny}" var="d">
                <tr>
                    <td class="teamName">${d.nazwa}</td>
                    <td class="season">${d.sezon}</td>
                    <td>
                        <input class="checkbox" type="checkbox" onchange="document.getElementById('buttonPrint').disabled = !this.checked;"/>
                    </td>
                    <td><a href="http://localhost:8080/druzyny/${d.id}/info"> Info</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div>

            <form method="post">
                <fieldset>
                    <button class=".center-block" id="buttonPrint">Drukuj</button>
                    <button class=".center-block" id="buttonBack">Powrót</button><br>
                </fieldset>
            </form>
        </div>
        <div id="result"></div>
    </div>

    <div>
        <div id="result2"></div>
    </div>

    <div>
        <div id="result3"></div>
    </div>







</body>
</html>
