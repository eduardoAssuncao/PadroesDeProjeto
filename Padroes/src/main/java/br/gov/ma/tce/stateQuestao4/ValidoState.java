package br.gov.ma.tce.stateQuestao4;

public class ValidoState extends State{

    public ValidoState(Processo processo) {
        super(processo);
        processo.setStatus(Status.GESTACAO);
    }

    @Override
    public String valido() {
        return "Processo já validado";
    }

    @Override
    public String designado() {
        processo.setState(new DesignadoState(processo));
        return "Processo designado";
    }

    @Override
    public String cancelar() {
        processo.setState(new CancelarStage(processo));
        return "Cancelando processo";
    }

    @Override
    public String deferir() {
        return "Avaliação não realizada";
    }

    @Override
    public String indeferir() {
        return "Avaliação não realizada";
    }

    @Override
    public String recurso() {
        return "Processo não avaliado";
    }

    @Override
    public String prazoLegal() {
        return "Processo não avaliado";
    }
}
