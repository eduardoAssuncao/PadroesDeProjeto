package br.gov.ma.tce.observerQuestao1;

public class Noticia {

    private String titulo;
    private String conteudo;

    public Noticia() {}

    public Noticia(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

}
