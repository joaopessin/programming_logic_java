package _12_exercises;

public class Conta {
    protected String descricao, dataVencimento;
    protected Double valor;
    protected Fornecedor fornecedor;
    protected SituacaoConta situacaoConta;
    protected Cliente cliente;

    public Conta() { this.situacaoConta = SituacaoConta.PENDENTE; }

    public void cancelar() {
        System.out.println("\n------------------------------");

        if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("Não se pode cancelar uma conta que foi paga!");
        } else if (this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("Não se pode cancelar uma conta que já está cancelada!");
        } else {
            System.out.println("Fornecedor: " + this.fornecedor.getNome()
                    + "\nDescrição: " + this.descricao
                    + "\nData de Vencimento: " + this.dataVencimento
                    + "\nValor: R$" + this.valor);

            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("\nConta CANCELADA com sucesso!");
        }
    }

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }
    public void setValor(Double valor) { this.valor = valor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getDescricao() { return descricao; }
    public String getdataVencimento() { return dataVencimento; }
    public Double getValor() { return valor; }
    public Fornecedor getFornecedor() { return fornecedor; }
    public Cliente getCliente() { return cliente; }
}
