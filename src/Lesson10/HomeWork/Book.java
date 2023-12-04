package Lesson10.HomeWork;

//создали подклас книги с добавлением в нем индивидуальных переменных
public class Book extends Product{
    String author;
    int pageCount;

    public Book(String name, int yearOfPublication, String publisher, String author, int pageCount) {
        super(name, yearOfPublication, publisher);
        this.author = author;
        this.pageCount = pageCount;
    }

}
