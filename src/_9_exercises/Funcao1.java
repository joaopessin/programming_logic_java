package _9_exercises;

import java.util.Scanner;

public class Funcao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um valor: ");
        int valorEscolhido = sc.nextInt();

        System.out.print("\n");

        imprimirPrograma(valorEscolhido);
        sc.close();
    }

    private static void imprimirPrograma(int valor) {
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.print("\n");
        }
    }
}
