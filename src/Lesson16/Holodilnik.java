package Lesson16;

import java.util.*;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String nameOfProduct, int value) {
        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            products.put(nameOfProduct, value + currentValue);
        } else {
            products.put(nameOfProduct, value);
        }
    }

    public void giveProduct(String nameOfProduct, int giveCount) {
        if (products.containsKey(nameOfProduct)) {
            if (products.get(nameOfProduct) >= giveCount) {
                System.out.println("Продукта: -" + nameOfProduct + "- в наличии: " + products.get(nameOfProduct));
                System.out.println("Вы забрали: " + giveCount);
                products.put(nameOfProduct, (products.get(nameOfProduct) - giveCount));
                System.out.println("Осталось: " + products.get(nameOfProduct));
            }
            if (products.get(nameOfProduct) < giveCount) {
                System.out.println("Продукта: -" + nameOfProduct + "- в наличии: " + products.get(nameOfProduct));
                System.out.println("Вы хотите забрать: " + giveCount);
                System.out.println("не хватает: " + (giveCount - products.get(nameOfProduct)));
            }
        } else {
            System.out.println("Продукта -" + nameOfProduct + "- нет в наличии");
        }
        System.out.println();
    }

    public void printShortage() {
        String shortageProductName = "";
        int shortageCount = 2147483647; //костыль. взял максимальный размер int
        for (String productName : products.keySet()) {
            if ((products.get(productName)) - shortageCount < 0) {
                shortageProductName = productName;
                shortageCount = products.get(productName);
            }
        }
        System.out.println("Продукт -" + shortageProductName + "- в дефиците");
        System.out.println("В наличии осталось: " + products.get(shortageProductName));
        System.out.println();
    }

    public void printAllCount() {
        int allCount = 0;
        for (String productName : products.keySet()) {
            allCount += products.get(productName);
        }
        System.out.println("Вес всех продуктов: " + allCount);
        System.out.println();
    }

    public void printSortProducts() {
        SortedMap<String, Integer> sortedProducts = new TreeMap<>();
        sortedProducts.putAll(products);
        System.out.println(sortedProducts); // для наглядности отработки
        for (String productName : sortedProducts.keySet()) {
            System.out.println(productName + "-" + sortedProducts.get(productName));
        }
        System.out.println();
    }

    public void printSortValues(){
        ValueComparator bvc = new ValueComparator(products);
        TreeMap<String, Integer> sortedValueProducts = new TreeMap<String, Integer>(bvc);
        sortedValueProducts.putAll(products);
        System.out.println(sortedValueProducts);// для наглядности отработки
       for (String productName : sortedValueProducts.keySet()) {            //выводит null
           System.out.println(productName + "-" + sortedValueProducts.get(productName));
        }
        System.out.println();
    }

    public void printAllProducts() {
        for (Map.Entry<String, Integer> pr : products.entrySet()) {
            System.out.println(pr.getKey() + "-" + pr.getValue());
        }
        System.out.println();
    }

    public void printAllProducts2() {
        for (String productName : products.keySet()) {
            System.out.println(productName + "-" + products.get(productName));
        }
        System.out.println();
    }


    // 1 - взять продукт с холодильника (с проверкой на налиие и кол-во)
    // 2 - вывести на консоль какой продукт закончится самым первым
    // 3 - вывести вес суммарный всех продуктов (один инт)
    // 4 - вывести продукты и вес в отсортированном формате по названию.
    // 5 - вывести продукты и вес в отсортированном формате по весу.


}


