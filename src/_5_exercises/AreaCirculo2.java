package _22_logica;

import java.util.Scanner;

public class AreaCirculo2 {
    public static final float PI = 3.14F;
    public static final float RAIO = 2.5F;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);



        System.out.print("\nExibição da fórmula [S/N]: ");
        String exibirFormula = entrada.next();

        System.out.println("\nEscolha o tipo numérico: 1. Decimal 2. Inteiro");
        System.out.print("Opção: ");
        int tipoNumerico = entrada.nextInt();

        if(exibirFormula.equals("S") || exibirFormula.equals("s")) {
            if(tipoNumerico == 1) {
                float areaCirculo = (RAIO * RAIO) * PI;

                System.out.println("Área do círculo = " + RAIO + "² x " + PI + " = " + areaCirculo);
            } else if(tipoNumerico == 2) {
                int areaCirculo = (int) ((RAIO * RAIO) * PI);

                System.out.println("Área do círculo = " + RAIO + "² x " + PI + " = " + areaCirculo);
            } else {
                System.out.println("Valor inválido!");
            }
        } else if(exibirFormula.equals("N") || exibirFormula.equals("n")) {
            if(tipoNumerico == 1) {
                float areaCirculo = (RAIO * RAIO) * PI;

                System.out.println("Resultado: " + areaCirculo);
            } else if(tipoNumerico == 2) {
                int areaCirculo = (int) ((RAIO * RAIO) * PI);

                System.out.println("Resultado: " + areaCirculo);
            } else {
                System.out.println("Valor inválido!");
            }
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
