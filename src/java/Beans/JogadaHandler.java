package Beans;

import Model.Time;

public class JogadaHandler {

    private int qtdCliques = 0;
    private int qtdJogadas = 0;
    private int qtdAcertos = 0;
    private String cartaoDescoberto;

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
