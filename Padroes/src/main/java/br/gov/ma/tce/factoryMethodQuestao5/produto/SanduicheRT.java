package br.gov.ma.tce.factoryMethodQuestao5.produto;

public class SanduicheRT implements Sanduiche {

    @Override
    public void getIngrediente() {
        System.out.println("Pão Bola");
        System.out.println("Queijo Cheddar");
        System.out.println("Presunto de Peru");
        System.out.println("Salada sem Verdura");

    }
}
