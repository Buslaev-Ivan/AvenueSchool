package lesson4;

public class HomeWork123 {
    public static void main(String[] args) {
        int[] massive = {3, 5, 8, 3, 55, 4, 1, 65, 36, 98};
        for (int i = 0; i < massive.length; i = i + 2) {
            System.out.println(massive[i]);
        }

        for (int i = massive.length - 1; i >= 0; i--) {
            System.out.println(massive[i]);
        }

        for (int i = 0; i < massive.length; i++) {
            //нужно преобразовать число в ряд символов
            //конкатенация строк = склеивание текста
            String currentNumFromMassive = massive[i]+"";
            if (currentNumFromMassive.contains("5")) {
                System.out.println(currentNumFromMassive);
            }
        }
    }
}
