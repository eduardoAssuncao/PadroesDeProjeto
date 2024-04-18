package com.templatemethod.Questao7;

public class Client {
  public static void main(String[] args) {
    Director director = new Director();
    
    ContatoBuilder builder = new ContatoBuilder();
    director.buildContatoCompleto(builder);
    Contato contato = builder.getResult();
    System.out.println(contato.toString());

    ContatoBuilder builder2 = new ContatoBuilder();
    director.buildContatoTelefone(builder2);
    Contato contato2 = builder2.getResult();
    System.out.println(contato2.toString());
    
    ContatoBuilder builder3 = new ContatoBuilder();
    director.builderContatoInternet(builder3);
    Contato contato3 = builder3.getResult();
    System.out.println(contato3.toString());
  }
}
