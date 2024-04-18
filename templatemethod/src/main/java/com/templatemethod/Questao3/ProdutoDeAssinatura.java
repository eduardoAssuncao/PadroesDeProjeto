package com.templatemethod.Questao3;

public class ProdutoDeAssinatura extends Produtos{

    private String nome;
    private double preco;

    public ProdutoDeAssinatura(){
        
    }

    public ProdutoDeAssinatura(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    void validar() {
        System.out.println("Validar compra");
        System.out.println("Compra relizada");
        System.out.println("Configurar pagamento recorrente");
    }

    @Override
    void calcularCusto() {
        System.out.println("Não há custo de envio");
    }

    @Override
    void notificarEnvio() {
        System.out.println("verificar dias de assinatura e enviar lembretes de renovação");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return this.preco;
    }
    
}
