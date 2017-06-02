package br.pro.ramon.ansi;

public class Program {

    public static void main(String[] args) {
        Ansi.limpaTela();

        Ansi.cor("vermelho");
        System.out.println("Este texto é vermelho...");
        Ansi.cor("verde");
        System.out.println("Este texto é verde...");
        Ansi.cor("azul");
        System.out.println("Este texto é azul...");
        Ansi.negrito(true);
        System.out.println("Este texto é azul diferente...");
        Ansi.negrito(false);
        System.out.println("Este texto é azul...");
        Ansi.cor("preto");
        System.out.print("Que ");
        Ansi.cor("ciano");
        System.out.print("cor");
        Ansi.cor("preto");
        System.out.println(" é essa?");

        System.out.println();
        System.out.println("Agora, com fundo amarelo:");
        Ansi.fundo("amarelo");

        Ansi.cor("vermelho");
        System.out.println("Este texto é vermelho...");
        Ansi.cor("verde");
        System.out.println("Este texto é verde...");
        Ansi.cor("azul");
        System.out.println("Este texto é azul...");
        Ansi.negrito(true);
        System.out.println("Este texto é azul diferente...");
        Ansi.negrito(false);
        System.out.println("Este texto é azul...");
        Ansi.cor("preto");
        System.out.print("Que ");
        Ansi.cor("ciano");
        System.out.print("cor");
        Ansi.cor("preto");
        System.out.println(" é essa?");

        Ansi.reset();
        System.out.println();
        System.out.println("De volta ao \"normal\"...");

        Ansi.guardaPosicao();
        Ansi.vaPara(7, 40);
        System.out.println("Teste de posicionamento...");
        Ansi.restauraPosicao();
        System.out.println("De volta à posição antiga...");

        Ansi.direita();
        Ansi.direita();
        Ansi.direita();
        System.out.print("3 à direita");
        Ansi.esquerda();
        Ansi.esquerda();
        Ansi.esquerda();
        System.out.println("X");
    }

}
