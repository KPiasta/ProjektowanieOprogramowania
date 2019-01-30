<%--
  Created by IntelliJ IDEA.
  User: rita-ola
  Date: 1/28/19
  Time: 2:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/style/infoDruzyny.css"%></style>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Informacje o drużynie</title>
</head>
<body>

<h2>Zarejestrowani zawodnicy</h2>

<div class="container">
    <table>
        <thead>
        <tr>
            <th>Imie</th>
            <th>Nazwisko</th>
            <th>Data urodzenia</th>
            <th>Pozycja</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${zawodnik}" var="z">
            <tr>
                <td class="name">${z.imie}</td>
                <td class="lastName">${z.nazwisko}</td>
                <td class="birthDate">${z.data_urodzenia}</td>
                <td class="position">${z.pozycja}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
