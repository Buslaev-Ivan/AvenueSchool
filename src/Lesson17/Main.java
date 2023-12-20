package Lesson17;

public class Main {
    public static void main(String[] args) {
        StringUtilsImpl testUtils = new StringUtilsImpl();

//        для проверки нужно разакоментировать нужные строки

        System.out.println("метод div, входные 10,5 - результат:" + testUtils.div("10", "3"));
//        System.out.println("метод div, входные 10,0 - результат:" + testUtils.div("10", "0"));
//        System.out.println("метод div, входные 10,qwerty - результат:" + testUtils.div("10", "йцкуен"));
        System.out.println();

        System.out.println("метод findWord, входные -тект- Солнце светит высоко, Солнце светит далеко -слово- Солнце ");
        int[] index = testUtils.findWord("Солнце светит высоко, Солнце светит далеко ", "Солнце");
        for (int j : index) {
            System.out.println(j);
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
//            double[] numbers = testUtils.findNumbers("2034.56 самолет 101, 505 свет 123.123");
            double[] numbers = testUtils.findNumbers("самолет свет");
            for (double number : numbers) {
                System.out.println(number);
            }
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
