package _9_exercises;

import java.util.Scanner;

public class Funcao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolhaUsuario = null;

        do {
            Float horarioDefinido = 0.0F, horarioFormatado = 0.0F;

            System.out.print("Informe o horário: ");
            horarioDefinido = sc.nextFloat();

            horarioFormatado = horarioDefinido > 13 ? (horarioDefinido - 12) : horarioDefinido;

            if (horarioDefinido >= 13) {
                System.out.printf("%.2f PM", horarioFormatado);
            } else {
                System.out.printf("%.2f AM", horarioFormatado);
            }

            System.out.print("\n\nDefinir novo horário [S/N]? ");
            escolhaUsuario = sc.nextLine();

        } while (!escolhaUsuario.equals("N") && !escolhaUsuario.equals("n"));
    }
}
