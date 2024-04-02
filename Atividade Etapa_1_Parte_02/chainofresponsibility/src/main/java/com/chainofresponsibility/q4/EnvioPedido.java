package com.chainofresponsibility.q4;

public class EnvioPedido implements ProcessingChain{

    private ProcessingChain chain;

    @Override
    public void setNext(ProcessingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void processing(Pedido pedido) {
        if(pedido.getEnviado() == true){
            System.out.println("Pedido realizado e enviado");
        }else {
            System.out.println("Pedido realizado, mas não enviado");
        }
    }
    
}
