package com.chainofresponsibility.q4;

public class ProcessamentoPagamento implements ProcessingChain{

    private ProcessingChain chain;

    @Override
    public void setNext(ProcessingChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void processing(Pedido pedido) {
        if(pedido.getPago() == true){
            chain.processing(pedido);
        }else{
            System.out.println("Pagamento não realizado");
        }
    }
}
