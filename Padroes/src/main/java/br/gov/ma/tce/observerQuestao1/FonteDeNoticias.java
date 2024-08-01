package br.gov.ma.tce.observerQuestao1;

import java.util.ArrayList;

public class FonteDeNoticias {

    private ArrayList<Assinante> assinantes = new ArrayList<>();

    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void notificarAssinantes(Noticia noticia) {
        for(Assinante assinante : assinantes) {
            assinante.atualizar(noticia);
        }
    }

    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    public void publicarNoticia(String titulo, String conteudo){
        Noticia noticia = new Noticia(titulo, conteudo);
        notificarAssinantes(noticia);
    }


}
