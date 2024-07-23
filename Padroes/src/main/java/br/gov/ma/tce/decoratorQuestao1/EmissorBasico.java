package br.gov.ma.tce.decoratorQuestao1;

public class EmissorBasico implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando uma mensagem: " + mensagem);
    }
}
