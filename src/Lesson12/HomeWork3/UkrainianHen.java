package lesson12;

public class UkrainianHen extends Hen {
    final String countryName = "”краина";

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    String getDescription() {
        return super.getDescription() + "ћо€ странна " + countryName+ ", € несу " + getCountOfEggsPerMonth() + " €иц в мес€ц";
    }
}
