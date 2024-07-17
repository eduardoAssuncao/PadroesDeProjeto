package br.gov.ma.tce.factoryMethodQuestao5.produtor;

import br.gov.ma.tce.factoryMethodQuestao5.produto.Sanduiche;
import br.gov.ma.tce.factoryMethodQuestao5.produto.SanduicheCG;

public class SanduicheCGFactory extends Lanchonete {

    @Override
    protected Sanduiche criarSanduiche() {
        return new SanduicheCG();
    }
}
