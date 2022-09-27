package _11_exercises._3_metodo_de_instancia;

public class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    public static String obterNomeCompleto(Cliente cliente) {
        String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
        return nomeCompleto;
    }
}
