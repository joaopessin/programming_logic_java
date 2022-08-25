package _6_exersises;

import java.util.Scanner;

public class MediaNotasAluno1 {
    static final Integer NOTA_MINIMA_PARA_PASSAR = 150;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota da prova de Português: ");
        float notaProvaPortugues = entrada.nextFloat();

        System.out.print("Agora, informe a nota da prova de Matemática: ");
        float notaProvaMatematica = entrada.nextFloat();

        boolean notaMinima = (notaProvaPortugues + notaProvaMatematica) >= 0;
        boolean notaMaxima = (notaProvaPortugues + notaProvaMatematica) <= 200;
        boolean notaMinimaEMaxima = notaMinima && notaMaxima;

        System.out.print("\n");

        if(notaMinimaEMaxima) {
            boolean condicaoMinimaParaPassar = ((notaProvaPortugues + notaProvaMatematica) >= NOTA_MINIMA_PARA_PASSAR)
                    && (notaProvaPortugues >= 60) && (notaProvaMatematica >= 60);

            if (condicaoMinimaParaPassar) {
                System.out.print("Parabéns! Você conseguiu a vaga!");
            } else {
                System.out.print("Infelizmente, você não conseguiu a vaga.");
            }
        } else {
            System.out.print("Valor inválido!");
        }
    }
}
