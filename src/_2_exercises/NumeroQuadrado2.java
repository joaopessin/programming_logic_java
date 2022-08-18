package _2_exercises;

import java.util.Scanner;

public class NumeroQuadrado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\"Calcular o Quadrado do Número\"");    // (/" texto /") = Deixar o texto entre aspas.
        System.out.print("\nDigite um número: ");   // (\n) = Qubrar linha.

        float numeroInserido = sc.nextFloat();
        float quadradoDoNumero = numeroInserido * numeroInserido;

        System.out.println(numeroInserido + " x " + numeroInserido + " = " + quadradoDoNumero);

        sc.close();
    }
}
