package br.gov.ma.tce.decoratorQuestao3;

public class Pizzaiolo{
    public static void main(String[] args) {

        System.out.println("Pizza --- Valor");
        Pizza pizzaMozzarella = new Mozzarella();
        System.out.printf("Mozzarella Pizza --- %.1f\n", pizzaMozzarella.cost());

        Pizza pizzaMozzarellaTomato = new TomatoDecorator(new Mozzarella());
        System.out.printf("Mozzarella Pizza, Tomato --- %.1f\n", pizzaMozzarellaTomato.cost());

        Pizza pizzaMozzarellaTomatoCreamCheese = new TomatoDecorator(
                new CreamCheeseEdgeDecorator(new Mozzarella()));
        System.out.printf("Mozzarella Pizza, Tomato, CreamCheeseEdge --- %.1f\n",
                pizzaMozzarellaTomatoCreamCheese.cost());

        Pizza pizzaPepperoni = new Pepperoni();
        System.out.printf("Pepperoni Pizza --- %.1f\n", pizzaPepperoni.cost());

        Pizza pizzaPepperoniOreganoBacon = new OreganoDecorator(
                new BaconDecorator(new Pepperoni()));
        System.out.printf("Pepperoni Pizza, Oregano, Bacon --- %.1f\n", pizzaPepperoniOreganoBacon.cost());

        Pizza pizzaPepperoniOreganoBaconTomato = new OreganoDecorator(
                new BaconDecorator(new TomatoDecorator(new Pepperoni())));
        System.out.printf("Pepperoni Pizza, Oregano, Bacon, Tomato --- %.1f\n",
                pizzaPepperoniOreganoBaconTomato.cost());
    }
}
