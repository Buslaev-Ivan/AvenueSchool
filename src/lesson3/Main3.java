package lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};

        char[] abcdqwer = new char[abcd.length + qwer.length];

        for (int i = 0; i < abcdqwer.length; i++) {
            if (i < abcd.length) {//���������� �� 1�� �������
                abcdqwer[i] = abcd[i];
            } else {
                abcdqwer[i] = qwer[i - abcd.length];//���������� �� 2�� �������
            }
            System.out.println(abcdqwer[i]);
        }
    }
}
