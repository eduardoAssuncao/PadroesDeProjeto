package com.chainofresponsibility.q5;

public class FormatarParaCSV implements FormatoChain{

  private FormatoChain chain;

  @Override
  public void nextChain(FormatoChain nexChain) {
    this.chain = nexChain;
  }

  @Override
  public void formatar(Requisicao requisicao, Conta conta) {
    if(requisicao.getFormato().equals(Formato.CSV)){
      System.out.printf("%s%%%2f", conta.getNomeTitular(), conta.getSaldo());
    }else{
      chain.formatar(requisicao, conta);
    }
  }
  
}
