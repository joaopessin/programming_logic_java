package _11_exercises._5_passeio;

public class Pessoa {
  String nome;
  Integer idade;
  AnimalEstimacao animalEstimacao = new AnimalEstimacao();

  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }

  public Integer getIdade() { return idade; }
  public void setIdade(Integer idade) { this.idade = idade; }
}
