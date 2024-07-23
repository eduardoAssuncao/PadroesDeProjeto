package br.gov.ma.tce.decoratorQuestao2;

public class NumeroBasico implements Numero {

    @Override
    public void imprimir(String numero) {
        System.out.println(numero);
    }
}
