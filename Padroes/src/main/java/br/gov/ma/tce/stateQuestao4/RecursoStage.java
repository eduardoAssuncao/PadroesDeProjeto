package br.gov.ma.tce.stateQuestao4;

public class RecursoStage extends State{

    public RecursoStage(Processo processo) {
        super(processo);
        processo.setStatus(Status.INDEFERIDO);
    }

    @Override
    public String valido() {
        return "";
    }

    @Override
    public String designado() {
        return "";
    }

    @Override
    public String cancelar() {
        return "";
    }

    @Override
    public String deferir() {
        return "";
    }

    @Override
    public String indeferir() {
        return "";
    }

    @Override
    public String recurso() {
        return "";
    }

    @Override
    public String prazoLegal() {
        return "";
    }
}
