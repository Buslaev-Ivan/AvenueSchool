package lesson4;

public class HomeWork {
    public static void main(String[] args) {

        int nums[][] = new int[8][8];
        // вывод ниже диагонали, включительно
        System.out.println("1. вывод ниже диагонали, включительно");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if ((j) <= (i)) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // вывод выше диагонали, исключая диагональ
        System.out.println("2. вывод выше диагонали, исключая диагональ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if ((j) > (i)) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // вывод ниже диагонали, включительно
        System.out.println("3. вывод ниже диагонали, включительно");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j + i >= (nums.length - 1)) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // вывод выше диагонали, исключая диагональ
        System.out.println("4. вывод выше диагонали, исключая диагональ");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j + i >= (nums.length - 1)) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(nums[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // вывод ромба
        System.out.println("5. вывод ромба");
        int k = (nums.length) / 2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j + i >= (k-1) && i < k && j < k) {
                    System.out.print(nums[i][j] + " ");
                } else if ((j-k) <= (i) && i < k && j >= k) {
                    System.out.print(nums[i][j] + " ");
                } else if ((i-k) <= (j) && i >= k && j < k) {
                    System.out.print(nums[i][j] + " ");
                } else if (((j-k) + (i-k))<= (k-1) && i >= k && j >= k) {
                    System.out.print(nums[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
