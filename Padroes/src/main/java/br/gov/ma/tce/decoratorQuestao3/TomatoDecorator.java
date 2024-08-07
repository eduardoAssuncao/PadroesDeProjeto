package br.gov.ma.tce.decoratorQuestao3;

public class TomatoDecorator extends CondimentDecorator {

    public TomatoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return "Tomato";
    }

    public Double cost(){
        return this.decotaredPizza.cost() + 0.10;
    }
}
