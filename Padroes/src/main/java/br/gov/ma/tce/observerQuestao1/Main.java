package br.gov.ma.tce.observerQuestao1;

public class Main {
    public static void main(String[] args) {
        FonteDeNoticias fonte = new FonteDeNoticias();

        Assinante assinante1 = new AssinanteConcreto("Eduardo");
        Assinante assinante2 = new AssinanteConcreto("Ana");
        Assinante assinante3 = new AssinanteConcreto("João");

        fonte.adicionarAssinante(assinante1);
        fonte.adicionarAssinante(assinante2);
        fonte.adicionarAssinante(assinante3);

        fonte.publicarNoticia("Olimpíadas", "China lidera quadro de medalhas.");
        fonte.publicarNoticia("Brasil Olimpíadas", "Brasil está com cinco medalhas até o momento.");

        fonte.removerAssinante(assinante1);
        fonte.removerAssinante(assinante2);

        fonte.publicarNoticia("Brasil Olimpíadas", "Seleção brasileira está classificada?");


    }

}
