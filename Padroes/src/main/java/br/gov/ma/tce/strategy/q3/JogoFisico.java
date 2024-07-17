package br.gov.ma.tce.strategy.q3;

public class JogoFisico extends Produto{
    public JogoFisico(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal(DescontoStrategy descontoStrategy) {
        return getPreco() * (1 - descontoStrategy.desconto(this));
    }
}
