package Lesson12.HomeWork2.com.company.details;

import Lesson12.HomeWork2.com.company.professions.Driver;
import Lesson12.HomeWork2.com.company.vehicles.Car;

public class Engine {
    private String manufacturerEngine;
    private int powerEngine;

    public Engine(String manufacturerEngine, int powerEngine) {
        this.manufacturerEngine = manufacturerEngine;
        this.powerEngine = powerEngine;
    }

    public String getManufacturerEngine() {
        return manufacturerEngine;
    }

    public void setManufacturerEngine(String manufacturerEngine) {
        this.manufacturerEngine = manufacturerEngine;
    }

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    @Override
    public String toString() {
        return ", Двигатель='" + manufacturerEngine + '\'' +
                ", Мощность=" + powerEngine ;
    }
}
