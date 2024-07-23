package br.gov.ma.tce.decoratorQuestao3;

public abstract class Pizza {

    protected String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract Double cost();
}
