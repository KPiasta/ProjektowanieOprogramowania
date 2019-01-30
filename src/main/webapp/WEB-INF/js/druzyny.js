document.addEventListener("DOMContentLoaded", function () {



    var backButton = document.getElementById('buttonBack');

    backButton.addEventListener('click', function (event) {
        event.preventDefault();
        window.location = "http://localhost:8080/";
    });

    var buttonPrint = document.getElementById('buttonPrint');

    var checkElements = document.getElementsByClassName('checkbox');

    // checkElements.onchange = function(){
    //     buttonPrint.disabled = !!this.checked;
    // };

    console.log(buttonPrint);
    console.log(checkElements);


    var teamElements = document.getElementsByClassName('teamName');

    for(var i=0; i<teamElements.length; i++) {
        teamElements[i].innerHTML;
       // result.innerHTML += teamElements[i].innerHTML + ' \n';
    }

    var seasonElements = document.getElementsByClassName('season');

    for(var i=0; i<seasonElements.length; i++) {
        seasonElements[i].innerHTML;
       // result2.innerHTML += seasonElements[i].innerHTML + ' \n';
    }



    buttonPrint.onclick = function (event) {
        var indices = [];
        for(var i=0; i<checkElements.length; i++) {
            if(checkElements[i].checked) {
                indices.push(i);
            }
        };
        var text = [];

        for(var i=0; i<indices.length; i++) {
            text.push(teamElements[indices[i]].innerHTML + ' ' +seasonElements[indices[i]].innerHTML);
        }

        //var text = indices[i].value;
        var filename = "raport.txt";

        download(filename, text.join(' \n'));

        event.preventDefault();


    };

    function download(filename, text) {
        var element = document.createElement('a');
        element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(text));
        element.setAttribute('download', filename);

        element.style.display = 'none';
        document.body.appendChild(element);

        element.click();

        document.body.removeChild(element);
    };

        // Generate download of hello.txt file with some content




});


