package br.gov.ma.tce.templatemethod.Questao8;

public class Director {
  
  public void buildLivroOne(Builder builder){
    
    builder.nome("Thinking to think")
    .autores("JJ", "KK")
    .cidade("Sao Luis")
    .edicao(12)
    .editora("OSU")
    .nomeOriginal("Think to Thinking")
    .paginas(165)
    .isbn(1231414122)
    .publicacao(1999)
    .tradutores("KKJ", "JJK")
    .getResult();
  }
}
