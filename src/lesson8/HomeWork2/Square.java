package lesson8.HomeWork2;

//класс кварат
public class Square {
    private double side1;

    public Square(double side1) {
        this.side1=side1;
    }

    //доплнительный конструкт в котором при вводе интового значения размер стороны увеличивается х10
    public Square(int side1) {
        this.side1=side1*10;
    }

    //метод возвращает площадь
    double getSquareOnSides() {
        return side1*side1;
    }

    //метод возвращает переметр
    double getPerimeterOnSides() {
        return side1*4;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
}
