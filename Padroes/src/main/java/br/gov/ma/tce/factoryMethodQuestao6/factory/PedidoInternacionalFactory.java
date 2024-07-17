package br.gov.ma.tce.factoryMethodQuestao6.factory;

import br.gov.ma.tce.factoryMethodQuestao6.modelo.Pedido;
import br.gov.ma.tce.factoryMethodQuestao6.modelo.PedidoInternacional;

public class PedidoInternacionalFactory extends Factory{

    @Override
    protected Pedido criarPedido() {
        return new PedidoInternacional();
    }
}
