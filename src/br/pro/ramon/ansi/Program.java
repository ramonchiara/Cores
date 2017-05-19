package br.pro.ramon.ansi;

public class Program {

    public static void main(String[] args) {
        limpaTela();

        cor("vermelho");
        System.out.println("Este texto é vermelho...");
        cor("verde");
        System.out.println("Este texto é verde...");
        cor("azul");
        System.out.println("Este texto é azul...");
        negrito(true);
        System.out.println("Este texto é azul diferente...");
        negrito(false);
        System.out.println("Este texto é azul...");
        cor("preto");
        System.out.print("Que ");
        cor("ciano");
        System.out.print("cor");
        cor("preto");
        System.out.println(" é essa?");

        System.out.println();
        System.out.println("Agora, com fundo amarelo:");
        fundo("amarelo");

        cor("vermelho");
        System.out.println("Este texto é vermelho...");
        cor("verde");
        System.out.println("Este texto é verde...");
        cor("azul");
        System.out.println("Este texto é azul...");
        negrito(true);
        System.out.println("Este texto é azul diferente...");
        negrito(false);
        System.out.println("Este texto é azul...");
        cor("preto");
        System.out.print("Que ");
        cor("ciano");
        System.out.print("cor");
        cor("preto");
        System.out.println(" é essa?");

        reset();
        System.out.println();
        System.out.println("De volta ao \"normal\"...");
    }

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

}
