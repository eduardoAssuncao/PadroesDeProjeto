package br.gov.ma.tce.decoratorQuestao2;

public abstract class NumeroDecorator implements Numero{

    private Numero numero;

    public NumeroDecorator(Numero numero) {
        this.numero = numero;
    }

    public Numero getNumero() {
        return this.numero;
    }
}
