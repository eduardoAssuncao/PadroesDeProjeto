package com.chainofresponsibility.q4;

public class Demo {
  public static void main(String[] args) {

    ProcessingChain c1 = new VerificacaoEstoque();
    ProcessingChain c2 = new CalculoDesconto();
    ProcessingChain c3 = new ProcessamentoPagamento();
    ProcessingChain c4 = new EnvioPedido();

    c1.setNext(c2);
    c2.setNext(c3);
    c3.setNext(c4);

    Pedido pedido1 = new Pedido(0, 0, false, false, false);
    Pedido pedido2 = new Pedido(2, 100, true, true, false);
    Pedido pedido3 = new Pedido(3, 200, false, true, true);

    c1.processing(pedido3);
    // c1.processing(pedido2);
    // c1.processing(pedido3);
        
  }
}
