package br.gov.ma.tce.factoryMethodQuestao5.produtor;

import br.gov.ma.tce.factoryMethodQuestao5.produto.Sanduiche;

public abstract class Lanchonete {

    public Sanduiche produzirSanduiche(){
        Sanduiche sanduiche = null;

        sanduiche = criarSanduiche();

        sanduiche.getIngrediente();
        return sanduiche;
    }

    protected abstract Sanduiche criarSanduiche();
}
