package _1_exercises;

import java.util.Scanner;

public class Viagem5 {
    static final Integer PORCENTAGEM_TARIFA = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor da passagem: ");
        Double passagem = sc.nextDouble();

        Double tarifa = (passagem / 100) * PORCENTAGEM_TARIFA;
        Double valorFinal = passagem + tarifa;

        System.out.println("\nValor da tarifa: " + PORCENTAGEM_TARIFA + "%");
        System.out.println("Valor total a pagar: R$" + valorFinal);
    }
}
