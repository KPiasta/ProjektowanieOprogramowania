document.addEventListener("DOMContentLoaded", function () {


    var start = document.getElementById('button');


    start.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/wnioski/all";


    });


    var start1 = document.getElementById('button1');


    start1.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/druzyny/all";


    });


});