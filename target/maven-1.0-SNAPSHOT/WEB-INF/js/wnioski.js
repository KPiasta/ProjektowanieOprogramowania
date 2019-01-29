document.addEventListener("DOMContentLoaded", function () {


    var f0 = document.getElementById('f0');
    var f1 = document.getElementById('f1');
    var f2 = document.getElementById('f2');
    var f3 = document.getElementById('f3');


    f0.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/wnioski/filter/0";
    });


    f1.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/wnioski/filter/1";
    });


    f2.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/wnioski/filter/2";
    });


    f3.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/wnioski/filter/3";
    });


});