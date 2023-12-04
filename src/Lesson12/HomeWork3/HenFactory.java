package lesson12;

public class HenFactory {
    static RussianHen russianHen = new RussianHen();
    static MoldovanHen moldovanHen = new MoldovanHen();

    public static Hen getHen(String country) {
        if (country.equalsIgnoreCase("Беларусь")) {
            return new BelarusianHen();
        }
        if (country.equalsIgnoreCase("Россия")) {
            return russianHen;
        }
        if (country.equalsIgnoreCase("Украина")) {
            return new UkrainianHen();
        }
        return moldovanHen;
    }
}
