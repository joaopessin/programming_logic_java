package _11_exercises._7_drink_shop;

public class Bebida {
    private String nome;
    private Float tamanho, valor;

    public Bebida(String nome, Float tamanho, Float valor) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
    }

    public static void listarBebidas(Bebida[] bebidas) {
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println("-------------------------");
            System.out.println("\nNome: " + bebidas[i].nome
            + "\nTamanho: " + bebidas[i].tamanho + " ml"
            + "\nValor: R$ " + bebidas[i].valor);
        }
    }
}
