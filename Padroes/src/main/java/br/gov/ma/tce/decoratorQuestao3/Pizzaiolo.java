package br.gov.ma.tce.decoratorQuestao3;

public class Pizzaiolo{
    public static void main(String[] args) {

        Pizza pizzaMozzarella = new Mozzarella();
        System.out.println(pizzaMozzarella.cost());

        Pizza pizzaMozzarellaComTomato = new TomatoDecorator(new Mozzarella());
        System.out.println(pizzaMozzarellaComTomato.cost());
    }
}
