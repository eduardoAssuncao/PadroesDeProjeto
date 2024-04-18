package com.templatemethod.Questao9;

public class SedanBuilder extends CarBuilder{

    @Override
    public void buildChassis(Car car) {
        car.setChassis("Sedan chassi");
    }

    @Override
    public void installEngine(Car car) {
        car.setEngine("Sedan engine");
    }

    @Override
    public void setupFeatures(Car car) {
        car.setFeatures("Sedan feature");
    }
    
}
