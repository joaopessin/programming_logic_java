package _1_exercises;

import java.util.Scanner;

public class Viagem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da passagem: ");
        Double passagem = sc.nextDouble();

        Double tarifa = (passagem / 100) * 10;
        Double valorFinal = passagem + tarifa;

        System.out.println("Valor da tarifa: 10%");
        System.out.println("Valor total a pagar: R$" + valorFinal);
    }
}
