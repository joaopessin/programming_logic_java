package _1_exercises;

import java.util.Scanner;

public class CalcularValorTroco2 {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite o valor dado pelo cliente: ");
        Double valorCliente = scanner2.nextDouble();

        Double resultado = valorCliente - valorProduto;

        System.out.println("Troco: " + resultado);
    }
}
