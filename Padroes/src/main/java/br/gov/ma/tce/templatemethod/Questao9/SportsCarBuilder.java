package br.gov.ma.tce.templatemethod.Questao9;

public class SportsCarBuilder extends CarBuilder{

    @Override
    public void buildChassis(Car car) {
        car.setChassis("SportsCar chassi");
    }

    @Override
    public void installEngine(Car car) {
        car.setEngine("SportCar engine");
    }

    @Override
    public void setupFeatures(Car car) {
        car.setFeatures("SportsCar feature");
    }
    
}
