package _13_exercises.teste;

import _13_exercises.caixa.Checkout;
import _13_exercises.caixa.Compra;
import _13_exercises.impressao.Impressora;
import _13_exercises.impressao.impressoras.ImpressoraEpson;
import _13_exercises.impressao.impressoras.ImpressoraHP;
import _13_exercises.pagamento.Cartao;
import _13_exercises.pagamento.Operadora;
import _13_exercises.pagamento.operadoras.Cielo;
import _13_exercises.pagamento.operadoras.RedeCard;

public class TesteCheckout {
    public static void main(String[] args) {
        System.out.println("\n=============== TESTE 1 ===============");

        Operadora cielo = new Cielo();
        Impressora epson = new ImpressoraEpson();
        Cartao cartaoTeste1 = new Cartao(123);
        Compra compraTeste1 = new Compra("Picanha", 70f);

        Checkout teste1 = new Checkout(cielo, epson);
        teste1.fecharCompra(cartaoTeste1, compraTeste1);

        System.out.println("\n=============== TESTE 2 ===============");

        Operadora redeCard = new RedeCard();
        Impressora hp = new ImpressoraHP();
        Cartao cartaoTeste2 = new Cartao(456);
        Compra compraTeste2 = new Compra("Headset", 120f);

        Checkout teste2 = new Checkout(redeCard, hp);
        teste2.fecharCompra(cartaoTeste2, compraTeste2);
    }
}
