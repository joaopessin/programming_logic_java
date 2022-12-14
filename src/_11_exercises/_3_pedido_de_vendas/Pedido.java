package _11_exercises._3_pedido_de_vendas;

public class Pedido {
    Integer codigo, desconto;
    Float subtotal, total;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getDesconto() {
        return desconto;
    }

    public void setDesconto(Integer desconto) {
        this.desconto = desconto;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float calcularValorTotal() {
        Float valorDesconto = subtotal * (desconto / 100.0F);

        return subtotal - valorDesconto;
    }
}
