package _3_exercises;

import java.util.Scanner;

public class IMC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\"Calcular IMC\"\n");

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Agora, informe sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("\nSeu IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso ideal.");
        } else if (imc < 24.9) {
            System.out.println("Você está dentro do peso ideal.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 39.9) {
            System.out.println("Você está em obesidade nível 2.");
        } else {
            System.out.println("Cuidado! Você está em obesidade nível 3.");
        }

        sc.close();

        System.out.println("\nFim do programa!");
    }
}
