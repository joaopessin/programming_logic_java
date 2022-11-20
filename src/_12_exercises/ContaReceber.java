package _12_exercises;

public class ContaReceber extends Conta {
    public ContaReceber() { this.situacaoConta = SituacaoConta.PENDENTE; }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this();
        this.cliente = cliente;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public void receber() {
        System.out.println("\n------------------------------");

        if (this.situacaoConta.equals(SituacaoConta.PAGA)) {
            System.out.println("Não se pode receber em uma conta que já está paga!");
        } else if (this.situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.out.println("Não se pode receber em uma conta que foi cancelada!");
        } else {
            this.situacaoConta = SituacaoConta.PAGA;
            System.out.println("\nRECEBIMENTO feito com sucesso!");
        }
    }

    public void cancelar() {
        if (this.valor > 50000d) {
            System.out.println("\n------------------------------");
            System.out.println("Não se pode cancelar uma conta que possui mais de R$50 mil na mesma!");
        } else {
            super.cancelar();
        }
    }

    public void exibirDetalhes() {
        System.out.println("\n------------------------------");
        
        System.out.println("Cliente: " + this.cliente.getNome()
        + "\nDescrição: " + this.descricao
        + "\nData de Vencimento: " + this.dataVencimento
        + "\nValor: R$" + this.valor);
    }
}
