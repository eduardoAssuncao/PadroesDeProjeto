package br.gov.ma.tce.command;

public class Main {
    public static void main(String[] args) {

        Experimento experimento = new Experimento();

        experimento.addAction(new ElevarTemperaturaAmbiente());
        experimento.addAction(new AplicarProdutoQuimico());

        experimento.execute();
    }
}
