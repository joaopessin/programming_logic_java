package _6_exercises;

import java.util.Scanner;

public class MediaNotasAluno1 {
    static final Integer NOTA_MINIMA_GERAL = 150;
    static final Integer NOTA_MINIMA = 60;
    static final Integer NOTA_MAXIMA = 200;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota da prova de Português: ");
        float notaProvaPortugues = entrada.nextFloat();

        System.out.print("Agora, informe a nota da prova de Matemática: ");
        float notaProvaMatematica = entrada.nextFloat();
        
        float somaNotas = notaProvaPortugues + notaProvaMatematica;

        System.out.print("\n");

        if(somaNotas >= 0 && somaNotas <= NOTA_MAXIMA) {
            boolean condicaoMinimaParaPassar = ((notaProvaPortugues + notaProvaMatematica) >= NOTA_MINIMA_GERAL)
                    && (notaProvaPortugues >= NOTA_MINIMA) && (notaProvaMatematica >= NOTA_MINIMA);

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
