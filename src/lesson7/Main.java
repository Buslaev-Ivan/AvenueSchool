package lesson7;

public class Main {
    public static void main(String[] args) {
        // ������� �������� ������� ������������� ����
        // ����� ���������� (������ ���� ������� ���������� ����� ����� new)
        Student vasya = new Student(27, "����", "�������","98457485");
        Student petya = new Student();
        vasya.setAge(27);
        petya.setAge(23);

        System.out.println(vasya.getAge());
        System.out.println(petya.getAge());
    }
}
