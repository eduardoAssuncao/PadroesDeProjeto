package br.gov.ma.tce.stateQuestao3;

public class CancelarState extends State{

    public CancelarState(Pedido pedido) {
        super(pedido);
        pedido.setStatus(Status.CANCELADO);
    }

    @Override
    public String alterar() {
        return "Não é possivel realizar alterações" +
                " pois o pedido já foi enviado";
    }

    @Override
    public String cancelar() {
        return "O pedido já foi cancelado";
    }

    @Override
    public String enviar() {
        return "Não é possivel enviar" +
                " pois o pedido foi cancelado";
    }
}
