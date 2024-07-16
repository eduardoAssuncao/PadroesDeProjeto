package br.gov.ma.tce.stateQuestao3;

public class EnviarState extends State{

    public EnviarState(Pedido pedido) {
        super(pedido);
        pedido.setStatus(Status.ENVIADO);
    }

    @Override
    public String alterar() {
        return "Não é possivel realizar alterações" +
                " pois o pedido já foi enviado";
    }

    @Override
    public String cancelar() {
        return "Não é possivel cancelar" +
                " pois o pedido já foi enviado";
    }

    @Override
    public String enviar() {
        return "O pedido já foi enviado";
    }
}
