package br.gov.ma.tce.stateQuestao2;

public class Cliente {

    private State state;
    private boolean positive = false;
    private Double saldoConta = 0.0;

    public Cliente() {
        this.state = new PositiveState(this);
        setPositive(true);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPositive(boolean positive) {
        this.positive = positive;
    }

    public boolean isPositive() {
        return positive;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }
}
