package lesson3;

public class Main2 {
    public static void main(String[] args) {
        // ���� ������ �����, ����� ���������� �� ������ ������ ������ ����� � �������� �������
        int[] numbers = {3, 5, 7, 8, 5, 3, 2, 4, 5, 6, 45, 73, 88, 34, 23, 534, 654, 234};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] % 2 == 0) { //�������� �� ��������
                System.out.println(numbers[i]);
            }
        }
    }
}
