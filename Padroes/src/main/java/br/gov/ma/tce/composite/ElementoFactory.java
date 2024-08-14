package br.gov.ma.tce.composite;

import java.io.File;

public class ElementoFactory {

    public static Elemento execute(File file){
        if (file.isFile()){
            return new Arquivo(file);
        } else if (file.isDirectory()){
            return new Diretorio(file);
        } else {
            System.out.println("Não foi possível computar o tamanho de " + file.getPath());
            return null;
        }
    }
}
