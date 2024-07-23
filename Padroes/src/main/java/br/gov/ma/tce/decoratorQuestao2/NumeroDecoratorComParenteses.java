package br.gov.ma.tce.decoratorQuestao2;

public class NumeroDecoratorComParenteses extends NumeroDecorator {

    public NumeroDecoratorComParenteses(Numero numero) {
        super(numero);
    }

    @Override
    public void imprimir(String numero) {
        String numeroDecorado = "("+ numero +")";
        this.getNumero().imprimir(numeroDecorado);
    }
}
