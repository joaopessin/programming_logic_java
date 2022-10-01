package _11_exercises._4_petshop;

public class Informacoes {
  public static void quebrarLinha() {
    System.out.print("\n");
  }

  public static void exibirInformacoes(Pet pet) {
    quebrarLinha();
    System.out.println("Informações do(a) " + pet.getNome());

    quebrarLinha();
    System.out.println("Raça: " + pet.getRaca() 
    + "\nSexo: " + pet.getSexo() 
    + "\nIdade: " + pet.getIdade() + " anos");

    quebrarLinha();
  }
}
