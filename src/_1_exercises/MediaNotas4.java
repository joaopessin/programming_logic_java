package _1_exercises;

import java.util.Scanner;

public class MediaNotas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float nota3 = sc.nextFloat();

        float somaTotal = nota1 + nota2 + nota3;
        float media = somaTotal / 3;

        System.out.println("\nMédia das notas: " + media);
    }
}
