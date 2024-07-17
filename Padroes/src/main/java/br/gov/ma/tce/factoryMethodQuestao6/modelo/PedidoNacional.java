package br.gov.ma.tce.factoryMethodQuestao6.modelo;

public class PedidoNacional implements Pedido {
    @Override
    public void calcularImposto() {
        System.out.println("Calculando de imposto para pedido Nacional");
    }

    @Override
    public void calcularFrete() {
        System.out.println("Calculando frete para pedido Nacional");
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para pedido Nacional");
    }
}
