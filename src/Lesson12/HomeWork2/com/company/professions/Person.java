package Lesson12.HomeWork2.com.company.professions;

public class Person {
    private String firstName;
    private String lastName;
    private String patronymicName;
    private int age;

    public Person(String firstName, String lastName, String patronymicName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return ", Имя=" + firstName + '\'' +
                ", Фамилия='" + lastName + '\'' +
                ", Отчество='" + patronymicName + '\'' +
                ", Возраст=" + age;
    }
}

