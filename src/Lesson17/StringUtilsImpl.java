package Lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtilsImpl implements StringUtils {
    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num1 = Integer.parseInt(number1); // метод может выбросить NumberFormatException. нам это подходит
        double num2 = Integer.parseInt(number2);

        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        List<String> arrayText = new ArrayList<String>(Arrays.asList(text.split("[, ]")));
        List<Integer> arrayIndex = new ArrayList<>();
//        System.out.println("размер " + arrayText.size());
//        System.out.println(arrayText);
        for (int i = 0; i < arrayText.size(); i++) {
            if (arrayText.get(i).equalsIgnoreCase(word)) {
                arrayIndex.add(i);
            }
        }
        if (arrayIndex.size() == 0) {
            throw new NullPointerException("Совпадений нет");
        }
        int[] index = new int[arrayIndex.size()];
        for (int i = 0; i < index.length; i++) {
            index[i] = arrayIndex.get(i);
        }
        return index;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        List<String> firstText = new ArrayList<>(Arrays.asList(text.split("[, ]")));
        List<String> result = new ArrayList<>();
        for (String s : firstText) {
            if (isNumeric(s)) {
                result.add(s);
            }
        }
//        System.out.println(firstText);
//        System.out.println(nextText);
        if (result.size() == 0) {
            throw new CustomException("Числа не обнаружены");
        }
        double[] numbers = new double[result.size()];
        for (int i = 0; i < result.size(); i++) {
            numbers[i] = Double.parseDouble(result.get(i));
        }
        return numbers;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
