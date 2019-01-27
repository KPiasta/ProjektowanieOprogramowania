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

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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


<div>
    <div style="float:LEFT;">
        <h3>Złożone wnioski</h3>
    </div>
    <div style="float:RIGHT;">

        <form method="post">
            <fieldset>
                <input type="checkbox"> Zaakceptowane
                <input type="checkbox"> Niezaakceptowane<br>
                <input type="checkbox"> Niezweryfikowane
                <input type="checkbox"> Odrzucone<br>
                <input type="submit"  value="Filtruj" />
            </fieldset>
        </form>
    </div>
</div>

    <div class="container">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>Drużyna</th>
                <th>Data</th>
                <th>Składający</th>
                <th>Status</th>
                <th>Akcja</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${wnioski}" var="w">
                <tr>
                    <td>${w.druzyna}</td>
                    <td>${w.data}</td>
                    <td>${skladajacy}</td>
                    <td>${status}</td>
                    <td><a href="http://localhost:8080/wnioski/${w.id}"> Weryfikuj</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>



</div>

</body>
</html>
