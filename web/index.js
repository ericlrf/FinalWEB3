function myTimer() {
    var dom = document.getElementsByTagName("input");
    for (i = 1; i < 41; i++)
    {
        var celulas = dom[i];
        var imagem = celulas.src;
//        console.log(imagem);
        celulas.src = "brasoes/background.jpg";
    }
}

function reiniciar() {
    var myVar = setTimeout(function() {
        myTimer();
    }, 2000);
}

function init() {
    var botaoRestart = document.getElementsByTagName("input");
    console.log(botaoRestart[41]);
    botaoRestart[41].onsubmit = reiniciar();
}

onload = init;