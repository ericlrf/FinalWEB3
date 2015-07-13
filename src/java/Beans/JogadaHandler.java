package Beans;

import Model.Time;

public class JogadaHandler {

    public static int qtdCliques = 0;
    public static int qtdJogadas = 0;
    public static int qtdAcertos = 0;
    public static String cartaoDescoberto;

    public int getQtdAcertos() {
        return qtdAcertos;
    }

    public void setQtdAcertos(int qtdAcertos) {
        this.qtdAcertos = qtdAcertos;
    }

    public String getCartaoDescoberto() {
        return cartaoDescoberto;
    }

    public void setCartaoDescoberto(String cartaoDescoberto) {
        this.cartaoDescoberto = cartaoDescoberto;
    }

    public int getQtdJogadas() {
        return qtdJogadas;
    }

    public void setQtdJogadas(int qtdJogadas) {
        this.qtdJogadas = qtdJogadas;
    }

    public int getQtdCliques() {
        return qtdCliques;
    }

    public void setQtdCliques(int qtdCliques) {
        this.qtdCliques = qtdCliques;
    }

    public void timeSelecionado(Time time) {
        qtdCliques++;
        if (qtdCliques % 2 == 0) {
            if (cartaoDescoberto == time.getName()) {
                qtdAcertos++;
            }
            qtdJogadas++;
        } else {
            cartaoDescoberto = time.getName();
            System.out.println(time.getName());
        }
        System.out.println(qtdCliques);
        if (qtdAcertos == 20) {
            System.out.println("Venceu o jogo!");
        }
    }
}
