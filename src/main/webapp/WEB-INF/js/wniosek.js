document.addEventListener("DOMContentLoaded", function () {

    var return1 = document.getElementById('return');

    return1.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/wnioski/all";
    });
}