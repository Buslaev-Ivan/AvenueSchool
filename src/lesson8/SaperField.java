package lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] fieldWithMains; //��������� ������ ���� ������, ��� ��� �� �� ����� ��������� ���������
    private int countMains = 0;

    public SaperField(String level) {
        if (level.equals("1") || level.equalsIgnoreCase("�������")) {
            fieldWithMains = new int[9 + 2][9 + 2];
            countMains = 10;
        }
        if (level.equals("2") || level.equalsIgnoreCase("��������")) {
            fieldWithMains = new int[16 + 2][16 + 2];
            countMains = 40;
        }
        if (level.equals("3") || level.equalsIgnoreCase("������������")) {
            fieldWithMains = new int[16 + 2][32 + 2];
            countMains = 99;
        }
        if (level.equals("4") || level.equalsIgnoreCase("������")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������� ���-�� �����:");
            int row = scanner.nextInt();

            System.out.println("������� ���-�� �������:");
            int col = scanner.nextInt();

            System.out.println("������� ���-�� ���:");
            countMains = scanner.nextInt();

            fieldWithMains = new int[row + 2][col + 2];
        }
    }

    public void addRandomMins() {
        for (int i = 0; i < countMains; i++) {
            int row = ThreadLocalRandom.current().nextInt(1, fieldWithMains.length - 1);
            int col = ThreadLocalRandom.current().nextInt(1, fieldWithMains[0].length - 1);
            if (fieldWithMains[row][col] != -1) {
                fieldWithMains[row][col] = -1;
            } else {
                i--;
            }
        }
    }

    public void countAndAddNums() {
        for (int i = 0; i < fieldWithMains.length; i++) {
            for (int j = 0; j < fieldWithMains[0].length; j++) {
                //��������� ���� ������� +1 � ����� ���� � �������� ����
                if (fieldWithMains[i][j]==-1){
                    if(fieldWithMains[i-1][j-1]!=-1){
                        fieldWithMains[i-1][j-1]=fieldWithMains[i-1][j-1]+1;
                    }
                    if(fieldWithMains[i-1][j]!=-1){
                        fieldWithMains[i-1][j]=fieldWithMains[i-1][j]+1;
                    }
                    if(fieldWithMains[i-1][j+1]!=-1){
                        fieldWithMains[i-1][j+1]=fieldWithMains[i-1][j+1]+1;
                    }
                    if(fieldWithMains[i][j+1]!=-1){
                        fieldWithMains[i][j+1]=fieldWithMains[i][j+1]+1;
                    }
                    if(fieldWithMains[i][j-1]!=-1){
                        fieldWithMains[i][j-1]=fieldWithMains[i][j-1]+1;
                    }
                    if(fieldWithMains[i+1][j-1]!=-1){
                        fieldWithMains[i+1][j-1]=fieldWithMains[i+1][j-1]+1;
                    }
                    if(fieldWithMains[i+1][j]!=-1){
                        fieldWithMains[i+1][j]=fieldWithMains[i+1][j]+1;
                    }
                    if(fieldWithMains[i+1][j+1]!=-1){
                        fieldWithMains[i+1][j+1]=fieldWithMains[i+1][j+1]+1;
                    }
                }
            }
        }
    }
}
