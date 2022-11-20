package _13_exercises.pagamento;

import _13_exercises.caixa.Compra;

public interface Autorizavel {
    public void autorizarCompra(Cartao cartao, Compra compra);
}
