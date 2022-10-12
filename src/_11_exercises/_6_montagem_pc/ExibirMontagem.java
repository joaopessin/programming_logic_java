package _6_montagem_pc;

public class ExibirMontagem {
  private static void quebrarLinha() {
    System.out.print("\n");
  }

  public static void exibirMontagem() {
    Montagem meuPC = new Montagem();
    Montagem.definirPecas(meuPC);

    quebrarLinha();
    System.out.println("\"Montagem do PC\"");

    quebrarLinha();
    System.out.println("Processador:\n" + meuPC.processador.getMarca()
    + " " + meuPC.processador.getModelo()
    + " " + meuPC.processador.getSoquete()
    + "\n" + meuPC.processador.getLocalDeCompra()
    + " | R$" + meuPC.processador.getValor());

    quebrarLinha();
    System.out.println("Placa-Mãe:\n" + meuPC.placaMae.getMarca()
    + " " + meuPC.placaMae.getModelo()
    + " " + meuPC.placaMae.getSoquete()
    + "\n" + meuPC.placaMae.getLocalDeCompra()
    + " | R$" + meuPC.placaMae.getValor());

    quebrarLinha();
    System.out.println("Placa de Vídeo:\n" + meuPC.placaGrafica.getMarca()
    + " " + meuPC.placaGrafica.getModelo()
    + "\nIntegrada");

    quebrarLinha();
    System.out.println("Memória RAM:\n" + meuPC.RAM.getMarca()
    + " " + meuPC.RAM.getModelo()
    + " " + meuPC.RAM.getTamanho()
    + "GB\n" + meuPC.RAM.getLocalDeCompra()
    + " | R$" + meuPC.RAM.getValor());

    quebrarLinha();
    System.out.println("Memória de Armazenamento: " + meuPC.armazenamento.getMarca()
    + " " + meuPC.armazenamento.getModelo()
    + " " + meuPC.armazenamento.getTamanho()
    + "GB\n" + meuPC.armazenamento.getLocalDeCompra()
    + " | R$" + meuPC.armazenamento.getValor());

    quebrarLinha();
    System.out.println("Fonte: " + meuPC.fonte.getMarca()
    + " " + meuPC.fonte.getModelo()
    + " " + meuPC.fonte.getTamanho()
    + "W\n" + meuPC.fonte.getLocalDeCompra()
    + " | R$" + meuPC.fonte.getValor());

    quebrarLinha();
    System.out.println("Fan Cooler: " + meuPC.cooler.getMarca()
    + " " + meuPC.cooler.getModelo()
    + " " + meuPC.cooler.getTamanho()
    + "mm\n" + meuPC.cooler.getLocalDeCompra()
    + " | R$" + meuPC.cooler.getValor()
    + " [x" + meuPC.cooler.getQuantidade() + "]");

    quebrarLinha();
    System.out.println("Gabinete: " + meuPC.gabinete.getMarca()
    + " " + meuPC.gabinete.getModelo()
    + "\n" + meuPC.gabinete.getLocalDeCompra()
    + " | R$" + meuPC.gabinete.getValor());

    Float valorFinal = (meuPC.processador.getValor() * meuPC.processador.getQuantidade())
    + (meuPC.placaMae.getValor() * meuPC.placaMae.getQuantidade())
    + (meuPC.placaGrafica.getValor() * meuPC.placaGrafica.getQuantidade())
    + (meuPC.RAM.getValor() * meuPC.RAM.getQuantidade())
    + (meuPC.armazenamento.getValor() * meuPC.armazenamento.getQuantidade())
    + (meuPC.fonte.getValor() * meuPC.fonte.getQuantidade())
    + (meuPC.cooler.getValor() * meuPC.cooler.getQuantidade())
    + (meuPC.gabinete.getValor() * meuPC.gabinete.getQuantidade());

    quebrarLinha();
    System.out.println("Valor Final: R$" + valorFinal);
    quebrarLinha();
  }
}
