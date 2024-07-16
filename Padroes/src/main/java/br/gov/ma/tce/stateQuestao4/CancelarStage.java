package br.gov.ma.tce.stateQuestao4;

public class CancelarStage extends State{

    public CancelarStage(Processo processo) {
        super(processo);
        processo.setStatus(Status.CRIADO);
    }

    @Override
    public String valido() {
        return "Processo já validado";
    }

    @Override
    public String designado() {
        return "Processo em cancelamento";
    }

    @Override
    public String cancelar() {
        processo.setStatus(Status.FECHADO);
        return "Processo cancelado";
    }

    @Override
    public String deferir() {
        return "O processo foi cancelado;";
    }

    @Override
    public String indeferir() {
        return "O processo foi cancelado";
    }

    @Override
    public String recurso() {
        return "O processo foi cancelado";
    }

    @Override
    public String prazoLegal() {
        return "Processo foi cancelado";
    }
}
