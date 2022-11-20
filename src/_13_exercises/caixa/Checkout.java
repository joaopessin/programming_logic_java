package _13_exercises.caixa;

import _13_exercises.impressao.Impressora;
import _13_exercises.pagamento.Cartao;
import _13_exercises.pagamento.Operadora;

public class Checkout {
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Cartao cartao, Compra compra) {
        this.operadora.autorizarCartao(cartao, compra);
        compra.comprovante(compra, this.impressora);
    }
}
