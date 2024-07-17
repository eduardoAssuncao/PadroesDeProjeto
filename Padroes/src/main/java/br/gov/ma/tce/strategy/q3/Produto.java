package br.gov.ma.tce.strategy.q3;

public abstract class Produto{
    private String nome;
    private double preco;

    public Produto(){}

    public Produto (String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public abstract double calcularPrecoFinal(DescontoStrategy descontoStrategy);
}
