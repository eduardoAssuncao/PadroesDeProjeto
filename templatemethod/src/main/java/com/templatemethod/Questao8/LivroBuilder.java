package com.templatemethod.Questao8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LivroBuilder implements Builder{
  private String nomeNacional;
  private int ano;
  private List<String> autores = new ArrayList<>();
  private int edicao;
  private String cidade;
  private String editora;
  private String nomeOriginal;
  private List<String> tradutores = new ArrayList<>();
  private int paginas;
  private long isbn;

  public LivroBuilder nome(String nomeNacional){
    this.nomeNacional = nomeNacional;
    return this;
  }

  @Override
  public LivroBuilder publicacao(int ano) {
    this.ano = ano;
    return this;
  }

  @Override
  public LivroBuilder autores(String... autores) {
    this.autores.addAll(Arrays.asList(autores));
    return this;
  }
  
  @Override
  public LivroBuilder edicao(int edicao) {
    this.edicao = edicao;
    return this;
  }
  
  @Override
  public LivroBuilder cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }
  
  @Override
  public LivroBuilder editora(String editora) {
    this.editora = editora;
    return this;
  }
  
  @Override
  public LivroBuilder nomeOriginal(String nomeOriginal) {
    this.nomeOriginal = nomeOriginal;
    return this;
  }
  
  @Override
  public LivroBuilder tradutores(String... tradutores) {
    this.tradutores.addAll(Arrays.asList(tradutores));
    return this;
  }
  
  @Override
  public LivroBuilder paginas(int paginas) {
    this.paginas = paginas;
    return this;
  }
  
  @Override
  public LivroBuilder isbn(long isbn) {
    this.isbn = isbn;
    return this;
  }

  @Override
  public Livro getResult() {
    return new Livro(nomeNacional, ano, autores, edicao, cidade, editora, nomeOriginal, tradutores, paginas, isbn);
  }
}
