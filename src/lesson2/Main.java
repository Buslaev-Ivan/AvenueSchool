package lesson2;

public class Main {
    public static void main(String[] args) {
        int money = 1500;
        int costOfSnikers = 35;
        double costOfCandy = 3.5;

        int countCanSnikBay = money/costOfSnikers; //28шт.
        int rest = money % costOfSnikers; // 20 рублей

        //2 вида преобразования
        //версходящее (увелчение) может выполнятся автоматически
        // внизсходящее (уменьшение) только вручную
        int countCanCandyBay = (int) (rest / costOfCandy);
        double totalRest = rest - (countCanCandyBay*costOfCandy);

        System.out.println(countCanSnikBay);
        System.out.println(countCanCandyBay);
        System.out.println(totalRest);
    }
}
