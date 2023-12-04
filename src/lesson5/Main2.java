package lesson5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /** ��������� ����� ������� ������������ ������ � ������� ������
         * (�����������, �������, ����, ����, ��������)
         * ����� �� ������������ ������ ������ ������ ������ � ������ (�������, ������ � ��)
         * � �� ��������� ��������� ������ �������� �� ������� ������� � ��������
         */
        System.out.println("�������� ������");
        System.out.println("1 - �����������");
        System.out.println("2 - �������");
        System.out.println("3 - ����");
        System.out.println("4 - ����");
        System.out.println("5 - ��������");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.next();

        if (inputFigura.equals("1") || inputFigura.equalsIgnoreCase("�����������")) {//���� ������ �����������

            System.out.println("������� ������ �����������");

            System.out.println("������� ������� �:");
            int a = scanner.nextInt();

            System.out.println("������� ������� b:");
            int b = scanner.nextInt();

            System.out.println("������� ������� c:");
            int c = scanner.nextInt();

            System.out.print("������� ������������: ");
            MathUtils.squareTriangle(a, b, c);
            System.out.println("�������� ������������: " + MathUtils.perimetrTriangle(a, b, c));

        } else if (inputFigura.equals("2") || inputFigura.equalsIgnoreCase("�������")) {

            System.out.println("������� ������ �������");

            System.out.println("������� ������� �:");
            int a = scanner.nextInt();

            System.out.println("������� ��������: " + MathUtils.squareBox(a));
            System.out.println("�������� ���������: " + MathUtils.perimetrBox(a));

        } else if (inputFigura.equals("3") || inputFigura.equalsIgnoreCase("����")) {

            System.out.println("������� ������ ����");

            System.out.println("������� ������� �:");
            int a = scanner.nextInt();

            System.out.println("������� ������ b:");
            int b = scanner.nextInt();

            System.out.println("������� �����: " + MathUtils.squareOval(a, b));
            System.out.println("�������� �����: " + MathUtils.perimetrOval(a, b));

        } else if (inputFigura.equals("4") || inputFigura.equalsIgnoreCase("����")) {

            System.out.println("������� ������ ����");

            System.out.println("������� ������ �:");
            int a = scanner.nextInt();

            int b = a;      //������������� �������� ��� ����� ��������� b � a;

            System.out.println("������� �����: " + MathUtils.squareOval(a, b));
            System.out.println("�������� �����: " + MathUtils.perimetrOval(a, b));

        } else if (inputFigura.equals("5") || inputFigura.equalsIgnoreCase("��������")) {

            System.out.println("������� ������ ��������");

            System.out.println("������� ��������� �:");
            int a = scanner.nextInt();

            System.out.println("������� ��������� b:");
            int b = scanner.nextInt();

            System.out.println("������� ������� ������� �:");
            int c = scanner.nextInt();

            System.out.println("������� ������� ������� d:");
            int d = scanner.nextInt();

            System.out.println("������� ������ h:");
            int h = scanner.nextInt();

            System.out.println("������� ��������: " + MathUtils.squareTrapezoid(a, b, h));
            System.out.println("�������� ��������: " + MathUtils.perimetrTrapezoid(a, b , c , d));

        } else System.out.println("������������� ���������. ������� �������� ������"); // ����� ����������� �������� �������� �������� �������. ���� ��� �� �������� ������� ������
    }
}
