package Lesson17;

public class Main {
    public static void main(String[] args) {
        StringUtilsImpl testUtils = new StringUtilsImpl();

//        для проверки нужно разакоментировать нужные строки

//        System.out.println("метод div, входные 10,5 - результат:" + testUtils.div("10", "5"));
//        System.out.println("метод div, входные 10,0 - результат:" + testUtils.div("10", "0"));
//        System.out.println("метод div, входные 10,qwerty - результат:" + testUtils.div("10", "йцкуен"));
        System.out.println();

        System.out.println("метод findWord, входные -тект- Солнце светит высоко, Солнце светит далеко -слово- Солнце ");
        int[] index = testUtils.findWord("Солнце светит высоко, Солнце светит далеко ", "Солнце");
        for (int i = 0; i < index.length; i++) {
            System.out.println(index[i]);
        }
        System.out.println();


//        System.out.println("метод findWord, входные -тект- Солнце светит высоко, Солнце светит далеко -слово- Луна ");
//        int[] index = testUtils.findWord("Солнце светит высоко, Солнце светит далеко ", "Луна");
//        for (int i = 0; i < index.length; i++) {
//            System.out.println(index[i]);
//        }
//        System.out.println();

        System.out.println("метод findNumbers, входные: 2034.56 самолет 101, 505 свет 123.123 ");

        try {  //тут не очень понятно зачем настоял на трай катч
            testUtils.findNumbers("2034.56 самолет 101, 505 свет 123.123");
//            testUtils.findNumbers("самолет свет");
            double[] numbers = testUtils.findNumbers("2034.56 самолет 101, 505 свет 123.123");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
