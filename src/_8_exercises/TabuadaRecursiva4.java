package _8_exercises;

import java.util.Scanner;

public class TabuadaRecursiva4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um valor: ");
        int valor = sc.nextInt();

        quebraLinha();
        imprimirTabuada(valor);
        quebraLinha();
    }

    private static void quebraLinha() {
        System.out.print("\n");
    }

    private static void imprimirTabuada(int numero) {
        imprimirTabuada(numero, 1);
    }

    private static void imprimirTabuada(int numero, int i) {
        Integer[] resultados = calcularTabuada(numero, i);

        System.out.println(i + " x " + numero + " = " + resultados[(i - 1)]);

        if (++i <= 10) {
            imprimirTabuada(numero, i);
        }
    }

    private static Integer[] calcularTabuada(int numero, int i) {
        Integer[] resultados = new Integer[10];
        resultados[(i - 1)] = numero * i;

        if (++i <= 10) {
            calcularTabuada(numero, i);
        } 

        return resultados;
    }
}
