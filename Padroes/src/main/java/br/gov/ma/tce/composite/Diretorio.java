package br.gov.ma.tce.composite;

import java.io.File;
import java.util.ArrayList;

public class Diretorio extends Elemento{

    private ArrayList<Elemento> elementos = new ArrayList<>();

    public Diretorio(File file) {
        super(file);
        for(File f : file.listFiles()){
            Elemento elemento = ElementoFactory.execute(f);
            if(elemento != null){
                elementos.add(elemento);
            }
        }
    }

    @Override
    public long tamanho() {
        long tamanho = 0;
        for (Elemento elemento : elementos) {
            tamanho += elemento.tamanho();
        }
        return tamanho;
    }
}
