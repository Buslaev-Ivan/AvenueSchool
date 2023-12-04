package lesson12;

public class RussianHen extends Hen {
    final String countryName = "Россия";

    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    String getDescription() {
        return super.getDescription() + "Моя странна " + countryName+ ", я несу " + getCountOfEggsPerMonth() + " яиц в месяц";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RussianHen that = (RussianHen) o;

        return countryName != null ? countryName.equals(that.countryName) : that.countryName == null;
    }

    @Override
    public int hashCode() {
        return countryName != null ? countryName.hashCode() : 0;
    }
}
