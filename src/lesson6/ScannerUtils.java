package lesson6;

import java.util.Scanner;

public class ScannerUtils {

    //считаем с клавиатуры индекс дл€ выбора метода поиска
    public static void searchIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ѕо какому варианту осуществл€ем поиск");
        int index = scanner.nextInt();
    }

    public static void searchByCountry(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ какую страну хотите поехать");
        String country = scanner.next();
        System.out.println("--------–≈«”Ћ№“ј“-------");
        ToursUtils.printToursByCountry(tours, country);
        System.out.println("------------------------");
    }

    //поиск туров по продолжительности
    public static void searchByDay(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" акой продолжительность в дн€х?");
        String day = scanner.nextLine(); // забираем всю строку
        System.out.println("--------–≈«”Ћ№“ј“-------");
        ToursUtils.printToursByDay(tours, day);
        System.out.println("------------------------");
    }

    //поиск туров по бюджету, задаетс€ одно число и мы печатаем туры  + - 200000 от этого бюджета
    public static void searchByBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" акой бюджет?");
        int budget = scanner.nextInt();
        System.out.println("--------–≈«”Ћ№“ј“-------");
        ToursUtils.printToursByBudget(tours, budget);
        System.out.println("------------------------");
    }

    //поиск туров по кол-ву звезд и типу транспорта
    public static void searchByStarsAndTransport(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("отель с каким кол-вом звезд ¬ас интересует?");
        String stars = scanner.nextLine();//забираем всю строку
        System.out.println("какой вид транспорта ¬ас интересует?");
        String transport = scanner.nextLine();//забираем всю строку
        System.out.println("--------–≈«”Ћ№“ј“-------");
        ToursUtils.printToursStarsAndTransport(tours, stars, transport);
        System.out.println("------------------------");
    }

    //поиск туров по стране и бюджету
    public static void searchByCountryAndBudget(String[][] tours) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ какую страну хотите поехать");
        String country = scanner.next();
        System.out.println(" акой бюджет?");
        int budget = scanner.nextInt();
        System.out.println("--------–≈«”Ћ№“ј“-------");
        ToursUtils.printToursByCountryAndBudget(tours, country, budget);
        System.out.println("------------------------");
    }
}
