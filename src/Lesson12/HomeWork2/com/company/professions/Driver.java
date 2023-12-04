package Lesson12.HomeWork2.com.company.professions;

public class Driver extends Person {

    private int experienceYear;

    public Driver(String firstName, String lastName, String patronymicName, int age, int experienceYear) {
        super(firstName, lastName, patronymicName, age);
        this.experienceYear = experienceYear;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public String toString() {
        return Driver.super.toString() +
                ", Стаж=" + experienceYear;
    }

}
