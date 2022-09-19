package _8_exercises;

import java.util.Scanner;

public class PrimeiroMetodo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        System.out.println("Escolha dentre os cursos abaixo: ");

        loopRepeticao(cursos);

        System.out.print("\nOpção de curso: ");
        Integer opcaoCurso = sc.nextInt() - 1;

        Boolean posicaoValida = (opcaoCurso >= 0) && (opcaoCurso < cursos.length);

        if (!posicaoValida) {   // Negação da posição válida
            opcaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] { "Cartão", "Boleto" };

        System.out.println("Escolha uma forma de pagamento: ");

        loopRepeticao(formasPagamento);

        System.out.print("\nOpção de pagamento: ");
        Integer opcaoPagamento = sc.nextInt() - 1;

        posicaoValida = (opcaoPagamento >= 0) && (opcaoPagamento < formasPagamento.length);

        if (!posicaoValida) {
            opcaoInvalida();
        }

        String cursoEscolhido = cursos[opcaoCurso];
        String pagamentoEscolhido = formasPagamento[opcaoPagamento];

        imprimirTraco();

        System.out.println("Curso escolhido: \"" + cursoEscolhido + "\"\nForma de pagamento escolhida: \"" + pagamentoEscolhido + "\"");

        sc.close();
    }

    private static void loopRepeticao(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("[" + (i + 1) + "] " + vetor[i]);
        }
    }

    private static void imprimirTraco() {   // Método / função
        System.out.println("\n---------- | ---------- | ----------\n");
    }

    private static void opcaoInvalida() {
        System.err.println("\nOpção inválida!");
        System.exit(1);
    }
}
