package _3_exercises;

import java.util.Scanner;

public class Funcao3 {
    public static void main(String[] args) {
        somaTresValores();
    }

    private static void somaTresValores() {
        Scanner sc = new Scanner(System.in);
        Float somaValores = 0.0F;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Informe o " + i + "º valor: ");
            somaValores += sc.nextFloat();
        }

        System.out.println("\nResultado da soma dos valores: " + somaValores);
    }
}
