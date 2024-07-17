package br.gov.ma.tce.templatemethod.Questao8;

import java.util.List;

public class Livro {
  
  private String nomeNacional;
  private int ano;
  private List<String> autores;
  private int edicao;
  private String cidade;
  private String editora;
  private String nomeOriginal;
  private List<String> tradutores;
  private int paginas;
  private long isbn;

  public Livro(String nomeNacional, int ano, List<String> autores, 
        int edicao, String cidade, String editora, String nomeOriginal, 
        List<String> tradutores, int paginas, long isbn) {

    this.nomeNacional = nomeNacional;
    this.ano = ano;
    this.autores = autores;
    this.edicao = edicao;
    this.cidade = cidade;
    this.editora = editora;
    this.nomeOriginal = nomeOriginal;
    this.tradutores = tradutores;
    this.paginas = paginas;
    this.isbn = isbn;
  }

  public String getNomeNacional() {
    return nomeNacional;
  }

  public int getAno() {
    return ano;
  }

  public List<String> getAutores() {
    return autores;
  }

  public int getEdicao() {
    return edicao;
  }

  public String getCidade() {
    return cidade;
  }

  public String getEditora() {
    return editora;
  }

  public String getNomeOriginal() {
    return nomeOriginal;
  }

  public List<String> getTradutores() {
    return tradutores;
  }

  public int getPaginas() {
    return paginas;
  }

  public long getIsbn() {
    return isbn;
  }

  @Override
    public String toString() {
        return "Livro{" +
                "nomeNacional='" + nomeNacional + '\'' +
                ", ano=" + ano +
                ", autores=" + autores +
                ", edicao=" + edicao +
                ", cidade='" + cidade + '\'' +
                ", editora='" + editora + '\'' +
                ", nomeOriginal='" + nomeOriginal + '\'' +
                ", tradutores=" + tradutores +
                ", paginas=" + paginas +
                ", isbn=" + isbn +
                '}';
    }
}
