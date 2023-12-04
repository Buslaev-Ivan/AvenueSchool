package Lesson12;

public class Main {
    public static void main(String[] args) {
        PrintEdition[] editions = new PrintEdition[6];
        editions[0] = new Book("Война и мир", 1950, 450, "Россия", "Лев Толстой");
        editions[1] = new Book("Война и мир", 1999, 300, "Россия", "Пушкин");
        editions[2] = new Book("Война и мир", 1950, 450, "Россия", "Лев Толстой");
        editions[3] = new Jornal("Бурда", 2010, 200, "Россия", 8);
        editions[4] = new Jornal("Поворята", 2000, 100, "Россия", 7);
        editions[5] = new Jornal("Натали", 2020, 150, "Россия", 4);

        for (PrintEdition currentEdition : editions) { //for each - сокращенный for
            System.out.println(currentEdition.toString());//происходит проявление полимофирзма


            /** Полимофирзм - это свойство java, работать с РАЗНЫМИ типами данных
             * как с ОДИНАКОВЫМ типом (в коде). Но в тоже самое времяв ммент выполнения программы
             * программа будет работать как с РАЗНЫМИ типами.
             */

            printBigestEdition(editions);

        }


    }

    public static void printBigestEdition(PrintEdition[] editions){
        //дома
    }


}
