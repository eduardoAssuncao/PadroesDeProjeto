package br.gov.ma.tce.abstractFactory.factory;

import br.gov.ma.tce.abstractFactory.modelo.Data;
import br.gov.ma.tce.abstractFactory.modelo.DataEUA;
import br.gov.ma.tce.abstractFactory.modelo.Moeda;
import br.gov.ma.tce.abstractFactory.modelo.MoedaEUA;

public class LocalidadeEUA extends LocalidadeAbstractFactory{

    @Override
    public Data getData() {
        return new DataEUA();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaEUA();
    }
}
