package _5_exercises;

import java.util.Scanner;

public class ValorProdutoFrete3 {

    static final int FRETE = 15;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Integer quantidadeProdutos = null;
        float somaValoresProdutos = 0.0F;

        System.out.print("Informe quantos produtos deseja comprar: ");
        quantidadeProdutos = entrada.nextInt();

        System.out.print("\n");

        if(quantidadeProdutos >= 1) {
            for (int i = 1; i <= quantidadeProdutos; i++) {
                System.out.print("Digite o valor do " + i + "º produto: ");
                float valorProduto = entrada.nextFloat();

                somaValoresProdutos += (float) (valorProduto);
            }

            System.out.print("\n");
            System.out.print(somaValoresProdutos >= 100 ? "Valor final: " + somaValoresProdutos : "Valor final com frete: " + (somaValoresProdutos + FRETE));
        } else {
            System.out.print("Valor inválido!");
        }
        
        entrada.close();
    }
}
