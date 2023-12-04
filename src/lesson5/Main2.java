package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /** Программа будет просить пользователя ввести с консоли фигуру
         * (треугольник, квадрат, овал, круг, трапеция)
         * Потом мы пользователя просим ввести нужные данные о фигуре (сторона, высота и тд)
         * И на основании введенных данных печатаем на консоль площадь и переметр
         */
        System.out.println("Выберете фигуру");
        System.out.println("1 - треугольник");
        System.out.println("2 - квадрат");
        System.out.println("3 - овал");
        System.out.println("4 - круг");
        System.out.println("5 - трапеция");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.next();

        if (inputFigura.equals("1") || inputFigura.equalsIgnoreCase("треугольник")) {//если вбради треугольник

            System.out.println("Выброна фигура треугольник");

            System.out.println("Введите сторону а:");
            int a = scanner.nextInt();

            System.out.println("Введите сторону b:");
            int b = scanner.nextInt();

            System.out.println("Введите сторону c:");
            int c = scanner.nextInt();

            System.out.print("Площадь треугольника: ");
            MathUtils.squareTriangle(a, b, c);
            System.out.println("Переметр треугольника: " + MathUtils.perimetrTriangle(a, b, c));

        } else if (inputFigura.equals("2") || inputFigura.equalsIgnoreCase("квадрат")) {

            System.out.println("Выброна фигура квадрат");

            System.out.println("Введите сторону а:");
            int a = scanner.nextInt();

            System.out.println("Площадь квадрата: " + MathUtils.squareBox(a));
            System.out.println("Переметр квадарата: " + MathUtils.perimetrBox(a));

        } else if (inputFigura.equals("3") || inputFigura.equalsIgnoreCase("овал")) {

            System.out.println("Выброна фигура овал");

            System.out.println("Введите полуось а:");
            int a = scanner.nextInt();

            System.out.println("Введите полусь b:");
            int b = scanner.nextInt();

            System.out.println("Площадь овала: " + MathUtils.squareOval(a, b));
            System.out.println("Переметр овала: " + MathUtils.perimetrOval(a, b));

        } else if (inputFigura.equals("4") || inputFigura.equalsIgnoreCase("круг")) {

            System.out.println("Выброна фигура круг");

            System.out.println("Введите радиус а:");
            int a = scanner.nextInt();

            int b = a;      //воспользуемся методами для овала прировняв b к a;

            System.out.println("Площадь круга: " + MathUtils.squareOval(a, b));
            System.out.println("Переметр круга: " + MathUtils.perimetrOval(a, b));

        } else if (inputFigura.equals("5") || inputFigura.equalsIgnoreCase("трапеция")) {

            System.out.println("Выброна фигура трапеция");

            System.out.println("Введите основание а:");
            int a = scanner.nextInt();

            System.out.println("Введите основание b:");
            int b = scanner.nextInt();

            System.out.println("Введите боковую сторону с:");
            int c = scanner.nextInt();

            System.out.println("Введите боковую сторону d:");
            int d = scanner.nextInt();

            System.out.println("Введите высоту h:");
            int h = scanner.nextInt();

            System.out.println("Площадь трапеции: " + MathUtils.squareTrapezoid(a, b, h));
            System.out.println("Переметр трапеции: " + MathUtils.perimetrTrapezoid(a, b , c , d));

        } else System.out.println("Перезапустите программу. Введите значения заново"); // лучше зацикливать проверку введеных значений клавишь. Либо как то оформить рестарт метода
    }
}
