package lesson8.HomeWork2;

//класс прямоугодьник
public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1,double side2) {
        this.side1=side1;
        this.side2=side2;
    }

    //доплнительный конструкт в котором при вводе интового значения размер стороны увеличивается х10
    public Rectangle(int side1,int side2) {
        this.side1=side1*10;
        this.side2=side2*10;
    }

    //метод возвращает площадь
    double getSquareOnSides() {
        return side1*side2;
    }

    //метод возвращает переметр
    double getPerimeterOnSides() {
        return side1*side2*2;
    }

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
}
