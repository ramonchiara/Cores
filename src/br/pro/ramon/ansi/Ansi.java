package br.pro.ramon.ansi;

public class Ansi {

    public static void limpaTela() {
        System.out.printf("\u001b[2J");
    }

    public static void reset() {
        System.out.printf("\u001b[0m");
    }

    public static void negrito(boolean ligado) {
        if (ligado) {
            System.out.printf("\u001b[1m");
        } else {
            System.out.printf("\u001b[22m");
        }
    }

    public static void cor(String cor) {
        int valor = 0;

        switch (cor.toLowerCase()) {
            case "preto":
            case "preta":
                valor = 30;
                break;
            case "vermelho":
            case "vermelha":
                valor = 31;
                break;
            case "verde":
                valor = 32;
                break;
            case "amarelo":
            case "amarela":
                valor = 33;
                break;
            case "azul":
                valor = 34;
                break;
            case "magenta":
                valor = 35;
                break;
            case "ciano":
                valor = 36;
                break;
            case "branco":
            case "branca":
                valor = 37;
                break;
        }

        System.out.printf("\u001b[%dm", valor);
    }

    public static void fundo(String cor) {
        int valor = 0;

        switch (cor.toLowerCase()) {
            case "preto":
            case "preta":
                valor = 40;
                break;
            case "vermelho":
            case "vermelha":
                valor = 41;
                break;
            case "verde":
                valor = 42;
                break;
            case "amarelo":
            case "amarela":
                valor = 43;
                break;
            case "azul":
                valor = 44;
                break;
            case "magenta":
                valor = 45;
                break;
            case "ciano":
                valor = 46;
                break;
            case "branco":
            case "branca":
                valor = 47;
                break;
        }

        System.out.printf("\u001b[%dm", valor);
    }

    public static void vaPara(int linha, int coluna) {
        System.out.printf("\u001b[%d;%dH", linha, coluna);
    }

    public static void guardaPosicao() {
        System.out.printf("\u001b[s");
    }

    public static void restauraPosicao() {
        System.out.printf("\u001b[u");
    }

    public static void cima() {
        System.out.printf("\u001b[1A");
    }

    public static void baixo() {
        System.out.printf("\u001b[1B");
    }

    public static void direita() {
        System.out.printf("\u001b[1C");
    }

    public static void esquerda() {
        System.out.printf("\u001b[1D");
    }

}
