package br.gov.ma.tce.factoryMethodQuestao6.modelo;

public class PedidoInternacional implements Pedido{
    @Override
    public void calcularImposto() {
        System.out.println("Calculando de imposto para pedido Internacional");
    }

    @Override
    public void calcularFrete() {
        System.out.println("Calculando de frete para pedido Internacional");
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento Internacional");
    }
}
