package br.gov.ma.tce;

public abstract class State {
    Cliente cliente;

    State(Cliente cliente) {
        this.cliente = cliente;
    }

    public abstract Double saque(Double valor);
    public abstract Double deposito(Double valor);
}
