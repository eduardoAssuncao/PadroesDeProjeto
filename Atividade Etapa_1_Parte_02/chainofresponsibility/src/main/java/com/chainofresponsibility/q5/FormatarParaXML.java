package com.chainofresponsibility.q5;

public class FormatarParaXML implements FormatoChain{

  private FormatoChain chain;

  @Override
  public void nextChain(FormatoChain nexChain) {
    this.chain = nexChain;
  }

  @Override
  public void formatar(Requisicao requisicao, Conta conta) {
    if(requisicao.getFormato().equals(Formato.XML)){
      System.out.printf("<conta><nome>%s</nome> <saldo>%2f</saldo></conta>", conta.getNomeTitular(), conta.getSaldo());
    }else{
      System.out.println("Sem mais verificacao para fazer");
    }
  }
}
