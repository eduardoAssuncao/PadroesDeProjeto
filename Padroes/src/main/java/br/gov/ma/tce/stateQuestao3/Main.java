package br.gov.ma.tce.stateQuestao3;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        System.out.println("PEDIDO 1:");
        System.out.println(pedido1.getState().alterar());
        System.out.println(pedido1.getState().enviar());
        System.out.println(pedido1.getState().cancelar());

        Pedido pedido2 = new Pedido();
        System.out.println("PEDIDO 2:");
        System.out.println(pedido2.getState().cancelar());
        System.out.println(pedido2.getState().alterar());
        System.out.println(pedido2.getState().enviar());

        Pedido pedido3 = new Pedido();
        System.out.println("PEDIDO 3:");
        System.out.println(pedido3.getState().enviar());
        System.out.println(pedido3.getState().alterar());
        System.out.println(pedido3.getState().cancelar());

    }
}
