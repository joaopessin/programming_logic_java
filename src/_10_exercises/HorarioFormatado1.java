package _10_exercises;

import java.util.Scanner;

public class HorarioFormatado1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolhaUsuario = null;

        do {
            Float horarioDefinido = 0.0F;

            System.out.print("\nInforme o horário: ");
            horarioDefinido = sc.nextFloat();

            imprimirHorarioFormatado(horarioDefinido);

            System.out.print("\nDefinir novo horário [S/N]? ");
            escolhaUsuario = sc.next();

        } while (!escolhaUsuario.equals("N") && !escolhaUsuario.equals("n"));
    }

    private static void imprimirHorarioFormatado(Float horarioDefinido) {
        Float horarioFormatado = horarioDefinido >= 13 ? (horarioDefinido - 12) : horarioDefinido;

        if (horarioDefinido >= 12) {
            System.out.printf("%.2f PM", horarioFormatado);
        } else {
            if (horarioDefinido >= 01) {
                System.out.printf("%.2f AM", horarioFormatado);
            } else {
                System.out.printf("%.2f AM", horarioFormatado + 12);
            }
        }

        System.out.print("\n");
    }
}
