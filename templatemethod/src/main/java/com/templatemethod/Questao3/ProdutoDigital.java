package com.templatemethod.Questao3;

public class ProdutoDigital extends Produtos{

    private String nome;
    private double preco;


    public ProdutoDigital() {
    }

    public ProdutoDigital(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    void validar() {
        System.out.println("Validar compra");
        System.out.println("Compra relizada");
    }

    @Override
    void calcularCusto() {
        System.out.println("Não há custo de envio");
    }

    @Override
    void notificarEnvio() {
        System.out.println("O código para resgate do produto foi enviado para o seu e-mail");
        System.out.println("Disponibilizar download");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
