package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выбирете уровен:");
        System.out.println("1 - Новичек");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();//текст "1" или слово "Новичек"

        SaperField saperField = new SaperField(level);// ожидание в конструкторе создастся массив по заданному уровню

        System.out.println();
        saperField.addRandomMins();
        saperField.countAndAddNums();
        System.out.println();
    }
}
