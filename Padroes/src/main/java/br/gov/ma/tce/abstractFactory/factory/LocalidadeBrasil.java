package br.gov.ma.tce.abstractFactory.factory;

import br.gov.ma.tce.abstractFactory.modelo.Data;
import br.gov.ma.tce.abstractFactory.modelo.DataBrasil;
import br.gov.ma.tce.abstractFactory.modelo.Moeda;
import br.gov.ma.tce.abstractFactory.modelo.MoedaBrasil;

public class LocalidadeBrasil extends LocalidadeAbstractFactory{

    @Override
    public Data getData() {
        return new DataBrasil();
    }

    @Override
    public Moeda getMoeda() {
        return new MoedaBrasil();
    }
}
