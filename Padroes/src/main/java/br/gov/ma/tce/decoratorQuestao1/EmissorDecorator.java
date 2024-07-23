package br.gov.ma.tce.decoratorQuestao1;

public abstract class EmissorDecorator implements Emissor {

    private Emissor emissor;

    public EmissorDecorator(Emissor emissor) {
        this.emissor = emissor;
    }

    public abstract void enviar(String mensagem);

    public Emissor getEmissor() {
        return this.emissor;
    }
}
