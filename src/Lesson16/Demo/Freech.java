package Lesson16.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Freech {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String nameOfProduct, int value) {

        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            products.put(nameOfProduct, value + currentValue);
        } else { // Если такого продукта нет в холодильнике
            products.put(nameOfProduct, value);
        }
    }

    public void printAllProucts() {
        // проход по Map
        for (Map.Entry<String, Integer> pr : products.entrySet()) {
            System.out.println(pr.getKey() + " - " + pr.getValue());
        }
    }

    public void printAllProucts2() {
        // 2ой способ прохода по Map
        for (String prName : products.keySet()) {
            System.out.println(prName + " - " + products.get(prName));
        }
    }public void takeProduct(String productName) {
        if (products.containsKey(productName)) {
            int quantity = products.get(productName);
            if (quantity > 0) {
                System.out.println("Вы взяли продукт: " + productName);
                products.put(productName, quantity - 1);
            } else {
                System.out.println("Продукт " + productName + " закончился");
            }
        } else {
            System.out.println("Такого продукта нет в холодильнике");
        }
    }

    public void printFirstToFinish() {
        if (products.isEmpty()) {
            System.out.println("Холодильник пуст");
            return;
        }

        Map.Entry<String, Integer> firstEntry = null;
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            if (firstEntry == null || entry.getValue() < firstEntry.getValue()) {
                firstEntry = entry;
            }
        }

        if (firstEntry != null) {
            System.out.println("Первым закончится: " + firstEntry.getKey());
        }
    }

    public void printSortedByName() {
        List<Map.Entry<String, Integer>> sortedByName = new ArrayList<>(products.entrySet());
        sortedByName.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, Integer> entry : sortedByName) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void printSortedByWeight() {
        List<Map.Entry<String, Integer>> sortedByWeight = new ArrayList<>(products.entrySet());
        sortedByWeight.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : sortedByWeight) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

    // 1 взять продукт с холодильника
    // 2 вывести на терминал какой продут закончится самым первым
    // 3 вывести всех продуктов в холодильнике

    // 4 вывести продукты и вес в остсортировонном формате по названию
    // 5 вывести продуты и вес в остсортировонном формате по весу

