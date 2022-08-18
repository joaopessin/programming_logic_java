package _2_exercises;

public class PrecoMedioBombom1 {
    public static void main(String[] args) {
        // Receber três valores: 5, 8 e 12
        Integer bombom1 = 5;
        Integer bombom2 = 8;
        Integer bombom3 = 12;

        // Calcule a média
        Integer somaTotal =  bombom1 + bombom2 + bombom3;
        Integer quantidadeDeBombons = 3;
        Integer media = somaTotal / quantidadeDeBombons;

        // Imprima os três valores e a média
        System.out.print("Valor dos três bombons respectivamente: ");
        System.out.print(bombom1 + ", ");
        System.out.print(bombom2 + " e ");
        System.out.println(bombom3);

        System.out.println("Média de valores: " + media);
    }
}
