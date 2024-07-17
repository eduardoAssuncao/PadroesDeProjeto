package br.gov.ma.tce.factoryMethodQuestao5.produto;

public class SanduicheCG implements Sanduiche{

    @Override
    public void getIngrediente() {
        System.out.println("Pão Integral");
        System.out.println("Queijo Prato");
        System.out.println("Presunto de Frango");
        System.out.println("Salada sem Verdura");

    }
}
