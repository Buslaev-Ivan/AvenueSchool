package lesson2;

// ��� ��� ������� �������� ������� ��� � ����� �����

public class HomeWork {
    public static void main(String[] args) {

        //������ 1. ������ ����� �� -100 �� -50
        System.out.println();
        System.out.print("\033[4m������ �1 ������ ����� �� -100 �� -50:\033[0m");
        System.out.println();
        for (int i = -100; i <= -50; i = i + 2) {
            if (i < -50) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

        //������ 2. ����� �� 10 �� 30 � �������� �������
        System.out.println();
        System.out.print("\033[4m������ �2 ����� �� 10 �� 30 � �������� �������:\033[0m");
        System.out.println();
        for (int i = 30; i > 9; i = i - 1) {
            if (i > 10) System.out.print(i + ", ");
            else {
                System.out.print(i);
            }
        }
        System.out.println();

        //������ 3. ���-�� ������ ����� �� 30 �� 61
        System.out.println();
        System.out.print("\033[4m������ �3 ���-�� ������ ����� �� 30 �� 61:\033[0m");
        System.out.println();
        int x = 0; //���������� ��� ������� �����
        for (int i = 30; i < 61; i = i + 2) {
            x++;
        }
        System.out.println(x);

        //������ 4. ��������� ���-�� ���, ��� �� ������� 200�.�. ���� ����������� 9500
        System.out.println();
        System.out.print("\033[4m������ �4 ���-�� ���, ��� �� ������� 200�.�. ���� ����������� 9500:\033[0m");
        System.out.println();
        x = 0; //���������� ��� ������� �����, ��������
        for (int i = 0 ; i < 200000; i+=9500){
            x++;
        }
        System.out.println(x/12+1);

        //������ 5. ������� �� ������� ��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������
        System.out.println();
        System.out.print("\033[4m������ �5 ������� �� ������� ��� ����� �� 20 �� 60, ��������� �������� �� 30 �� 40 ������������\033[0m");
        System.out.println();
        for (int i = 20 ; i <= 60; i++){
            if ((i <30) || (i > 40)){
                System.out.print(i + ", ");
            }
        }
    }
}
