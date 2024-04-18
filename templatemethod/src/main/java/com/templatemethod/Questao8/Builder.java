package com.templatemethod.Questao8;

public interface Builder {
  
  LivroBuilder nome(String nome);
  LivroBuilder publicacao(int ano);
  LivroBuilder autores(String... autores); //varargs
  LivroBuilder edicao(int edicao);
  LivroBuilder cidade(String cidade);
  LivroBuilder editora(String editora);
  LivroBuilder nomeOriginal(String nomeOriginal);
  LivroBuilder tradutores(String... tradutores); //varargs
  LivroBuilder paginas(int paginas);
  LivroBuilder isbn(long isbn);

  Livro getResult();
}
