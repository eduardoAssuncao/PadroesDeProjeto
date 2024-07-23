package br.gov.ma.tce.decoratorQuestao3;

public abstract class CondimentDecorator extends Pizza{

    protected Pizza decotaredPizza;

    public CondimentDecorator(Pizza pizza) {
        this.decotaredPizza = pizza;
    }

    public abstract Double cost();
}
