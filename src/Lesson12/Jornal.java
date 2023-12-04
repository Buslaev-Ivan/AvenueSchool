package Lesson12;

public class Jornal extends PrintEdition{
    private int numberOfYear;

    public Jornal(){}

    public Jornal(String name, int year, int pages, String izdatelstvo, int numberOfYear) {
        super(name, year, pages, izdatelstvo);
        this.numberOfYear = numberOfYear;
    }

    public int getNumberOfYear() {
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear) {
        this.numberOfYear = numberOfYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jornal jornal = (Jornal) o;

        return numberOfYear == jornal.numberOfYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfYear;
        return result;
    }

    @Override
    public String toString() {
        return "Книга { название" + getName() + ", кол-во страницЖ " + getPages() +
                " номер выпуска = " + numberOfYear + " Издательство: " + getIzdatelstvo() +
                " Год выпуска: " + getYear() + '}';
    }
}
