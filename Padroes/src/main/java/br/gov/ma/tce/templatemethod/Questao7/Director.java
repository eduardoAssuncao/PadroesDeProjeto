package br.gov.ma.tce.templatemethod.Questao7;

public class Director {

  public void buildContatoCompleto(Builder builder){
    builder.comNome("Eduardo");
    builder.comTelefone("98987788764");
    builder.comEmail("eduardo@gmail.com");
    builder.comEndereco(new Endereco("Dr Ribeiro", 6, "Cantinho do Ceu", "Sao Luis", "Maranhao"));
  }
  
  public void buildContatoTelefone(Builder builder){
    builder.comNome("Eduardo");
    builder.comTelefone("98987788764");
  }
  
  public void builderContatoInternet(Builder builder){
    builder.comNome("Eduardo");
    builder.comEmail("eduardo@gmail.com");
  }
}
