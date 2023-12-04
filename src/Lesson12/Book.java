package Lesson12;

public class Book extends PrintEdition {
    private String avtor;

    public Book() {
    }

    public Book(String name, int year, int pages, String izdatelstvo, String avtor) {
        super(name, year, pages, izdatelstvo);
        this.avtor = avtor;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        return avtor != null ? avtor.equals(book.avtor) : book.avtor == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (avtor != null ? avtor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Книга { название" + getName() + ", кол-во страницЖ " + getPages() +
                " автор = " + avtor + " Издательство: " + getIzdatelstvo() +
                " Год выпуска: " + getYear() + '}';
    }
}
