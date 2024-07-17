package br.gov.ma.tce.stateQuestao4;

public class DeferirStage extends State{

    public DeferirStage(Processo processo) {
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
        return "Processo já deferido";
    }

    @Override
    public String indeferir() {
        return "Processo já deferido";
    }

    @Override
    public String recurso() {
        return "Não é necessário recurso";
    }

    @Override
    public String prazoLegal() {
        processo.setState(new PrazoLegalStage(processo));
        return "Processo em fechamento";
    }
}
