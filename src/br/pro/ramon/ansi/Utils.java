package br.pro.ramon.ansi;

public class Utils {

    public static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
        }
    }

    public static void digita(String texto, int intervalo) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            sleep(intervalo);
        }
    }

    public static void digita(String texto) {
        digita(texto, 50);
    }

    public static void digitaLinha(String texto, int intervalo) {
        digita(texto, intervalo);
        System.out.println();
    }

    public static void digitaLinha(String texto) {
        digitaLinha(texto, 50);
    }

}
