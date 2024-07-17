package br.gov.ma.tce.stateQuestao4;

public class IndeferirStage extends State{

    public IndeferirStage(Processo processo) {
        super(processo);
        processo.setStatus(Status.EM_AVALIACAO);
    }

    @Override
    public String valido() {
        return "Processo já validado";
    }

    @Override
    public String designado() {
        return "Processo já designado";
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
        processo.setState(new RecursoStage(processo));
        return "Processo entrando em recurso";
    }

    @Override
    public String prazoLegal() {
        return "Processo não pode ser fechado";
    }
}
