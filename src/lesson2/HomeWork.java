package lesson2;

// так как задачки короткие оформим все в одном файле

public class HomeWork {
    public static void main(String[] args) {

        //задача 1. Четные числа от -100 до -50
        System.out.println();
        System.out.print("\033[4mЗадача №1 Четные числа от -100 до -50:\033[0m");
        System.out.println();
        for (int i = -100; i <= -50; i = i + 2) {
            if (i < -50) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

        //Задача 2. Числа от 10 до 30 в обратном порядке
        System.out.println();
        System.out.print("\033[4mЗадача №2 Числа от 10 до 30 в обратном порядке:\033[0m");
        System.out.println();
        for (int i = 30; i > 9; i = i - 1) {
            if (i > 10) System.out.print(i + ", ");
            else {
                System.out.print(i);
            }
        }
        System.out.println();

        //Задача 3. Кол-во четных чисел от 30 до 61
        System.out.println();
        System.out.print("\033[4mЗадача №3 Кол-во четных чисел от 30 до 61:\033[0m");
        System.out.println();
        int x = 0; //переменная под счетчик чисел
        for (int i = 30; i < 61; i = i + 2) {
            x++;
        }
        System.out.println(x);

        //Задача 4. Посчитать кол-во лет, что бы собрать 200т.р. если откладывать 9500
        System.out.println();
        System.out.print("\033[4mЗадача №4 Кол-во лет, что бы собрать 200т.р. если откладывать 9500:\033[0m");
        System.out.println();
        x = 0; //переменная под счетчик чисел, обнулили
        for (int i = 0 ; i < 200000; i+=9500){
            x++;
        }
        System.out.println(x/12+1);

        //Задача 5. вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно
        System.out.println();
        System.out.print("\033[4mЗадача №5 вывести на консоль все числа от 20 до 60, пропуская диапазон от 30 до 40 включительно\033[0m");
        System.out.println();
        for (int i = 20 ; i <= 60; i++){
            if ((i <30) || (i > 40)){
                System.out.print(i + ", ");
            }
        }
    }
}
