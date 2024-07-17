package br.gov.ma.tce.stateQuestao2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Cliente cliente = new Cliente();

        System.out.println("Cliente POSITIVO? " + cliente.isPositive());
        System.out.println("Deposito: " + cliente.getState().deposito(100.0));
        System.out.println("Cliente POSITIVO? " + cliente.isPositive());
        System.out.println("Saque: " + cliente.getState().saque(100.0));
        System.out.println("Cliente POSITIVO? " + cliente.isPositive());
        System.out.println("Saldo: " + cliente.getState().saque(100.0));
        System.out.println("Deposito: " + cliente.getState().deposito(100.0));
        System.out.println("Cliente POSITIVO? " + cliente.isPositive());
    }
}