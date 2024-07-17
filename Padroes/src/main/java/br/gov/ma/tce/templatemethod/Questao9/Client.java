package br.gov.ma.tce.templatemethod.Questao9;

public class Client {
    public static void main(String[] args) {
        SedanBuilder sedanBuilder = new SedanBuilder();
        Car sedan = sedanBuilder.buildCar();
        System.out.println(sedan.toString());
        
        SUVBuilde suvBuilder = new SUVBuilde();
        Car suv = suvBuilder.buildCar();
        System.out.println(suv.toString());
        
        SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
        Car sportsCar = sportsCarBuilder.buildCar();
        System.out.println(sportsCar.toString());

    }
}
