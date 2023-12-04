package lesson8.HomeWork2;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(10.0, 10.0, 10.0);
        Triangle triangle2 = new Triangle(10.0, 10.0, 60);
        Square square1 = new Square(10);
        Square square2 = new Square(10.0);
        Rectangle rectangle1 = new Rectangle(10, 10);
        Rectangle rectangle2 = new Rectangle(10.0, 10.0);
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(10.0);
        Oval oval1 = new Oval(10, 5);
        Oval oval2 = new Oval(10.0, 5.0);
        Oval oval3 = new Oval();
        oval3.setRadius1(10.0);
        oval3.setRadius2(5.0);

        System.out.println();
        System.out.printf("Для треугольника со сторонами: %s, %s, %s \n", triangle1.getSide1(), triangle1.getSide2(), triangle1.getSide3());
        System.out.println("Переметр составит: " + triangle1.getPerimeterOnThreeSides());
        System.out.println("Площадь составит: " + triangle1.getSquareOnThreeSides());
        System.out.println();

        System.out.printf("Для треугольника со сторонами: %s, %s и углом %s \n", triangle2.getSide1(), triangle2.getSide2(), triangle2.getAngle1());
        System.out.println("Переметр составит: " + triangle2.getPerimeterOnTwoSidesAndAngle());
        System.out.println("Площадь составит: " + triangle2.getSquareOnTwoSidesAndAngle());
        System.out.println();

        System.out.println("Для квадрата со стороной: " + square1.getSide1());
        System.out.println("Переметр составит: " + square1.getPerimeterOnSides());
        System.out.println("Площадь составит: " + square1.getSquareOnSides());
        System.out.println();

        System.out.println("Для квадрата со стороной: " + square2.getSide1());
        System.out.println("Переметр составит: " + square2.getPerimeterOnSides());
        System.out.println("Площадь составит: " + square2.getSquareOnSides());
        System.out.println();

        System.out.printf("Для прямоугольника со сторонами: %s, %s \n", rectangle1.getSide1(), rectangle1.getSide2());
        System.out.println("Переметр составит: " + rectangle1.getPerimeterOnSides());
        System.out.println("Площадь составит: " + rectangle1.getSquareOnSides());
        System.out.println();

        System.out.printf("Для прямоугольника со сторонами: %s, %s \n", rectangle2.getSide1(), rectangle2.getSide2());
        System.out.println("Переметр составит: " + rectangle2.getPerimeterOnSides());
        System.out.println("Площадь составит: " + rectangle2.getSquareOnSides());
        System.out.println();

        System.out.println("Для окружности диаметром: " + circle1.getDiameter());
        System.out.println("Переметр составит: " + circle1.getPerimeter());
        System.out.println("Площадь составит: " + circle1.getSquare());
        System.out.println();

        System.out.println("Для окружности диаметром: " + circle2.getDiameter());
        System.out.println("Переметр составит: " + circle2.getPerimeter());
        System.out.println("Площадь составит: " + circle2.getSquare());
        System.out.println();

        System.out.printf("Для овала с радиусами: %s, %s \n", oval1.getRadius1(), oval1.getRadius2());
        System.out.println("Переметр составит: " + oval1.getPerimeter());
        System.out.println("Площадь составит: " + oval1.getSquare());
        System.out.println();

        System.out.printf("Для овала с радиусами: %s, %s \n", oval2.getRadius1(), oval2.getRadius2());
        System.out.println("Переметр составит: " + oval2.getPerimeter());
        System.out.println("Площадь составит: " + oval2.getSquare());
        System.out.println();

        System.out.printf("Для овала с радиусами: %s, %s \n", oval3.getRadius1(), oval3.getRadius2());
        System.out.println("Переметр составит: " + oval3.getPerimeter());
        System.out.println("Площадь составит: " + oval3.getSquare());
        System.out.println();
    }
}
