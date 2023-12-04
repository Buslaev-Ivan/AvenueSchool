package lesson3;
//����� ����� ����������� ���� ������ ��� ������ � ���������� � �������
//���������� ��� � ����

import java.util.Scanner; //��� ������ ��� �� ����� �� ���������, ��� �� ��� � ����� ��������

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // ��������� ������ Scanner � ������ input ���� Scanner c ������������� System.in
        //��� ��� ���������� ����. �� ������������ � ����� ��� ����� ��� � ���� ���� ��� - ���� � ����, ���� � ����...
        System.out.println("������� ������ �������: ");
        int size = input.nextInt(); // ������ � ���������� ������ ������� � ���������� � size.
        //��� � ��� ������ � ���������� size ������������� ������ �� ������ input ��� �������� ������������ int �������� � ����������
        int array[] = new int[size]; // ������ ������ int �������� � size
        System.out.println("������ �������� �������:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // ��������� ������ ����������, ��������� � ����������
        }
        System.out.print("�������� �������:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // ������� �� �����, ���������� ������
        }
        System.out.println();

        //������� �� ������� ����� ������
        System.out.print("�������� ������� ����� ������:");
        for (int i = 0; i < size; i = i + 2) {
            System.out.print(" " + array[i]); // ������� �� �����, ���������� ������
        }
        System.out.println();

        //�������� ������� � �������� �������
        System.out.print("�������� ������� � �������� �������:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(" " + array[i]); // ������� �� �����, ���������� ������
        }
        System.out.println();

        //�������� �������� ������� ���������
        int symbol = 999;
        while (10 - symbol < 0) { //�������� �� ������ �������. �� ����� 1 ������ ������
            System.out.println("������� ������/����� ��� ��������: ");
            symbol = input.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.println("C�����/����� ��� ��������:" + symbol);
        String textsymbol = Integer.toString(symbol); //��������� ����� � ���������


        //��� ��� ������� ����� �������� ������������ ������/�������. �������� ����� �������
        //������ �� �������������� ���. ������ ����� ������ � ������ ��������� � ����.
        System.out.print("�������� �������:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i]); // ������� �� �����, ���������� ������
        }
        System.out.println();

        System.out.print("�������� ������� c ������ ������ ����������: ");
        for (int i = 0; i < size; i++) {
            String textchislo = Integer.toString(array[i]);
            for (int j = 0; j < textchislo.length(); j++) {
                if (textchislo.charAt(j) == textsymbol.charAt(0)) {
                    System.out.print(textchislo+" "); // ������� �� �����, ����� ��������������� �������
                    break;
                }
            }
        }
        System.out.println();

    }
}
