package com.templatemethod.Questao7;

public class ContatoBuilder implements Builder{

  private String nome;
  private String email;
  private Endereco endereco;
  private String telefone;

  @Override
  public void comNome(String nome) {
    this.nome = nome;
  }

  @Override
  public void comEmail(String email) {
    this.email = email;
  }

  @Override
  public void comTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public void comEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  @Override
  public Contato getResult() {
    return new Contato(nome, endereco, email, telefone);
  }
  
}
