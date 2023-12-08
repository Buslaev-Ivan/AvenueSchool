package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(6);
        nums.add(3);
        nums.add(1);
        nums.add(8);
        System.out.println(nums);
        nums.add(2,2);
        System.out.println(nums);
        nums.set(2,9);
        System.out.println(nums);

    }
}
