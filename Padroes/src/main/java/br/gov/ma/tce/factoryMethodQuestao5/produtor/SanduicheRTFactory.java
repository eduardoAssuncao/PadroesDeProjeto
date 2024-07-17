package br.gov.ma.tce.factoryMethodQuestao5.produtor;

import br.gov.ma.tce.factoryMethodQuestao5.produto.Sanduiche;
import br.gov.ma.tce.factoryMethodQuestao5.produto.SanduicheRT;

public class SanduicheRTFactory extends Lanchonete {

    @Override
    protected Sanduiche criarSanduiche() {
        return new SanduicheRT();
    }
}
