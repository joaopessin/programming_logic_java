package _1_exercises;

import java.util.Scanner;

public class CalcularValorTroco2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor do produto: ");
        float valorProduto = sc.nextFloat();

        System.out.print("Digite o valor dado pelo cliente: ");
        float valorCliente = sc.nextFloat();

        float resultado = valorCliente - valorProduto;

        System.out.printf("\nTroco: R$ %.2f", resultado);
    }
}
