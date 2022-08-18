package _5_exercises;

import java.util.Scanner;

public class CalculadoraSimples1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float valor1 = 0.0F, valor2 = 0.0F;
        byte operacao = 0;

        System.out.println("\"Calculadora Simples\"\n");
        System.out.print("Digite o primeiro valor: ");
        valor1 = entrada.nextFloat();

        System.out.print("Agora, digite o segundo valor: ");
        valor2 = entrada.nextFloat();

        System.out.println("\nInforme a operação desejada: \n1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão");
        System.out.print("Opção: ");
        operacao = entrada.nextByte();

        System.out.print("\n");

        float somarValores = (float) valor1 + valor2;
        float subtrairValores = (float) valor1 - valor2;
        float multiplicarValores = (float) valor1 * valor2;
        float dividirValores = (float) valor1 / valor2;

        if(operacao == 1) {
            System.out.println(valor1 + " + " + valor2 + " = " + somarValores);
        } else if(operacao == 2) {
            System.out.println(valor1 + " - " + valor2 + " = " + subtrairValores);
        } else if (operacao == 3) {
            System.out.println(valor1 + " * " + valor2 + " = " + multiplicarValores);
        } else if (operacao == 4) {
            System.out.println(valor1 + " / " + valor2 + " = " + dividirValores);
        } else {
            System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}
