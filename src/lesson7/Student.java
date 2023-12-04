package lesson7;

public class Student {
    /** 1 - ���������� ��� ���� ������ ��� �������� ��� ��������������
     * 2 - ������������ (������ ����� ������� ���������� � ������ �������� ������� ����� ����� new)
     * 3 - ������
     */
    private int age;
    private String fullName;
    private String adress;
    private String phoneNumber;

    public Student(){

    }

    public Student(int age, String fullName, String adress, String phoneNumber){
        this.age = age;
        this.adress = adress;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }

    //����� ����� ������������� �������� �������
    public void setAge(int age){
        //this -- ��������� "�", ��� �� �������� ������ age= age
        this.age = age;
    }

    //����� ������� ������� ��������
    public  int getAge(){
        //this ����� �� ������ ��� ��� ����������� ������
        return age;
    }

}
