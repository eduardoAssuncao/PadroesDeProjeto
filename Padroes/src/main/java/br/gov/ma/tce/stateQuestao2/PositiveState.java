package br.gov.ma.tce.stateQuestao2;

public class PositiveState extends State{

    PositiveState(Cliente cliente) {
        super(cliente);
        cliente.setPositive(true);
    }

    @Override
    public Double saque(Double valor) {
        cliente.setSaldoConta(cliente.getSaldoConta() - valor);
        if(cliente.getSaldoConta() < 0) {
            cliente.changeState(new NegativeState(cliente));
        }
        return valor;
    }

    @Override
    public Double deposito(Double valor) {
        valor = (valor * 0.098) * 10;
        cliente.setSaldoConta(valor);
        return valor;
    }
}
