package com.templatemethod.Questao9;

public abstract class CarBuilder {
    
    public Car buildCar(){
        Car car = new Car();
        buildChassis(car);
        installEngine(car);
        setupFeatures(car);

        return car;
    }

    public abstract void buildChassis(Car car);
    public abstract void installEngine(Car car);
    public abstract void setupFeatures(Car car);

}
