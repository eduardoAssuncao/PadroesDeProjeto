package com.chainofresponsibility.q5;

public interface FormatoChain {
  void nextChain(FormatoChain nexChain);
  void formatar(Requisicao requisicao, Conta conta);
}
