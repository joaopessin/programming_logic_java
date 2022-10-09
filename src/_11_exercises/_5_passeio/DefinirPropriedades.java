package _11_exercises._5_passeio;

import java.util.Scanner;

public class DefinirPropriedades {
  public static void quebrarLinha() {
    System.out.print("\n");
  }

  public static void propriedadesDaPessoa(Pessoa pessoa, Scanner sc) {
    quebrarLinha();
    System.out.println("\"Propriedades da Pessoa\"");

    quebrarLinha();
    System.out.print("Nome: ");
    pessoa.setNome(sc.nextLine());

    System.out.print("Idade: ");
    pessoa.setIdade(sc.nextInt());
  }

  public static void propriedadesDoAnimal(Pessoa pessoa, Scanner sc) {
    quebrarLinha();
    System.out.println("\"Propriedades do Animal de Estimação\"");

    quebrarLinha();
    System.out.print("Nome: ");
    pessoa.animalEstimacao.setNome(sc.next());

    System.out.print("Tipo: ");
    pessoa.animalEstimacao.setTipo(sc.next());

    System.out.print("Raça: ");
    pessoa.animalEstimacao.setRaca(sc.next());

    System.out.print("Sexo[M/F]: ");
    pessoa.animalEstimacao.setSexo(sc.next());

    System.out.print("Idade[meses]: ");
    pessoa.animalEstimacao.setIdade(sc.nextInt());
  }
}
