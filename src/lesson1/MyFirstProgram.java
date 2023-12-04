package lesson1; // packege - указание в какой папке находится текущий файл

// public - общедоступный (открытый)
// class - кусочек java- кода, с одной смысловой нагрузкой

public class MyFirstProgram {

    //psvm - команда, точка старта, начала программы. Код внтури скобок будет отработан

    /**
     * синтаксис многострочных коментариев
     */
    public static void main(String[] args) {
        // cntrl + alt + l форматирование кода
        int a = 3;
        int b = 4;
        int c = 5;

        int peremetrOfTriangle = a + b +c;

        // sout - терманал вывода на консоль
        System.out.println(peremetrOfTriangle);

        char v = 12347;
        System.out.println(v);
    }
}
