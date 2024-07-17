package br.gov.ma.tce.chainofresponsibility.q4;

public class Pedido {

    private int estoque;
    private double preco;
    private boolean desconto;
    private boolean pago;
    private boolean enviado;

    public Pedido(){}
    

    public Pedido(int estoque, double preco, boolean desconto, boolean pago, boolean enviado) {
        this.estoque = estoque;
        this.preco = preco;
        this.desconto = desconto;
        this.pago = pago;
        this.enviado = enviado;
    }

    public int getEstoque(){
        return estoque;
    }    

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public boolean getDeconto(){
        return desconto;
    }

    public boolean getPago(){
        return pago;
    }

    public boolean getEnviado(){
        return enviado;
    }



}
