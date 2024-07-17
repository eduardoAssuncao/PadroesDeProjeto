package br.gov.ma.tce.templatemethod.Questao8;

public class Client {
 public static void main(String[] args) {
  
  Director director = new Director();
  LivroBuilder builder = new LivroBuilder();
  director.buildLivroOne(builder);
  Livro livro = builder.getResult();
  System.out.println(livro.toString());
 } 
}
