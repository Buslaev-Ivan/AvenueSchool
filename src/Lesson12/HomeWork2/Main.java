package Lesson12.HomeWork2;

import Lesson12.HomeWork2.com.company.details.Engine;
import Lesson12.HomeWork2.com.company.professions.Driver;
import Lesson12.HomeWork2.com.company.vehicles.Car;
import Lesson12.HomeWork2.com.company.vehicles.Lorry;
import Lesson12.HomeWork2.com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[10];

        Driver driver1 = new Driver("Иван", "Иванов", "Иванович", 56, 30);
        Driver driver2 = new Driver("Алекс", "Александров", "Александрович", 45, 15);
        Driver driver3 = new Driver("Николай", "Николаев", "Николаевич", 25, 5);
        Driver driver4 = new Driver("Михаил", "Михаилов", "Михайлович", 37, 7);

        Engine engine1 = new Engine("Каменс", 250);
        Engine engine2 = new Engine("Каменс", 350);
        Engine engine3 = new Engine("BMW", 450);
        Engine engine4 = new Engine("BMW", 550);
        Engine engine5 = new Engine("Ваз", 100);


        cars[0] = new Lorry("ГАЗ", "Грузовик", 4500, driver1, engine1, 1500);
        cars[1] = new Lorry("ГАЗ", "Грузовик", 4500, driver2, engine1, 1500);
        cars[2] = new Lorry("Камаз", "Грузовик", 12500, driver1, engine2, 6500);
        cars[3] = new Lorry("Камаз", "Грузовик", 12500, driver2, engine2, 6500);
        cars[4] = new SportCar("BMW", "Спорт", 1500, driver3, engine3, 240);
        cars[5] = new SportCar("BMW", "Спорт", 1500, driver3, engine3, 240);
        cars[6] = new SportCar("BMW", "Спорт", 1500, driver4, engine4, 280);
        cars[7] = new SportCar("BMW", "Спорт", 1500, driver4, engine4, 280);
        cars[8] = new Car("ВАЗ","эконом",1500,driver1,engine5);
        cars[9] = new Car("ВАЗ","эконом",1500,driver2,engine5);


        for (Car vehicles : cars) {
            System.out.println(vehicles.toString());
        }

        System.out.println();
        System.out.println();

        cars[6].start();
        cars[7].stop();
    }
}
