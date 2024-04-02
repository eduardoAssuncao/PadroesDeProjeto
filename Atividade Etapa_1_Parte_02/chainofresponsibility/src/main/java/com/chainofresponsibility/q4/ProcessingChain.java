package com.chainofresponsibility.q4;

public interface ProcessingChain {
    void setNext(ProcessingChain nextChain);
    void processing(Pedido pedido);
}
