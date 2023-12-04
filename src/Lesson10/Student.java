package Lesson10;

public class Student extends Object {
    private String fullName;
    private int age;
    private int schoolarSip;

    public Student() {

    }

    public Student(String fullName, int age, int schoolarSip) {
        this.fullName = fullName;
        this.age = age;
        this.schoolarSip = schoolarSip;
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

    public int getSchoolarSip() {
        return schoolarSip;
    }

    public void setSchoolarSip(int schoolarSip) {
        this.schoolarSip = schoolarSip;
    }

    @Override
    public boolean equals(Object o) {
        //olya --- o
        //dasha --- this
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //преобразование типов
        Student student = (Student) o;// вниз сходящее преобразование
        //olya --- o --- Student

        if (age != student.age) return false;
        if (schoolarSip != student.schoolarSip) return false;
        return fullName != null ? fullName.equals(student.fullName) : student.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + schoolarSip;
        return result;
    }

    @Override
    public String toString() {
        return "Студент{" +
                " имя ='" + fullName + '\'' +
                ", возраст =" + age +
                ", стипендия =" + schoolarSip +
                '}';
    }
}
