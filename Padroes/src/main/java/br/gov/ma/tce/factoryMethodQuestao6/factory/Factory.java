package br.gov.ma.tce.factoryMethodQuestao6.factory;


import br.gov.ma.tce.factoryMethodQuestao6.modelo.Pedido;

public abstract class Factory {

    public Pedido produzirPedido(){
        Pedido pedido = null;

        pedido = criarPedido();

        pedido.calcularImposto();
        pedido.calcularFrete();
        pedido.processarPagamento();

        return pedido;
    }

    protected abstract Pedido criarPedido();
}
