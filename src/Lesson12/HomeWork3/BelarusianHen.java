package lesson12;

public class BelarusianHen extends Hen {
    final String countryName = "Беларусь";

    @Override
    int getCountOfEggsPerMonth() {
        return 32;
    }

    String getDescription() {
        return super.getDescription() + "Моя странна " + countryName+ ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
