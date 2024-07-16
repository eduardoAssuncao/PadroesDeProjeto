package br.gov.ma.tce.stateQuestao4;

public abstract class State {
    Processo processo;

    public State(Processo processo){
        this.processo = processo;
    }

    public abstract String valido();
    public abstract String designado();
    public abstract String cancelar();
    public abstract String deferir();
    public abstract String indeferir();
    public abstract String recurso();
    public abstract String prazoLegal();
}
