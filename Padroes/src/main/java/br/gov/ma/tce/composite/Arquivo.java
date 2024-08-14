package br.gov.ma.tce.composite;

import java.io.File;

public class Arquivo extends Elemento{

    public Arquivo(File file) {
        super(file);
    }

    @Override
    public long tamanho() {
        return file.length();
    }
}
