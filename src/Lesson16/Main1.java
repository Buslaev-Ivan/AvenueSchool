package Lesson16;

public class Main1 {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 200);
        holodilnik.addProduct("Яблоко", 400);
        holodilnik.addProduct("Слива", 800);
        holodilnik.addProduct("Слива", 800);
        holodilnik.addProduct("Слива", 1200);
        holodilnik.addProduct("Груша", 1000);
        holodilnik.addProduct("Груша", 500);
        holodilnik.addProduct("Груша", 1000);
        holodilnik.addProduct("Мясо", 2000);
        holodilnik.addProduct("Молоко", 2000);
        holodilnik.addProduct("Чай", 500);
        holodilnik.addProduct("Сливки", 100);


        holodilnik.printAllProducts();
//        holodilnik.printAllProducts2();
        holodilnik.giveProduct("Чай", 250);
        holodilnik.giveProduct("Слива", 4800);
        holodilnik.giveProduct("Сахар", 500);
        holodilnik.shortage();
        holodilnik.allCount();
        holodilnik.printSortProducts();

    }
}
