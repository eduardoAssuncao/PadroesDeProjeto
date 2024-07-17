package br.gov.ma.tce.templatemethod.Questao7;

public class Contato {
  private String nome;
  private Endereco endereco;
  private String email;
  private String telefone;

  public Contato(String nome, Endereco endereco, String telefone, String email){
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }

  public String toString() {
    return "Contato{" +
            "nome='" + nome + '\'' +
            ", telefone'" + email + '\'' +
            ", email='" + telefone + '\'' +
            ", enderece='" + endereco + '\'' +
            '}';
  }
}
