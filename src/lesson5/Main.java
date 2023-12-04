package lesson5;

public class Main {
    public static void main(String[] args) {
        int nums[][] = new int[8][7];

        int sratrtJ = 3;
        int count = 2;
        for (int i = 0; i < nums.length; i++) {
            for (int j = sratrtJ; j < nums[i].length; j++) {
                nums[i][j] = 1;
            }
            if (i >= (nums.length - 1) / 2) {//доходим до середины массиива
                sratrtJ--;
                count += 2;
            } else {//вторая половина
                sratrtJ++;
                count -= 2;
            }
        }
        System.out.println();
    }
}
