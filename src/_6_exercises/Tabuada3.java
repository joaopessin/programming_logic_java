package _6_exercises;

import java.util.Scanner;

public class Tabuada3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorInformado = 0;

        System.out.print("Informe um número para exibir sua tabuada: ");
        valorInformado = entrada.nextShort();

        for (int i = 1; i <= 10; i++) {
            int resultadoMultiplicacao = i * valorInformado;

            System.out.println(i + " x " + valorInformado + " = " + resultadoMultiplicacao);
        }
    }
}
