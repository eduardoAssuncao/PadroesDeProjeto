package br.gov.ma.tce.stateQuestao3;

public class Pedido {

    private State state;
    private Status status;

    public Pedido(){
        this.state = new AlterarState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
