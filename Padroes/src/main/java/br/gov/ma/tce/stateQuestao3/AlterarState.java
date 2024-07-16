package br.gov.ma.tce.stateQuestao3;

public class AlterarState extends State{

    public AlterarState(Pedido pedido) {
        super(pedido);
        pedido.setStatus(Status.PROCESSANDO);
    }

    @Override
    public String alterar() {
        return "Relizando alteração do pedido.";
    }

    @Override
    public String cancelar() {
        pedido.setStatus(Status.CANCELADO);
        pedido.setState(new CancelarState(pedido));
        return "Realizando cancelamento.";
    }

    @Override
    public String enviar() {
        pedido.setStatus(Status.ENVIADO);
        pedido.setState(new EnviarState(pedido));
        return "Realizando envio";
    }
}
