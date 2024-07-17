package br.gov.ma.tce.stateQuestao4;

public class DesignadoState extends State{

    public DesignadoState(Processo processo) {
        super(processo);
        processo.setStatus(Status.CRIADO);
    }

    @Override
    public String valido() {
        return "Processo já validado";
    }

    @Override
    public String designado() {
        return "Processo designado";
    }

    @Override
    public String cancelar() {
        return "Processo não pode ser cancelado";
    }

    @Override
    public String deferir() {
        processo.setState(new DeferirStage(processo));
        return "Processo deferido";
    }

    @Override
    public String indeferir() {
        processo.setState(new IndeferirStage(processo));
        return "Processo indeferido";
    }

    @Override
    public String recurso() {
        return "Processo ainda não pode entrar em recurso";
    }

    @Override
    public String prazoLegal() {
        return "Prazo legal ainda não verificado";
    }
}
