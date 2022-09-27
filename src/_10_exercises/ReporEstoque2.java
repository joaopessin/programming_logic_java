package _11_exercises._2_repor_estoque;

import java.util.Scanner;

public class ReporEstoque2 {
    public static void main(String[] args) {
        Produto2_2 item = new Produto2_2();
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNome do produto: ");
        item.nome = sc.next();

        System.out.print("Quantidade em estoque: ");
        item.quantidadeEstoque = sc.nextInt();

        System.out.print("\n");
        estoqueMinimo(item);
    }

    private static void estoqueMinimo(Produto2_2 item) {
        Boolean condicaoMenorQueDez = item.quantidadeEstoque < 10;

        if (condicaoMenorQueDez) {
            System.out.println("Quantidade mínima no estoque atingida! Necessário repor.");
        } else {
            System.out.println("Ainda há \"" + item.nome + "\" no estoque.");
        }
    }
}
