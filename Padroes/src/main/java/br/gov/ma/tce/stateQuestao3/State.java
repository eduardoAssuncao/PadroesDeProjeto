package br.gov.ma.tce.stateQuestao3;

public abstract class State {
    Pedido pedido;

    public State(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract String alterar();
    public abstract String cancelar();
    public abstract String enviar();

}
