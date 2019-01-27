<%--
  Created by IntelliJ IDEA.
  User: lordmordulec
  Date: 18.01.19
  Time: 18:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <h1>Trener: ${wniosek.skladajacy}</h1>
    <h1>Nazwa Druzyny: ${wniosek.druzyna}</h1>
    <h1>Data: ${wniosek.data}</h1>
    <h1>Zawodnicy:</h1>
    

    <form action="/action_page.php">
        <div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" class="form-control" id="email">
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" class="form-control" id="pwd">
        </div>
        <div class="checkbox">
            <label><input type="checkbox"> Remember me</label>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>

</head>
<body>

</body>
</html>