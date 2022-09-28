package _10_exercises._3_metodo_de_instancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        cliente1.primeiroNome = "Alexandre";
        cliente1.ultimoNome = "Afonso";
        cliente1.telefone = "21900000000";
        cliente1.email = "alexandre.afonso@gmail.com";

        Cliente cliente2 = new Cliente();

        cliente2.primeiroNome = "João";
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "27899999999";

        System.out.println("Nome do primeiro cliente: " + Cliente.obterNomeCompleto(cliente1) + " - DDD: " + cliente1.obterDDD()); // Método estático (classe)
        System.out.println("Nome do segundo cliente: " + cliente2.obterNomeCompleto() + " - DDD: " + cliente2.obterDDD()); // Método de instancia (objeto)
    }
}
