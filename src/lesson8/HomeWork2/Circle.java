package lesson8.HomeWork2;

//класс круг
public class Circle {
    private double diameter;

    //конструктор класса. Если дабл то принимаем входные как диаметр
    public Circle(double side1) {
        diameter = side1;
    }

    //конструктор класса. Если int то принимаем входные как радиус
    public Circle(int side1) {
        diameter = side1*2;
    }

    //метод возвращает переметр
    double getPerimeter() {
        return diameter*Math.PI;
    }

    //метод возвращает площадь
    double getSquare() {
        return diameter*diameter*Math.PI/4;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }
}
