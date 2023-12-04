package lesson8.HomeWork2;

//класс треугольник
public class Triangle {
    //переменные по сторонам
    private double side1;
    private double side2;
    private double side3;
    //переменные по углам
    private int angle1;

    //конструктор класса по стороне
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //конструктор класса по углу
    public Triangle(double side1, double side2, int angle1) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle1 = angle1;
    }

    //метод возвращает переметр по трем сторонам
    double getPerimeterOnThreeSides() {
        return side1 + side2 + side3;
    }

    //метод возвращает площадь по трем сторонам
    double getSquareOnThreeSides() {
        double small_P = (side1 + side2 + side3) / 2; //полупереметр
        return Math.sqrt(small_P * (small_P - side1) * (small_P - side2) * (small_P - side3));
    }


    //метод возвращает площадь по двум сторонам и углу между ними
    double getSquareOnTwoSidesAndAngle() {
        return (side1 * side2 * Math.sin(Math.toRadians(angle1))) / 2;
    }

    //метод возвращает переметр по двум сторонам и углу между ними
    double getPerimeterOnTwoSidesAndAngle() {
        return Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(Math.toRadians(angle1))) + side1 + side2;
    }

    //сгенерированные геттеры-сетторы
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public int getAngle1() {
        return angle1;
    }

    public void setAngle1(int angle1) {
        this.angle1 = angle1;
    }

}
