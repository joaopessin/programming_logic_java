package _11_exercises._5_passeio;

public class Caminhada {
  public static void caminhar(Pessoa pessoa) {
    DefinirPropriedades.quebrarLinha();
    System.out.println(pessoa.getNome() + " e seu(sua) " + pessoa.animalEstimacao.getTipo() + " "
        + pessoa.animalEstimacao.getNome() + " estão caminhando.");
  }
}
