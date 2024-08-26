package br.gov.ma.tce.adapterQuestao2;

import java.util.ArrayList;
import java.util.List;

public class Experimento implements Cloneable{
    private String name;
    private List<Experimento> experimentos;

    public Experimento(List<Experimento> experimentos, String name) {
        this.experimentos = experimentos;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {}

    @Override
    public Experimento clone() {
        List<Experimento> clonedExperimentos = new ArrayList<>();
        return new Experimento(clonedExperimentos, this.getName());
    }

    @Override
    public String toString() {
        return "Experimento{" +
                "name='" + name + '\'' +
                '}';
    }
}
