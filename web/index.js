function myTimer() {
    var dom = document.getElementsByTagName("input");
    for (i = 0; i < dom.length; i++)
    {
        var celulas = dom[i];
        var imagem = celulas.src;
        console.log();
        if(imagem.contains("http://localhost:8084/JSF-JogoDaMemoria/faces/brasoes/"));
        {
            celulas.src = "http://localhost:8084/JSF-JogoDaMemoria/faces/brasoes/background.jpg";
        }
//    alert(celulas.src);
    }
}

function init() {
    var myVar = setTimeout(function() {
        myTimer();
    }, 2000);
}

onload = init;