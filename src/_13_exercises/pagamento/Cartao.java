package _13_exercises.pagamento;

public class Cartao {
    private Integer numeroCartao;
    private Float limiteCartao;

    public Cartao (Integer numeroCartao) { this.numeroCartao = numeroCartao; }

    public Integer getNumeroCartao() { return numeroCartao; }

    public Float getLimiteCartao() { return limiteCartao; }
    public void setLimiteCartao(Float limiteCartao) { this.limiteCartao = limiteCartao; }
}
