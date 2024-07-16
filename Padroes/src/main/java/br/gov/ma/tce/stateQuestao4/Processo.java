package br.gov.ma.tce.stateQuestao4;

public class Processo {

    private State state;
    private Status status;

    public Processo(){
        this.state = new ValidoState(this);
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
