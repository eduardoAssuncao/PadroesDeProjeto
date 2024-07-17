package br.gov.ma.tce.chainofresponsibility.q5;

public interface FormatoChain {
  void nextChain(FormatoChain nexChain);
  void formatar(Requisicao requisicao, Conta conta);
}
