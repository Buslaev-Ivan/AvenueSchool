package lesson6;

import java.util.Scanner;

public class ScannerUtils {

    //������� � ���������� ������ ��� ������ ������ ������
    public static void searchIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�� ������ �������� ������������ �����");
        int index = scanner.nextInt();
    }

    public static void searchByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("� ����� ������ ������ �������");
        String country = scanner.next();
        System.out.println("--------���������-------");
        ToursUtils.printToursByCountry(tours, country);
        System.out.println("------------------------");
    }

    //����� ����� �� �����������������
    public static void searchByDay(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� ����������������� � ����?");
        String day = scanner.nextLine(); // �������� ��� ������
        System.out.println("--------���������-------");
        ToursUtils.printToursByDay(tours, day);
        System.out.println("------------------------");
    }

    //����� ����� �� �������, �������� ���� ����� � �� �������� ����  + - 200000 �� ����� �������
    public static void searchByBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� ������?");
        int budget = scanner.nextInt();
        System.out.println("--------���������-------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("------------------------");
    }

    //����� ����� �� ���-�� ����� � ���� ����������
    public static void searchByStarsAndTransport(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("����� � ����� ���-��� ����� ��� ����������?");
        String stars = scanner.nextLine();//�������� ��� ������
        System.out.println("����� ��� ���������� ��� ����������?");
        String transport = scanner.nextLine();//�������� ��� ������
        System.out.println("--------���������-------");
        ToursUtils.printToursStarsAndTransport(tours, stars, transport);
        System.out.println("------------------------");
    }

    //����� ����� �� ������ � �������
    public static void searchByCountryAndBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("� ����� ������ ������ �������");
        String country = scanner.next();
        System.out.println("����� ������?");
        int budget = scanner.nextInt();
        System.out.println("--------���������-------");
        ToursUtils.printToursByCountryAndBudget(tours, country, budget);
        System.out.println("------------------------");
    }
}
