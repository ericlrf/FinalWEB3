function myTimer() {
    var dom = document.getElementsByTagName("input");
    for (i = 0; i < dom.length; i++)
    {
        var celulas = dom[i];
        console.log(celulas.src);
//    alert(celulas.src);
    }
}

function init() {
    var myVar = setTimeout(function() {
        myTimer();
    }, 2000);
}

onload = init;