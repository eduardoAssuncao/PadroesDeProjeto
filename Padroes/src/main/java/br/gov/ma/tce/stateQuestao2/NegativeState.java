package br.gov.ma.tce.stateQuestao2;

public class NegativeState extends State{

    NegativeState(Cliente cliente) {
        super(cliente);
        cliente.setPositive(false);
    }

    @Override
    public Double saque(Double valor) {
        System.out.println("Sua conta está negativa.");
        return cliente.getSaldoConta();
    }

    @Override
    public Double deposito(Double valor) {
        valor = ((valor * 0.095) * 10) + cliente.getSaldoConta();
        cliente.setSaldoConta(valor);
        cliente.changeState(new PositiveState(cliente));
        return valor;
    }
}
