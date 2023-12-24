package Lesson19.HomeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало отсчета:");

        Vasya vasya = new Vasya();
        vasya.setName("Вася");
        vasya.start();

        Petruha petruha = new Petruha();
        petruha.setName("Петруха");
        petruha.setDaemon(true);
        petruha.start();

        while (vasya.isAlive()) {

        }
        System.out.println("Конец счета");
    }
}
