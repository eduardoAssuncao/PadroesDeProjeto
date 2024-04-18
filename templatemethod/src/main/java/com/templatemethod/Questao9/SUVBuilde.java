package com.templatemethod.Questao9;

public class SUVBuilde extends CarBuilder{

    @Override
    public void buildChassis(Car car) {
        car.setChassis("SUV chassi");
    }

    @Override
    public void installEngine(Car car) {
        car.setEngine("SUV engine");
    }

    @Override
    public void setupFeatures(Car car) {
        car.setFeatures("SUV feature");
    }
    
}
