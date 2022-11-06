package _12_exercises;

public class ContaPagar {
    private String descricao, dataVencimento;
    private Double valor;
    private Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public ContaPagar() { this.situacaoConta = SituacaoConta.PENDENTE; }
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public void pagar() {
        if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("\n------------------------------");
            System.out.println("Não se pode pagar uma conta que já está paga!");
        } else if (this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("\n------------------------------");
            System.out.println("Não se pode pagar uma conta que foi cancelada!");
        } else {
            System.out.println("\n------------------------------");
            System.out.println("Fornecedor: " + this.fornecedor.getNome()
                    + "\nDescrição: " + this.descricao
                    + "\nData de Vencimento: " + this.dataVencimento
                    + "\nValor: R$" + this.valor);

            this.situacaoConta = SituacaoConta.PAGA;
            System.out.println("\nConta PAGA com sucesso!");
        }
    }

    public void cancelar() {
        if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("\n------------------------------");
            System.out.println("Não se pode cancelar uma conta que foi paga!");
        } else if (this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("\n------------------------------");
            System.out.println("Não se pode cancelar uma conta que já está cancelada!");
        } else {
            System.out.println("\n------------------------------");
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

    public SituacaoConta getSituacaoConta() { return situacaoConta; }
}
