package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int wightOfTable = 2500;
        int lengthOfTable = 500;
        int wightOfRoom = 60000;
        int leigtOfRoom = 30000;

        int ploshadTable = wightOfTable * lengthOfTable;
        int ploshadRoom = wightOfRoom * leigtOfRoom;

        int tablesToInsertToRoom = ploshadRoom / ploshadTable;
        System.out.println(tablesToInsertToRoom);
    }
}
