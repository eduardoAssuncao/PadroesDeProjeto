package br.gov.ma.tce.stateQuestao4;

public class Main {
    public static void main(String[] args) {

        Processo processo1 = new Processo();
        System.out.println("Processo 1: ");
        System.out.println(processo1.getState().valido());
        System.out.println(processo1.getState().designado());
        System.out.println(processo1.getState().deferir());
        System.out.println(processo1.getState().prazoLegal());

        Processo processo2 = new Processo();
        System.out.println("\nProcesso 2: ");
        System.out.println(processo2.getState().valido());
        System.out.println(processo2.getState().cancelar());

        Processo processo3 = new Processo();
        System.out.println("\nProcesso 3: ");
        System.out.println(processo3.getState().valido());
        System.out.println(processo3.getState().designado());
        System.out.println(processo3.getState().indeferir());
        System.out.println(processo3.getState().recurso());
        System.out.println(processo3.getState().designado());
        System.out.println(processo3.getState().deferir());
        System.out.println(processo3.getState().prazoLegal());

    }
}
