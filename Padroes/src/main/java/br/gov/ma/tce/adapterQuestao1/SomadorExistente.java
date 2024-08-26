package br.gov.ma.tce.adapterQuestao1;

import java.util.List;

public class SomadorExistente {
    public int somoLista(List<Integer> lista){
        int resultado = 0;
        for (int i : lista) resultado += i;
        return resultado;
    }
}
