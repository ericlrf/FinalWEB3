function myTimer() {
    var dom = document.getElementsByTagName("input");
    for(i=0; i < i.length; i++)
    {
        console.log(dom[i]);
    }
}

function init() {
    var myVar = setInterval(function() {myTimer();}, 2000);
}

onload = init;