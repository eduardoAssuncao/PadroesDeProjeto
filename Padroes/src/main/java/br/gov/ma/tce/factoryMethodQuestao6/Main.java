package br.gov.ma.tce.factoryMethodQuestao6;

import br.gov.ma.tce.factoryMethodQuestao6.factory.Factory;
import br.gov.ma.tce.factoryMethodQuestao6.factory.PedidoInternacionalFactory;
import br.gov.ma.tce.factoryMethodQuestao6.factory.PedidoNacionalFactory;

public class Main {
    public static void main(String[] args) {

        Factory factory1 = new PedidoInternacionalFactory();
        Factory factory2 = new PedidoNacionalFactory();

        System.out.println("Pedido 1:");
        factory1.produzirPedido();
        System.out.println("\nPedido 2:");
        factory2.produzirPedido();
    }
}
