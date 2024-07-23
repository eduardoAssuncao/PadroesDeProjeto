package br.gov.ma.tce.decoratorQuestao3;

public class OreganoDecorator extends CondimentDecorator {

    public OreganoDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return "Oregano";
    }

    public Double cost(){
        return this.decotaredPizza.cost() + 0.50;
    }
}
