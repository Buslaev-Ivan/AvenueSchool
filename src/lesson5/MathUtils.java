package lesson5;

public class MathUtils {
    /**
     * Создание метода;
     * 1 - модификатор доступа (слово определяющее область видимости)
     * public - доступ внутри всего проекта
     * protected - доступен только внутри текущей папки, и наследникам текущего класса
     * ------- - доступен только внутри текущей папки
     * private - доступ только в этом классе
     * <p>
     * Где ставится модификатор доступа:
     * - перед классом;
     * - перед методом (там где создаете метод);
     * -
     * -
     * 2 - static (пишем или не пишем)
     * 3 - указываем возвращаемый тип (или слово void если оно отсутствует)
     * 4 - название метода (максимально корректно)
     * 5 - входящие параметры (то без чего не возможно выполнить данный метод)
     * всегда записываются в (), через запятую, указывая тип и название переменной
     * 6 - тело выполнения данной команды. Данного метода
     */

    // Задача - создать метод, который посчитает площадь треугольника по трем сторонам и выведет ее на консоль
    public static void squareTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    //метод возвращает переметр треугольника по трем сторонам
    public static int perimetrTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static int squareBox(int a) {
        return a * a;
    }

    public static int perimetrBox(int a) {
        return a * 4;
    }

    public static double squareOval(int a, int b) {
        return Math.PI * a * b;
    }

    public static double perimetrOval(int a, int b) {
        return 2*Math.PI*Math.sqrt((a*a+b*b)/2);
    }

    public static double squareTrapezoid(int a, int b, int h) {
        return h*(a+b)/2;
    }

    public static double perimetrTrapezoid(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
