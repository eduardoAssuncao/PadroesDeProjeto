package br.gov.ma.tce.decoratorQuestao2;

public class NumeroDecoratorComColchetes extends NumeroDecorator {

    public NumeroDecoratorComColchetes(Numero numero) {
        super(numero);
    }

    @Override
    public void imprimir(String numero) {
        String numeroDecorado = "["+ numero +"]";
        this.getNumero().imprimir(numeroDecorado);
    }
}
