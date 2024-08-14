package br.gov.ma.tce.composite;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File diretorio = new File("src/main/java/br/gov/ma/tce/composite");
        File arquivo = new File("src/main/java/br/gov/ma/tce/composite/Arquivo.java");
        Elemento elemento = ElementoFactory.execute(diretorio);
        Elemento elemento2 = ElementoFactory.execute(arquivo);

        if(elemento != null) {
            long tamanho = elemento.tamanho();
            System.out.println("Tamanho do diretório: " + tamanho + "bytes");
        }

        if(elemento2 != null) {
            long tamanho = elemento2.tamanho();
            System.out.println("Tamanho do arquivo: " + tamanho + "bytes");
        }



    }
}
