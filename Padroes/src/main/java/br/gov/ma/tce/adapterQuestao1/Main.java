package br.gov.ma.tce.adapterQuestao1;

public class Main {
    public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();
        SomadorEsperado somadorEsperado = new SomadorAdapter(somadorExistente);
        Cliente cliente = new Cliente(somadorEsperado);
        cliente.executar();
    }
}
