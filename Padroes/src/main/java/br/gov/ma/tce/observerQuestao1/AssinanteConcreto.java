package br.gov.ma.tce.observerQuestao1;

public class AssinanteConcreto implements Assinante{

    private String nome;

    public AssinanteConcreto(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(Noticia noticia) {
        System.out.println("\n"+nome + " recebeu a notícia:");
        System.out.println(noticia.getTitulo());
        System.out.println(noticia.getConteudo());
    }
}
