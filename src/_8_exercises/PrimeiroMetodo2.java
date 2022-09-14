package _48_logica_8_2;

import java.util.Scanner;

public class PrimeiroMetodo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        System.out.println("Escolha dentre os cursos abaixo: ");

        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + (i + 1) + "] " + cursos[i]);
        }

        System.out.print("\nOpção: ");
        Integer opcaoCurso = sc.nextInt() - 1;

        Boolean posicaoValida = (opcaoCurso >= 0) && (opcaoCurso < cursos.length);

        if (!posicaoValida) {   // Negação da posição válida
            System.err.println("\nOpção inválida!");
            System.exit(1);
        } else {
            if (opcaoCurso == 0) {
                System.out.println("\nVocê se cadastrou no curso de \"" + cursos[0] + "\" com sucesso!");
                System.exit(0);
            } else if (opcaoCurso == 1) {
                System.out.println("\nVocê se cadastrou no curso de \"" + cursos[1] + "\" com sucesso!");
                System.exit(0);
            } else {
                System.out.println("\nVocê se cadastrou no curso de \"" + cursos[2] + "\" com sucesso!");
                System.exit(0);
            }
        }

        sc.close();
    }

    private static void imprimirTraco() {   // Método / função
        System.out.println("\n-------------------------");
    }
}
