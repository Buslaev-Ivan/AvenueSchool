package Lesson12.HomeWork2.com.company.vehicles;

import Lesson12.HomeWork2.com.company.details.Engine;
import Lesson12.HomeWork2.com.company.professions.Driver;

public class Lorry extends Car {
    private int tonnageLorry;

    public Lorry(String brandCar, String classCar, int weightCar, Driver driver, Engine engine, int tonnageLorry) {
        super(brandCar, classCar, weightCar, driver, engine);
        this.tonnageLorry = tonnageLorry;
    }

    public int getTonnageLorry() {
        return tonnageLorry;
    }

    public void setTonnageLorry(int tonnageLorry) {
        this.tonnageLorry = tonnageLorry;
    }

    @Override
    public String toString() {
        return Lorry.super.toString() +
                ", Грузоподьемность=" + tonnageLorry +
                '}';
    }
}
