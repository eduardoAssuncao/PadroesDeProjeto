package br.gov.ma.tce.factoryMethodQuestao5.produto;

public class SanduicheJP implements Sanduiche{

    @Override
    public void getIngrediente() {
        System.out.println("Pão Francês");
        System.out.println("Queijo Mussarela");
        System.out.println("Presunto de Frango");
        System.out.println("Salada com Verdura");

    }
}
