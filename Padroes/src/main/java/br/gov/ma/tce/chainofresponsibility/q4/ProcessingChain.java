package br.gov.ma.tce.chainofresponsibility.q4;

public interface ProcessingChain {
    void setNext(ProcessingChain nextChain);
    void processing(Pedido pedido);
}
