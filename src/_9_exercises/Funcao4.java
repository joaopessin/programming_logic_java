package _49_python_brasil;

import java.util.Scanner;

public class Funcao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nInforme um valor: ");
        float valorEscolhido = sc.nextFloat();

        String resultado = positivoOuNegativo(valorEscolhido);
        System.out.println(resultado);

        sc.close();
    }

    private static String positivoOuNegativo(float valor) { // O método deve retornar uma String
        Boolean valorPositivo = valor > 0;
        String resultado = valorPositivo ? "Valor positivo" : "Valor negativo";

        return resultado;   // Retorno
    }
}
