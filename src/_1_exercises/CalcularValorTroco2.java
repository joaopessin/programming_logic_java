package _1_exercises;

import java.util.Scanner;

public class CalcularValorTroco2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float valorProduto = 0.0F, valorCliente = 0.0F, resultado = 0.0F;

        valorProduto = lerValor("Digite o valor do produto: ", sc);
        valorCliente = lerValor("Digite o valor dado pelo cliente: ", sc);
        resultado = valorCliente - valorProduto;

        System.out.printf("\nTroco: R$ %.2f", resultado);
    }

    private static Float lerValor(String pedido, Scanner scanner) {
        System.out.print(pedido);
        
        return scanner.nextFloat();
    }

}
