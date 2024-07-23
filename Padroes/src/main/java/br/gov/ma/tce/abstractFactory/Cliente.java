package br.gov.ma.tce.abstractFactory;

import br.gov.ma.tce.abstractFactory.factory.Factory;
import br.gov.ma.tce.abstractFactory.factory.LocalidadeAbstractFactory;
import br.gov.ma.tce.abstractFactory.modelo.Data;
import br.gov.ma.tce.abstractFactory.modelo.Moeda;

public class Cliente {
    public static void main(String[] args) {

        LocalidadeAbstractFactory localidadeFactory = Factory.newLocalidade();
        Data data = localidadeFactory.getData();
        Moeda moeda = localidadeFactory.getMoeda();

        System.out.println("Data: " +  data);
        System.out.println("Moeda: " +  moeda);
    }
}
