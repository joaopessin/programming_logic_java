package _12_exercises;

public class ContaReceber extends Conta {
    public ContaReceber() { super(); }
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        
        this.cliente = cliente;
        this.descricao = descricao;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public void receber() {
        this.valor += 10000d;
    }

    public void cancelar() {
        if (this.valor > 50000d) {
            System.out.println("\n------------------------------");
            System.out.println("Não se pode cancelar uma conta que possui mais de R$50 mil na mesma!");
        } else {
            super.cancelar();
        }
    }
}
