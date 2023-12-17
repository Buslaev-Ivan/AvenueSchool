package Lesson16.Demo;

public class Main1 {
    public static void main(String[] args) {
        Freech freech = new Freech();

        freech.addProduct("Яблоко", 200);
        freech.addProduct("Яблоко", 400);
        freech.addProduct("Груша", 800);
        freech.addProduct("Слива", 1000);

        freech.printAllProucts();
        System.out.println("---------");
        freech.printAllProucts2();

        freech.takeProduct("Яблоко");
        freech.takeProduct("Яблоко");
        freech.takeProduct("Яблоко");
        freech.takeProduct("Яблоко"); // Пример взятия продукта, можно вызвать несколько раз

        freech.printFirstToFinish();
        System.out.println("---------");

        freech.printSortedByName();
        System.out.println("---------");

        freech.printSortedByWeight();
    }
}
