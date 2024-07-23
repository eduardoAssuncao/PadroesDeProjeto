package br.gov.ma.tce.decoratorQuestao3;

public class CreamCheeseEdgeDecorator extends CondimentDecorator {

    public CreamCheeseEdgeDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return "CreamCheeseEdge";
    }

    public Double cost(){
        return this.decotaredPizza.cost() + 1.20;
    }
}
