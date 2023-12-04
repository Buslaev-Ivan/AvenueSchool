package lesson12;

public class MoldovanHen extends Hen {
    final String countryName = "Молдавия";

    @Override
    int getCountOfEggsPerMonth() {
        return 8;
    }

    String getDescription() {
        return super.getDescription() + "Моя странна " + countryName+ ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }
}
