package lesson2;

public class Main2 {
    public static void main(String[] args) {
        //���� 3 ������� ������������, ����� �������: ��������������, ��������������, ��������������

        //����������� ����������� if else

        int a = 7;
        int b = 9;
        int c = 7;

        if (a == b && b == c && c == a){
            System.out.println("��� �������������� �����������");
        }

        if (a != b && b != c && c != a) {
            System.out.println("��� �������������� ������������");
        }

        if ((a == b && b != c && c != a) || (a != b && b != c && c == a) || (a !=b && b == c && c != a)) {
            System.out.println("��� �������������� �����������");
        }
    }

}
