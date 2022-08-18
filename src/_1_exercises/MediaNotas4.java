package _1_exercises;

import java.util.Scanner;

public class MediaNotas4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        Double nota1 = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite a segunda nota: ");
        Double nota2 = scanner2.nextDouble();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Digite a terceira nota: ");
        Double nota3 = scanner3.nextDouble();

        Double total = nota1 + nota2 + nota3;
        Double media = total / 3;

        System.out.println("Total: " + total);
        System.out.println("Media das notas: " + media);
    }
}
