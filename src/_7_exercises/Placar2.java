package _45_logica_7_4;

public class Placar2 {
    public static void main(String[] args) {
        Integer[] jogo1 = new Integer[] { 59, 24, 79, 20, 19 };
        Integer[] jogo2 = new Integer[] { 100, 21, 15, 78, 33 };

        Integer[][] placarJogos = new Integer[][] { jogo1, jogo2 };

        for (int i = 0; i < placarJogos.length; i++) {
            System.out.println("\nJogo " + (i + 1) + "\n");

            Integer[] jogos = placarJogos[i];

            for (int j = 0; j < jogos.length; j++) {
                Integer pontuacao = jogos[j];

                System.out.println("Pontuação " + (j + 1) + ": " + pontuacao);
            }
        }
    }
}
