package _4_exercises;

import java.util.Scanner;

public class MultaVeiculo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\"Departamento de Trânsito e Transporte\"\n");
        System.out.println("Escolha o veículo: \n- Carro \n- Caminhão");

        System.out.print("\nDigite a opção: ");
        String tipoVeiculo = sc.next();

        System.out.print("\nInforme a velocidade máxima permitida: ");
        int velocidadeMaxima = sc.nextInt();

        System.out.print("Valocidade do veículo: ");
        int velocidadeVeiculo = sc.nextInt();

        float carroAcimaVelocidade = (float) (velocidadeMaxima + (velocidadeMaxima * 0.10));
        float caminhaoAcimaLimite = (float) (velocidadeMaxima + (velocidadeMaxima * 0.05));

        boolean multaCarro = velocidadeVeiculo > carroAcimaVelocidade;
        boolean multaCaminhao = velocidadeVeiculo > caminhaoAcimaLimite;

        if(tipoVeiculo.equals("Carro") && multaCarro) {
            float valorMulta = 5 * (velocidadeVeiculo - carroAcimaVelocidade);

            System.out.println("\nVeículo multado! Valor da taxa: R$" + valorMulta);
        } else if(tipoVeiculo.equals("Caminhão") && multaCaminhao) {
            float valorMulta = 10 * (velocidadeVeiculo - caminhaoAcimaLimite);

            System.out.println("\nVeículo multado! Valor da taxa: R$" + valorMulta);
        } else if(tipoVeiculo.equals("Carro") || tipoVeiculo.equals("Caminhão")) {
            System.out.println("\nVeículo dentro do limite!");
        } else {
            System.out.println("\nValor inválido!");
        }
    }
}
