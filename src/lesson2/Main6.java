package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // Сколько денег мы вынесем с банка, если положим
        //10КК на 15 лет под 13% годовых

        double money = 1000000;
        for(int month=0; month < 15*12; month++){
            money = money + (money/100*13/12);
        }
        System.out.println(money);
        //6 954 850
    }
}
