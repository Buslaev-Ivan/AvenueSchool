package lesson3;
//давно хотел попробовать ввод данных дл€ масива с клавиатуры в консоли
//подсмотрел код в сети

import java.util.Scanner; //тут видимо что то тащим из библиотек, что бы оно в целом работало

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // ќбъ€вл€ем объект Scanner с именем input типа Scanner c конструктором System.in
        //вот тут сложновато кнчн. »з прочитанного в Ўилде как будто это и есть суть ќќѕ - игла в €йце, €йцо в утке...
        System.out.println("¬ведите длинну массива: ");
        int size = input.nextInt(); // „итаем с клавиатуры размер массива и записываем в size.
        //тут у нас видимо к переменной size присваеваетс€ ссылка на обьект input дл€ которого возвращаетс€ int введеный с клавиатуры
        int array[] = new int[size]; // —оздаЄм массив int размером в size
        System.out.println("¬вести элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // «аполн€ем массив элементами, введЄнными с клавиатуры
        }
        System.out.print("Ёлементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // ¬ыводим на экран, полученный массив
        }
        System.out.println();

        //вывести на консоль через €чейку
        System.out.print("Ёлементы массива через €чейку:");
        for (int i = 0; i < size; i = i + 2) {
            System.out.print(" " + array[i]); // ¬ыводим на экран, полученный массив
        }
        System.out.println();

        //элементы массива в обратном пор€дке
        System.out.print("Ёлементы массива в обратном пор€дке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(" " + array[i]); // ¬ыводим на экран, полученный массив
        }
        System.out.println();

        //задаемс€ символом который провер€ем
        int symbol = 999;
        while (10 - symbol < 0) { //проверка на длинну символа. не более 1 знакка длинна
            System.out.println("¬ведите символ/цифру дл€ проверки: ");
            symbol = input.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.println("Cимвол/цифра дл€ проверки:" + symbol);
        String textsymbol = Integer.toString(symbol); //переводим число в строкувую


        //так как консоль могла затретс€ многократным вводом/выводом. повторим вывод массива
        //хорошо бы воспользоватс€ ќќѕ. —оздав метод вывода и просто обращатс€ к нему.
        System.out.print("Ёлементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // ¬ыводим на экран, полученный массив
        }
        System.out.println();

        System.out.print("Ёлементы массива c учетом поиска совпадени€: ");
        for (int i = 0; i < size; i++) {
            String textchislo = Integer.toString(array[i]);
            for (int j = 0; j < textchislo.length(); j++) {
                if (textchislo.charAt(j) == textsymbol.charAt(0)) {
                    System.out.print(textchislo+" "); // ¬ыводим на экран, число удовлетвор€ющее условию
                    break;
                }
            }
        }
        System.out.println();

    }
}
