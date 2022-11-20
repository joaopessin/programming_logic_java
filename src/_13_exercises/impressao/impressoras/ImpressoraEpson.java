package _13_exercises.impressao.impressoras;

import _13_exercises.impressao.Impressora;

public class ImpressoraEpson implements Impressora {
    @Override
    public void marcaImpressora() {
        System.out.println("\n---------- IMPRESSORA EPSON ----------");
    }
}
