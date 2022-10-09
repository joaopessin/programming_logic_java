package _11_exercises._5_passeio;

import java.util.Scanner;

public class Passeio {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pessoa joaoVitor = new Pessoa();

    DefinirPropriedades.propriedadesDaPessoa(joaoVitor, scanner);
    DefinirPropriedades.propriedadesDoAnimal(joaoVitor, scanner);
    Caminhada.caminhar(joaoVitor);
  }
}
