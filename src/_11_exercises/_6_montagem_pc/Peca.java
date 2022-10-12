package _6_montagem_pc;

public class Peca {
  String marca, modelo, soquete = null, localDeCompra;
  Integer tamanho = null, quantidade = 1;
  Float valor = 0.0F;

  public String getMarca() { return marca; }
  public void setMarca(String marca) { this.marca = marca; }

  public String getModelo() { return modelo; }
  public void setModelo(String modelo) { this.modelo = modelo; }

  public String getSoquete() { return soquete; }
  public void setSoquete(String soquete) { this.soquete = soquete; }

  public String getLocalDeCompra() { return localDeCompra; }
  public void setLocalDeCompra(String localDeCompra) { this.localDeCompra = localDeCompra; }

  public Integer getTamanho() { return tamanho; }
  public void setTamanho(Integer tamanho) { this.tamanho = tamanho; }

  public Integer getQuantidade() { return quantidade; }
  public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

  public Float getValor() { return valor; }
  public void setValor(Float valor) { this.valor = valor; }
}
