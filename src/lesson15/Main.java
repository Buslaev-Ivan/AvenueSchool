package lesson15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        LinkedList<Integer> b = new LinkedList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        LinkedList<Double> c = new LinkedList<>();
        c.add(1.2);
        c.add(2.3);
        c.add(0.2);
        c.add(5.6);
        c.add(3.4);

        CollectionUtils collutils = new CollectionUtilsImpl(); //разобратся
        ListUtilslmpl listutils = new ListUtilslmpl();
        SetUtilslmpl setUtilslmpl = new SetUtilslmpl();
        Collection<Integer> unionResult = collutils.union(a, b);
        Collection<Integer> nums1 = new ArrayList<>();
        nums1.add(2);
        nums1.add(3);
        nums1.add(4);
        nums1.add(1);
        nums1.add(0);
        Set<String> nums2 = new TreeSet<>();
        nums2.add("5");
        nums2.add("8");
        nums2.add("6");
        nums2.add("9");
        nums2.add("7");

        System.out.println("Коллекция а: " + a);
        System.out.println("Коллекция б: " + b);
        System.out.println("Объединение двух коллекций а, б с дубликатами: " + unionResult);
        System.out.println("Пересечение двух коллекций а, б с дубликатами: " + collutils.intersection(a, b));
        System.out.println("Объединение двух коллекций а,б без дубликатов: " + collutils.unionWithoutDuplicate(a, b));
        System.out.println("Пересечение двух коллекций а, б без дубликатов: " + collutils.intersectionWithoutDuplicate(a, b));
        System.out.println("Разность двух коллекций а, б: " + collutils.difference(a, b));
        System.out.println("Коллекция c: " + c);
        System.out.println("Отсортированная по убыванию коллекция c: " + listutils.sortedList(c));
        System.out.println("Преминение asList(111, 222, 333): " + listutils.asList("111", "222", "333"));
        System.out.println("Преминение customOrderSet(11, 12, 33, 5, 66): " + setUtilslmpl.customOrderSet(11, 12, 33, 5, 66));
        System.out.println("Коллекция nums1: " + nums1);
        System.out.println("Коллекция nums2: " + nums2);
        System.out.println("Коллекция nums1 + nums2: " + setUtilslmpl.orderedSet(nums1, nums2));
    }
}
