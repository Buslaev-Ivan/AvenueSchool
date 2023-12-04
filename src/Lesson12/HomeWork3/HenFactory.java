package lesson12;

public class HenFactory {
    static RussianHen russianHen = new RussianHen();
    static MoldovanHen moldovanHen = new MoldovanHen();

    public static Hen getHen(String country) {
        if (country.equalsIgnoreCase("��������")) {
            return new BelarusianHen();
        }
        if (country.equalsIgnoreCase("������")) {
            return russianHen;
        }
        if (country.equalsIgnoreCase("�������")) {
            return new UkrainianHen();
        }
        return moldovanHen;
    }
}
