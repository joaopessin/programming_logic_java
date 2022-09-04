package _7_exercises;

import java.util.Scanner;

public class NotasAluno1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float notasAluno[] = new Float[] {};

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = entrada.next();

        System.out.print("Agora, digite a quantidade de notas que deseja informar: ");
        int quantidadeNotas = entrada.nextInt();

        for (int i = 0; i < quantidadeNotas; i++) {
            float nota;

            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            nota = entrada.nextFloat();

            notasAluno[i] = nota;
        }

        System.out.print("Notas do aluno " + nomeAluno + "\n");

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.println((i + 1) + "ª nota: " + notasAluno[i]);
        }
    }
}
