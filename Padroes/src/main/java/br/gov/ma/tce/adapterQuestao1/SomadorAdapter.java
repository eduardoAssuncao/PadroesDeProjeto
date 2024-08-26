package br.gov.ma.tce.adapterQuestao1;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter implements SomadorEsperado{

    private SomadorExistente somadorExistente;

    public SomadorAdapter(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> listaVetor = new ArrayList<>();
        for (int j : vetor) {
            listaVetor.add(j);
        }
        return somadorExistente.somoLista(listaVetor);
    }
}
