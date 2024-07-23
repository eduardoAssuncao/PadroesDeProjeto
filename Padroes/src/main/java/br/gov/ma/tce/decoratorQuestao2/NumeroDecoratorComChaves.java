package br.gov.ma.tce.decoratorQuestao2;

public class NumeroDecoratorComChaves extends NumeroDecorator {

    public NumeroDecoratorComChaves(Numero numero) {
        super(numero);
    }

    @Override
    public void imprimir(String numero) {
        String numeroDecorado = "{"+ numero +"}";
        this.getNumero().imprimir(numeroDecorado);
    }
}
