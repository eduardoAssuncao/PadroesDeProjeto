package br.gov.ma.tce.strategy.q3;

public class LivroImpresso extends Produto{
    public LivroImpresso(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal(DescontoStrategy descontoStrategy) {
        return getPreco() * (1 - descontoStrategy.desconto(this));
    }
}
