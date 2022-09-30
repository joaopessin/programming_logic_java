package _11_exercises._5_pedido_de_vendas;

import java.util.Scanner;

public class PedidoDeVendas4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedido4_4 cliente1 = new Pedido4_4();

        System.out.print("\nCódigo do pedido: ");
        cliente1.setCodigo(cliente1.codigo = sc.nextInt());

        System.out.print("Preço: ");
        cliente1.setSubtotal(cliente1.subtotal = sc.nextFloat());

        System.out.print("Desconto[%]: ");
        cliente1.setDesconto(cliente1.desconto = sc.nextInt());

        cliente1.setTotal(cliente1.calcularValorTotal());

        System.out.println("\nTotal: " + cliente1.getTotal());
    }
}
