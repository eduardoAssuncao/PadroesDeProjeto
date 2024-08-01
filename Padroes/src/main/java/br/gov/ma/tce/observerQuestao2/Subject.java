package br.gov.ma.tce.observerQuestao2;

public interface Subject {

    void subscribe(Observer observer);
    void notifyObservers();
}
