package lesson1;

public class Candy {
    public static void main(String[] args) {
        int bigBank = 1000;
        int priceBigCandy = 35;
        double priceSmallCandy = 3.5;
        int lotBigCandy = bigBank / priceBigCandy; //получаем дробное значение но переменая принимает значение целого числа
        // да мы делим int на int, и java сама понимает что получаем значение int и потому осуществляет присвоение?
        int lotSmallCandy = (int) ((bigBank - lotBigCandy * priceBigCandy) / priceSmallCandy); // когда в данном случае делим int на double
        // результат деления double и присвоить значения int не может? так как double более "широкий" приметив чем int?
        // поэтому IJ настаивает на ручном преобразовании правой части в int при помощи (int)?
        double smallBank = bigBank - lotSmallCandy * priceSmallCandy - lotBigCandy * priceBigCandy;

        System.out.println("Бюджет " + bigBank + " руб.");
        System.out.println("Стоимость Сникерс " + priceBigCandy + " руб.");
        System.out.println("Стоимость Конфета " + priceSmallCandy + " руб.");
        System.out.println("Кол-во Сникерс " + lotBigCandy + " шт.");
        System.out.println("Кол-во Конфет " + lotSmallCandy + " шт.");
        System.out.println("Остаток " + smallBank + " руб.");

    }
}
