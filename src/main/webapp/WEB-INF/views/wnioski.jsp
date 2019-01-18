<%--
  Created by IntelliJ IDEA.
  User: lordmordulec
  Date: 04.09.17
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style>

        #button {

            background-color: greenyellow;
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
            color: black;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;

        }

    </style>
    <script>
        document.addEventListener("DOMContentLoaded" , function () {
            var logout = document.getElementById("button");

            logout.addEventListener('click', function (event) {

                event.preventDefault();

                window.location = 'http://localhost:8080/home';


            });
        });

    </script>

    <title>Wnioski</title>

    <html>

<body>

<div class="container ">
    <ul class="nav nav-tabs" role="tablist">
        <li class="active"><a>Przegladaj wnioski</a></li>
        <li> <a>Przeglądaj zawodników</a></li>
        <li> <a>Przeglądaj drużyny</a> </li>
        <li> <a>Wyloguj</a></li>
    </ul>

    <h2>Złożone wniski</h2>

    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Drużyna</th>
                <th>Data</th>
                <th>Składający</th>
                <th>Status</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>Druzyna1</td>
                <td>2012-12-02</td>
                <td>Jan Nowak</td>
                <td>niezweryfikowany</td>
            </tr>
            <tr>
                <td>Druzyna1</td>
                <td>2012-12-02</td>
                <td>Jan Nowak</td>
                <td>niezweryfikowany</td>
            </tr>
            <c:forEach items="${wnioski}" var="w">
                <tr>
                    <td>${w.druzyna}</td>
                    <td>2012-12-02</td>
                    <td>Jan Nowak</td>
                    <td>niezweryfikowany</td>
                </tr>
            </c:forEach>
            <tr>
                <td>Druzyna1</td>
                <td>2012-12-02</td>
                <td>Jan Nowak</td>
                <td>niezweryfikowany</td>
            </tr>
            </tbody>
        </table>
    </div>

    <div style="float:left;">
        <form method="post">
            <fieldset>
                <legend>Wyswietl</legend>
                <input type="checkbox"> Zaakceptowane<br>
                <input type="checkbox"> Niezaakceptowane<br>
                <input type="checkbox"> Niezweryfikowane<br>
                <input type="checkbox"> Odrzucone<br>

                <input type="submit" value="Filtruj" />
            </fieldset>
        </form>
    </div>


</div>

</body>
</html>
