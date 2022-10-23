package _11_exercises._7_drink_shop;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\"Cadastro de Bebidas\"");
        System.out.print("\nInforme quantas bebidas deseja cadastrar: ");
        int quantidadeBebidas = sc.nextInt();
        sc.nextLine();

        Bebida[] bebidas = new Bebida[quantidadeBebidas];
        cadastrarBebidas(sc, bebidas);

        System.out.println("\n\"Lista de Bebidas\"");
        Bebida.listarBebidas(bebidas);
    }

    private static void cadastrarBebidas(Scanner sc, Bebida[] bebidas) {
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println("-------------------------");
            System.out.println("\"Bebida " + (i + 1) + "\"");

            System.out.print("\nNome: ");
            String nome = sc.nextLine();

            System.out.print("Tamanho[ml]: ");
            Float tamanho = sc.nextFloat();
            sc.nextLine();

            System.out.print("Valor: ");
            Float valor = sc.nextFloat();
            sc.nextLine();

            bebidas[i] = new Bebida(nome, tamanho, valor);
        }
    }
}
