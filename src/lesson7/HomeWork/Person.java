package lesson7.HomeWork;

public class Person {
    private String fullName;
    private int age;

    //����������� ������ Person � 2�� �����������
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    //����������� ������ Person ��� ����������
    Person() {
    }

    //������� ��������
    public void move() {
        System.out.println(this.fullName + " ��������");
    }

    //������� �������
    public void talk() {
        System.out.println(this.fullName + " �������");
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
