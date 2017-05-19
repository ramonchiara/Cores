package br.pro.ramon.ansi;

import static br.pro.ramon.ansi.Ansi.cor;
import static br.pro.ramon.ansi.Ansi.fundo;
import static br.pro.ramon.ansi.Ansi.limpaTela;
import static br.pro.ramon.ansi.Ansi.negrito;
import static br.pro.ramon.ansi.Ansi.reset;

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

}
