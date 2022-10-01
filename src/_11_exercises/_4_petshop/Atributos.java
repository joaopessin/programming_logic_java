package _11_exercises._4_petshop;

import java.util.Scanner;

public class Atributos {
  static Scanner sc = new Scanner(System.in);

  public static void definirNome(Pet pet) {
    System.out.print("Nome do Pet: ");
    pet.setNome(pet.nome = sc.nextLine());
  }

  public static void definirRaca(Pet pet) {
    System.out.print("Raça: ");
    pet.setRaca(pet.raca = sc.nextLine());
  }

  public static void definirSexo(Pet pet) {
    System.out.print("Sexo[M/F]: ");
    pet.setSexo(pet.sexo = sc.next());
  }

  public static void definirIdade(Pet pet) {
    System.out.print("Idade: ");
    pet.setIdade(pet.idade = sc.nextFloat());
  }

  public static void definirAtributos(Pet pet) {
    Informacoes.quebrarLinha();

    Atributos.definirNome(pet);
    Atributos.definirRaca(pet);
    Atributos.definirSexo(pet);
    Atributos.definirIdade(pet);
  }
}
