package _12_exercises;

public class ContaPagar extends Conta {
    public ContaPagar() { this.situacaoConta = SituacaoConta.PENDENTE; }
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public void pagar() {
        System.out.println("\n------------------------------");
        
        if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("Não se pode pagar uma conta que já está paga!");
        } else if (this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("Não se pode pagar uma conta que foi cancelada!");
        } else {
            this.situacaoConta = SituacaoConta.PAGA;
            System.out.println("\nConta PAGA com sucesso!");
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------------");
        System.out.println("Fornecedor: " + this.fornecedor.getNome()
        + "\nDescrição: " + this.descricao
        + "\nData de Vencimento: " + this.dataVencimento
        + "\nValor: R$" + this.valor);
    }
}
