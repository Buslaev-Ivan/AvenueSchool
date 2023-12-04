package Lesson12.HomeWork2.com.company.vehicles;

import Lesson12.HomeWork2.com.company.details.Engine;
import Lesson12.HomeWork2.com.company.professions.Driver;

public class SportCar extends Car {
    private int limitSpeed;

    public SportCar(String brandCar, String classCar, int weightCar, Driver driver, Engine engine, int limitSpeed) {
        super(brandCar, classCar, weightCar, driver, engine);
        this.limitSpeed = limitSpeed;
    }

    public int getLimitSpeed() {
        return limitSpeed;
    }

    public void setLimitSpeed(int limitSpeed) {
        this.limitSpeed = limitSpeed;
    }

    @Override
    public String toString() {
        return SportCar.super.toString() +
                ", Максималка=" + limitSpeed;
    }
}
