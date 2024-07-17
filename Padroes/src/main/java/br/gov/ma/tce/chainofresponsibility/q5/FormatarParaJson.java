package br.gov.ma.tce.chainofresponsibility.q5;

public class FormatarParaJson implements FormatoChain{

  private FormatoChain chain;

  @Override
  public void nextChain(FormatoChain nexChain) {
    this.chain = nexChain;  
  }

  @Override
  public void formatar(Requisicao requisicao, Conta conta) {
    if(requisicao.getFormato().equals(Formato.JSON)){
      System.out.printf("{nome:%s,saldo:%2f}", conta.getNomeTitular(), conta.getSaldo());
    }else{
      chain.formatar(requisicao, conta);
    }
  }
  
}
