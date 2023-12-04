package Lesson10.HomeWork;

//создали супер клас продукт с общими переменными для всех подклассов
public class Product {
    String name;
    int yearOfPublication;
    String publisher;

    public Product(String name, int yearOfPublication, String publisher) {
        this.name = name;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
    }

    //недостаточно знаний что бы вывести все данные продукта в зависимости от его подкласса
    public void displayProduct() {
        System.out.printf("Название %s, год %s, издатель %s \n", name, yearOfPublication, publisher);
    }

    public String getName() {
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }
}


