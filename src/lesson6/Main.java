package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] tours = new String[100][8];
        ToursUtils.addTour("������", "���", "�������",
                "6 ����", "140000 ���", "3 ������", "��������", tours);
        ToursUtils.addTour("������", "���", "�������",
                "6 ����", "100000 ���", "2 ������", "��������", tours);
        ToursUtils.addTour("������", "���", "�������",
                "4 ����", "150000 ���", "4 ������", "��������+ ����", tours);
        ToursUtils.addTour("������", "���������", "�������",
                "5 ����", "130000 ���", "3 ������", "��������+ ����", tours);
        ToursUtils.addTour("������", "���������", "�������",
                "4 ���", "40000 ���", "2 ������", "��������+ ����", tours);
        ToursUtils.addTour("�������", "�����", "�������",
                "8 ����", "240000 ���", "5 �����", "��������", tours);
        ToursUtils.addTour("������", "���", "�������",
                "6 ����", "180000 ���", "3 ������", "��������", tours);
        ToursUtils.addTour("������", "���", "�������",
                "3 ���", "80000 ���", "4 ������", "�������� + ����", tours);
        ToursUtils.addTour("��������", "������", "�������",
                "6 ����", "220000 ���", "4 ������", "��������", tours);
        ToursUtils.addTour("������", "���", "�������",
                "9 ����", "340000 ���", "5 �����", "��������", tours);
        ToursUtils.addTour("��������", "������", "�������",
                "8 ����", "380000 ���", "5 �����", "��� ��������", tours);

        System.out.println("���������� ��������� �������� ������ ����:");
        System.out.println("1 - �� ������");
        System.out.println("2 - �� �������");
        System.out.println("3 - �� �����������������");
        System.out.println("4 - �� ������� � ����������");
        System.out.println("5 - �� ������ � �������");


        //������� � ���������� ������ ��� ������ ������ ������

        Scanner scanner = new Scanner(System.in);
        System.out.println("�� ������ �������� ������������ �����");
        int index = scanner.nextInt();

        if (index == 1) ScannerUtils.searchByCountry(tours);
        else if (index == 2) ScannerUtils.searchByBudget(tours);
        else if (index == 3) ScannerUtils.searchByDay(tours);
        else if (index == 4) ScannerUtils.searchByStarsAndTransport(tours);
        else if (index == 5) ScannerUtils.searchByCountryAndBudget(tours);
        else System.out.println("������������� ��������� � ��������� ������");

        /** 1 - ������� �� ������� ����, ������� �� ������� �� ... ���� +++
         * 2 - ������� �� ������� ���� �� ... ����� � ... ����������� +++
         * 3 - ������� ���� �� ������� ... ������ � �� ... ������ +++
         */
    }
}
