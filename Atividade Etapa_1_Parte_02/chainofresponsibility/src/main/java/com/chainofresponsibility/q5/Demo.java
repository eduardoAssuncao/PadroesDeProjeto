package com.chainofresponsibility.q5;

public class Demo {

  public static void main(String[] args) {

    FormatoChain c1 = new FormatarParaCSV();
    FormatoChain c2 = new FormatarParaJson();
    FormatoChain c3 = new FormatarParaXML();

    c1.nextChain(c2);
    c2.nextChain(c3);

    Requisicao req1 = new Requisicao(Formato.CSV);
    Requisicao req2 = new Requisicao(Formato.XML);
    Requisicao req3 = new Requisicao(Formato.JSON);

    Conta conta = new Conta(350000000, "Ana");

    c1.formatar(req1, conta);
    System.out.println("\n");
    c1.formatar(req2, conta);
    System.out.println("\n");
    c1.formatar(req3, conta);
    System.out.println("\n");
  }
}
