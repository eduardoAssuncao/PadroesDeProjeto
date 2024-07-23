package br.gov.ma.tce.decoratorQuestao3;

public class BaconDecorator extends CondimentDecorator {

    public BaconDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return "Bacon";
    }

    public Double cost(){
        return 3.0;
    }
}
