package com.strategy.q3;

public class RevistaDigital extends Produto{
    public RevistaDigital(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal(DescontoStrategy descontoStrategy) {
        return getPreco() * (1 - descontoStrategy.desconto(this));
    }

}
