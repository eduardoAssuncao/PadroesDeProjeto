package com.strategy.q3;

public class JogoDigital extends Produto {
    public JogoDigital(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal(DescontoStrategy descontoStrategy) {
        // A subtração por 1 faz com que seja pegado o valor final de desconto
        // ao invés do valor a ser descontado.
        return getPreco() * (1 - descontoStrategy.desconto(this));
    }
}
