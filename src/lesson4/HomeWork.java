package lesson4;

public class HomeWork {
    public static void main(String[] args) {

        int nums[][] = new int[8][8];
        // ����� ���� ���������, ������������
        System.out.println("1. ����� ���� ���������, ������������");
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

        // ����� ���� ���������, �������� ���������
        System.out.println("2. ����� ���� ���������, �������� ���������");
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

        // ����� ���� ���������, ������������
        System.out.println("3. ����� ���� ���������, ������������");
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

        // ����� ���� ���������, �������� ���������
        System.out.println("4. ����� ���� ���������, �������� ���������");
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

        // ����� �����
        System.out.println("5. ����� �����");
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
