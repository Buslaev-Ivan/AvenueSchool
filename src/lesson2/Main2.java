package lesson2;

public class Main2 {
    public static void main(String[] args) {
        //есть 3 чтороны треугольника, нужно вывести: разносторонний, равносторонний, равнобедренный

        //управл€юща€ конструкци€ if else

        int a = 7;
        int b = 9;
        int c = 7;

        if (a == b && b == c && c == a){
            System.out.println("Ёто равносторонний треугольник");
        }

        if (a != b && b != c && c != a) {
            System.out.println("Ёто разносторонний треуголльник");
        }

        if ((a == b && b != c && c != a) || (a != b && b != c && c == a) || (a !=b && b == c && c != a)) {
            System.out.println("Ёто равнобедренный треугольник");
        }
    }

}
