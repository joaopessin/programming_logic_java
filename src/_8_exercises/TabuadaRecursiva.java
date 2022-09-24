package _53_logica_8_7;

import java.util.Scanner;

public class TabuadaRecursiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = sc.nextInt();

        System.out.print("\n");
        imprimirTabuada(valor);
    }

    private static void imprimirTabuada(int numero) {
        imprimirTabuada(numero, 1);
    }

    private static void imprimirTabuada(int numero, int i) {
        System.out.println(i + " x " + numero + " = " + (i * numero));

        if (++i <= 10) {
            imprimirTabuada(numero, i);
        }
    }
}
