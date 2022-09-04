package _7_exercises;

import java.util.Scanner;

public class NotasAluno1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("\"Calcular Média de Notas\"\n");
        System.out.print("\nDigite quantas notas deseja informar: ");
        int quantidadeNotas = leitura.nextInt();

        int i = 1;
        float somaNotas = 0.0F;

        System.out.print("\n");

        while (i <= quantidadeNotas) {
            System.out.print("Digite o valor da " + i + "ª nota: ");
            somaNotas += leitura.nextFloat();

            i++;
        }

        float mediaNotas = (somaNotas / quantidadeNotas), notaRecuperacao = 0.0F;

        System.out.print("\nMédia das notas do(a) aluno(a): " + mediaNotas);

        if (mediaNotas < 4) {
            System.out.print("\nAluno(a) REPROVADO(A) direto!");
        } else if (mediaNotas < 7) {
            System.out.print("\nAluno(a) de RECUPERAÇÃO!\n");

            System.out.print("\nInforme a nota da recuperação: ");
            notaRecuperacao = leitura.nextFloat();

            float novaMediaNotas = (mediaNotas + notaRecuperacao) / 2;

            if (novaMediaNotas < 7) {
                System.out.print("\nAluno(a) REPROVADO(A)!");
            } else {
                System.out.print("\nAluno(a) APROVADO(A)!");
            }

        } else {
            System.out.print("\nAluno(a) APROVADO(A) direto!");
        }
    }
}