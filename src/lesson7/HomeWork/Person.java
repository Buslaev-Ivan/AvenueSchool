package lesson7.HomeWork;

public class Person {
    private String fullName;
    private int age;

    //конструктор класса Person с 2мя параметрами
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    //конструктор класса Person без параметров
    Person() {
    }

    //персона движется
    public void move() {
        System.out.println(this.fullName + " движется");
    }

    //персона говорит
    public void talk() {
        System.out.println(this.fullName + " говорит");
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
