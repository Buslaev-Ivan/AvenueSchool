package lesson14;

import SinglKoding.Array;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arraList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arraList.add("qwrety +i");
        }

        long time2 = System.currentTimeMillis();
        System.out.println("ArrayList add  ----  " + (time2 - time1));

        for (int i = 0; i < 100000; i++) {
            linkedList.add("qwrety +i");
        }

        long time3 = System.currentTimeMillis();
        System.out.println("LinkedList add  ----  " + (time3 - time2));
        for (int i = 0; i < 100000; i++) {
            arraList.get(i);
        }

        long time4 = System.currentTimeMillis();
        System.out.println("ArrayList get  ----  " + (time4 - time3));
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }

        long time5 = System.currentTimeMillis();


        System.out.println("LinkedList get  ----  " + (time5 - time4));
    }
}
