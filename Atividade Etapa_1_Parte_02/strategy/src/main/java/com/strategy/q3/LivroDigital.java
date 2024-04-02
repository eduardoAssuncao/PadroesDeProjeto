package com.strategy.q3;

public class LivroDigital extends Produto{
    public LivroDigital(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal(DescontoStrategy descontoStrategy) {
        return getPreco() * (1 - descontoStrategy.desconto(this));
    }
}
