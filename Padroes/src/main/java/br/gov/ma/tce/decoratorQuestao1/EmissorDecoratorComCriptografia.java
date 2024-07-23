package br.gov.ma.tce.decoratorQuestao1;

public class EmissorDecoratorComCriptografia extends EmissorDecorator {

    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem criptografada: ");
        this.getEmissor().enviar(criptografa(mensagem));
    }

    private String criptografa(String mensagem){
        return new StringBuilder(mensagem).reverse().toString();
    }
}
