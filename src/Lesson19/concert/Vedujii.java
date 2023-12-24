package Lesson19.concert;

public class Vedujii {
    public static void main(String[] args) {
        System.out.println("Начало концерта:");

        Pevets1 pevets1 = new Pevets1();
        pevets1.setName("Киркоров");
        pevets1.start();

        Pevets2 pevets2 = new Pevets2();
        pevets2.setDaemon(true);
        pevets2.start();

        while (pevets1.isAlive()){

        }

        System.out.println("Конец концерта");
    }
}
