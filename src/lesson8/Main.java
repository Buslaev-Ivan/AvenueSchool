package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("�������� ������:");
        System.out.println("1 - �������");
        System.out.println("2 - ��������");
        System.out.println("3 - ������������");
        System.out.println("4 - ������");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();//����� "1" ��� ����� "�������"

        SaperField saperField = new SaperField(level);// �������� � ������������ ��������� ������ �� ��������� ������

        System.out.println();
        saperField.addRandomMins();
        saperField.countAndAddNums();
        System.out.println();
    }
}
