package br.gov.ma.tce.factoryMethodQuestao5;

import br.gov.ma.tce.factoryMethodQuestao5.produto.Sanduiche;
import br.gov.ma.tce.factoryMethodQuestao5.produtor.Lanchonete;
import br.gov.ma.tce.factoryMethodQuestao5.produtor.SanduicheCGFactory;
import br.gov.ma.tce.factoryMethodQuestao5.produtor.SanduicheJPFactory;
import br.gov.ma.tce.factoryMethodQuestao5.produtor.SanduicheRTFactory;

public class Main {
    public static void main(String[] args) {

        Lanchonete lanchoneteJP = new SanduicheJPFactory();
        Lanchonete lanchoneteCG = new SanduicheCGFactory();
        Lanchonete lanchoneteRT = new SanduicheRTFactory();

        System.out.println("Sanduiche JP");
        Sanduiche sanduicheJP = lanchoneteJP.pedirSanduiche();
        System.out.println("\nSanduiche CG");
        Sanduiche sanduicheCG = lanchoneteCG.pedirSanduiche();
        System.out.println("\nSanduiche RT");
        Sanduiche sanduicheRT = lanchoneteRT.pedirSanduiche();
    }
}
