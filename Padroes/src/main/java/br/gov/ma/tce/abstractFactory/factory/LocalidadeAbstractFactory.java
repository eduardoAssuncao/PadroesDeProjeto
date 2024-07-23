package br.gov.ma.tce.abstractFactory.factory;

import br.gov.ma.tce.abstractFactory.modelo.Data;
import br.gov.ma.tce.abstractFactory.modelo.Moeda;

public abstract class LocalidadeAbstractFactory {

    public abstract Data getData();
    public abstract Moeda getMoeda();
}
