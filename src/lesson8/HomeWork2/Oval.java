package lesson8.HomeWork2;

//класс овал
public class Oval {
    private double radius1;
    private double radius2;

    //конструктор класса. пустой
    public Oval() {
    }

    //конструктор класса. Если дабл то принимаем входные как диаметр
    public Oval(double side1, double side2) {
        radius1 = side1 / 2;
        radius2 = side2 / 2;
    }

    //конструктор класса. Если int то принимаем входные как радиус
    public Oval(int side1, int side2) {
        radius1 = side1;
        radius2 = side2;
    }

    //метод возвращает переметр
    double getPerimeter() {
        return 2*Math.PI*Math.sqrt((radius1*radius1+radius2*radius2)/2);
    }

    //метод возвращает площадь
    double getSquare() {
        return radius1*radius2*Math.PI;
    }

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }
}

