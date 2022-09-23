package _8_exercises;

import java.util.Scanner;

public class PrimeiroMetodo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

        imprimirTraco();
        escrever("Escolha dentre os cursos abaixo: ");
        imprimirVetor(cursos);

        Integer opcaoCurso = lerCurso("\nOpção de curso: ", sc);
        Boolean posicaoValida = (opcaoCurso >= 0) && (opcaoCurso < cursos.length);

        if (!posicaoValida) {   // Negação da posição válida
            opcaoInvalida();
        }

        String[] formasPagamento = new String[] { "Cartão", "Boleto" };

        imprimirTraco();
        escrever("Escolha uma forma de pagamento: ");
        imprimirVetor(formasPagamento);
        Integer opcaoPagamento = lerCurso("\nOpção de pagamento: ", sc);

        posicaoValida = (opcaoPagamento >= 0) && (opcaoPagamento < formasPagamento.length);

        if (!posicaoValida) {
            opcaoInvalida();
        }

        String cursoEscolhido = cursos[opcaoCurso];
        String pagamentoEscolhido = formasPagamento[opcaoPagamento];

        imprimirTraco();
        escrever("Curso escolhido: \"" + cursoEscolhido + "\"\nForma de pagamento escolhida: \"" + pagamentoEscolhido + "\"");
        sc.close();
    }

    private static Integer lerCurso(String frase, Scanner sc) {
        escreverMesmaLinha(frase);
        Integer opcaoCurso = sc.nextInt() - 1;
        return opcaoCurso;
    }

    private static void imprimirVetor(String[] vetor) {
        imprimirVetor(vetor, 0);
    }

    private static void imprimirVetor(String[] vetor, int i) {  // Recursividade
        System.out.println("[" + (i + 1) + "] " + vetor[i]);

        if (++i < vetor.length) {
            imprimirVetor(vetor, i);
        }
    }

    private static void imprimirTraco() {   // Método / função
        System.out.println("------------------------------");
    }

    private static void opcaoInvalida() {
        System.err.println("\nOpção inválida!");
        System.exit(1);
    }

    private static void escrever(String frase) {
        System.out.println(frase);
    }

    private static void escreverMesmaLinha(String frase) {
        System.out.print(frase);
    }
}
