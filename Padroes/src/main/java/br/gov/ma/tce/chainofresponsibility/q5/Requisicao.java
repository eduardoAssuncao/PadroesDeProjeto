package br.gov.ma.tce.chainofresponsibility.q5;

public class Requisicao {
  private Formato formato;

  public Requisicao(Formato formato){
    this.formato = formato;
  }

  public Formato getFormato(){
    return formato;
  }
}
