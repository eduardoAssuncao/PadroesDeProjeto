package br.gov.ma.tce.chainofresponsibility.q5;

public class Conta {
  
  private double saldo;
  private String nomeTitular;

  public Conta(){}

  public Conta (double saldo, String nomeTitular){
    this.saldo = saldo;
    this.nomeTitular = nomeTitular;
  }

  public double getSaldo() {
    return saldo;
  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  
}
