package br.gov.ma.tce.stateQuestao4;

public class RecursoStage extends State{

    public RecursoStage(Processo processo) {
        super(processo);
        processo.setStatus(Status.INDEFERIDO);
    }

    @Override
    public String valido() {
        return "Processo já validado";
    }

    @Override
    public String designado() {
        processo.setState(new DesignadoState(processo));
        return "Processo sendo designado";
    }

    @Override
    public String cancelar() {
        return "Processo não pode ser cancelado";
    }

    @Override
    public String deferir() {
        return "Processo foi indeferido";
    }

    @Override
    public String indeferir() {
        return "Processo já indeferido";
    }

    @Override
    public String recurso() {
        return "Processo em recurso";
    }

    @Override
    public String prazoLegal() {
        return "Processo não pode ser fechado";
    }
}
