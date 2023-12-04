package Lesson12.HomeWork2.com.company.vehicles;

import Lesson12.HomeWork2.com.company.details.Engine;
import Lesson12.HomeWork2.com.company.professions.Driver;
import Lesson12.HomeWork2.com.company.professions.Person;

public class Car {
    private String brandCar;
    private String classCar;
    private int weightCar;
    private Driver driver;
    private Engine engine;

    public Car(String brandCar, String classCar, int weightCar, Driver driver, Engine engine) {
        this.brandCar = brandCar;
        this.classCar = classCar;
        this.weightCar = weightCar;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Марка:'" + brandCar + '\'' +
                ", Класс'" + classCar + '\'' +
                ", Вес=" + weightCar +
                engine.toString() +
                driver.toString();
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getWeightCar() {
        return weightCar;
    }

    public void setWeightCar(int weightCar) {
        this.weightCar = weightCar;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
