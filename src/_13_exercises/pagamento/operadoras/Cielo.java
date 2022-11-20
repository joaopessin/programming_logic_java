package _13_exercises.pagamento.operadoras;

import _13_exercises.caixa.Compra;
import _13_exercises.pagamento.Autorizavel;
import _13_exercises.pagamento.Cartao;
import _13_exercises.pagamento.Operadora;

public class Cielo implements Autorizavel, Operadora {
    @Override
    public void autorizarCompra(Cartao cartao, Compra compra) {
        System.out.println("\n---------- AUTORIZAR COMPRA -----");

        if (compra.getValor() <= cartao.getLimiteCartao()) {
            System.out.println("Compra autorizada com SUCESSO!");
        } else {
            System.out.println("Compra RECUSADA! O valor está acima do limite permitido");
        }
    }

    @Override
    public void autorizarCartao(Cartao cartao, Compra compra) {
        System.out.println("\n---------- AUTORIZAR CARTÃO CIELO -----");

        if (cartao.getNumeroCartao() == 123) {
            cartao.setLimiteCartao(100f);
            System.out.println("Cartão aceito com SUCESSO!");
            autorizarCompra(cartao, compra);
        } else {
            System.err.println("Cartão RECUSADO!");
        }
    }
}
