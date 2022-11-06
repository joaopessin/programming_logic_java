package _12_exercises;

public class ContaPagar {
    private String descricao, dataVencimento;
    private Double valor;
    private Fornecedor fornecedor;

    public ContaPagar() {}
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public void pagar() {
        System.out.println("\n------------------------------");
        System.out.println("Fornecedor: " + this.fornecedor.getNome()
        + "\nDescrição: " + this.descricao
        + "\nData de Vencimento: " + this.dataVencimento
        + "\nValor: R$" + this.valor);
    }

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }
    public void setValor(Double valor) { this.valor = valor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }
}
