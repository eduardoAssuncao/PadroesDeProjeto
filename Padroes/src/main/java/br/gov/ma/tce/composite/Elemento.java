package br.gov.ma.tce.composite;

import java.io.File;

public abstract class Elemento {

    protected File file;

    public Elemento(File file) {
        this.file = file;
    }

    public abstract long tamanho();
}
