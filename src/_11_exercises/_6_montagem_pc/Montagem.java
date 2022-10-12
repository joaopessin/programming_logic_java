package _6_montagem_pc;

public class Montagem {
  // Peças internas:
  Peca processador = new Peca();
  Peca placaMae = new Peca();
  Peca placaGrafica = new Peca();
  Peca RAM = new Peca();
  Peca armazenamento = new Peca();
  Peca fonte = new Peca();
  Peca cooler = new Peca();
  Peca gabinete = new Peca();

  public static void definirPecas(Montagem meuPC) {
    meuPC.processador.setMarca("AMD");
    meuPC.processador.setModelo("Ryzen 5 4600G");
    meuPC.processador.setSoquete("AM4");
    meuPC.processador.setLocalDeCompra("Kabum");
    meuPC.processador.setValor(800.0F);

    meuPC.placaMae.setMarca("ASRock");
    meuPC.placaMae.setModelo("B450M");
    meuPC.placaMae.setSoquete("AM4");
    meuPC.placaMae.setLocalDeCompra("Kabum");
    meuPC.placaMae.setValor(720.0F);

    meuPC.placaGrafica.setMarca("AMD");
    meuPC.placaGrafica.setModelo("Vega 7");
    meuPC.placaGrafica.setLocalDeCompra("Kabum");

    meuPC.RAM.setMarca("Corsair");
    meuPC.RAM.setModelo("Vengeance 3200MHz");
    meuPC.RAM.setTamanho(8);
    meuPC.RAM.setLocalDeCompra("Kabum");
    meuPC.RAM.setValor(200.0F);

    meuPC.armazenamento.setMarca("Kingston");
    meuPC.armazenamento.setModelo("SSD");
    meuPC.armazenamento.setTamanho(480);
    meuPC.armazenamento.setLocalDeCompra("Kabum");
    meuPC.armazenamento.setValor(240.0F);

    meuPC.fonte.setMarca("Corsair");
    meuPC.fonte.setModelo("CV450");
    meuPC.fonte.setTamanho(450);
    meuPC.fonte.setLocalDeCompra("Kabum");
    meuPC.fonte.setValor(290.0F);

    meuPC.cooler.setMarca("Rise Mode");
    meuPC.cooler.setModelo("White");
    meuPC.cooler.setTamanho(120);
    meuPC.cooler.setQuantidade(4);
    meuPC.cooler.setLocalDeCompra("Kabum");
    meuPC.cooler.setValor(15.0F);

    meuPC.gabinete.setMarca("Rise Mode");
    meuPC.gabinete.setModelo("X5 Glass");
    meuPC.gabinete.setLocalDeCompra("Kabum");
    meuPC.gabinete.setValor(210.0F);
  }
}
