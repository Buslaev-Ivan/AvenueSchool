package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

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

        CollectionUtils utils = new CollectionUtilsImpl(); //разобратся
        Collection<Integer> unionResult = utils.union(a,b); //разобратся
        System.out.println(unionResult);

        Collection<Integer> intersectionResult = utils.intersection(a,b); //разобратся
        System.out.println(intersectionResult);

    }
}
