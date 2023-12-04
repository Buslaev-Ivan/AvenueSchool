package lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};

        char[] abcdqwer = new char[abcd.length + qwer.length];

        for (int i = 0; i < abcdqwer.length; i++) {
            if (i < abcd.length) {//сохранение из 1го массива
                abcdqwer[i] = abcd[i];
            } else {
                abcdqwer[i] = qwer[i - abcd.length];//сохранение из 2го массива
            }
            System.out.println(abcdqwer[i]);
        }
    }
}
