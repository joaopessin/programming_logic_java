package _8_exercises;

import java.util.Scanner;


public class CalculadoraBasica3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double numeroEsquerda = informeNumero(entrada);
        imprimirTraco();

        Integer operacao = escolhaOperacao(entrada);
        imprimirTraco();

        Double numeroDireita = informeNumero(entrada);
        imprimirTraco();

        Double resultado = realizarCalculo(operacao, numeroEsquerda, numeroDireita);

        System.out.println("O resultado é: " + resultado);
    }

    private static void imprimirTraco() {
        System.out.println("------------------------------");
    }

    private static Double informeNumero(Scanner sc) {
        System.out.print("Informe o número:");
        return sc.nextDouble();
    }

    private static Integer escolhaOperacao(Scanner sc) {
        System.out.println("Escolha a operação: ");
        String[] operacoes = new String[] { "Subtração", "Adição" };

        for (int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + (i + 1) + "] " + operacoes[i]);
        }

        System.out.print("Digite a operação: ");
        return sc.nextInt() - 1;
    }

    private static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
        Double resultado = null;

        switch (operacao) {
            case 0:
                resultado = subtracao(numeroEsquerda, numeroDireita);
                break;
            case 1:
                resultado = adicao(numeroEsquerda, numeroDireita);
                break;
            default:
                System.err.println("Operação inválida!");
                System.exit(1);
        }

        return resultado;
    }

    private static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
        return numeroEsquerda - numeroDireita;
    }

    private static Double adicao(Double numeroEsquerda, Double numeroDireita) {
        return numeroEsquerda + numeroDireita;
    }
}
