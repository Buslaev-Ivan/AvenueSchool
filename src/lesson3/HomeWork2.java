package lesson3;

public class HomeWork2 {
    public static void main(String[] args) {
        String text = "Я буду учится лучше";
        char[] symbols = text.toCharArray();

        //вывод по слову в отдельной строке
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                System.out.println();
            } else System.out.print(symbols[i]);
        }
        System.out.println();

        //вывод по слову обратном порядке
        int kollProbell = 0;
        //посчитаем колличество пробелов, определим кол-во слов, для создания матрицы;
        //по хорошему нужна проверка на излишние пробелы...
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                kollProbell++;
            }
        }
        System.out.println("Кол-во слов:" + (kollProbell + 1));
        // создадим двумерный массив i-кол-во слов, j кол-во символов в cтроке.
        char massivtext [][]=new char[(kollProbell + 1)][symbols.length];
        for (int i = 0; i < (kollProbell + 1); i++) {
            for (int j = 0; j < symbols.length; j++) {
                massivtext[i][j] = symbols[j];
            }
        }
        //выведем результат
        for (int i = 0; i < (kollProbell + 1); i++) {
            for (int j = 0; j < symbols.length; j++) {
                System.out.print(massivtext[i][j]+"_");
            }
            System.out.println();
        }

    }
}