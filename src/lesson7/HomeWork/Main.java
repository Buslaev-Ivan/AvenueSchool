package lesson7.HomeWork;

public class Main {
    public static void main(String[] args) {

        //������� 3 ������� ������ phone
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        //��������� ����������� ������� phone
        phone1.setNumber("89503984467");
        phone2.setNumber("89704546633");
        phone3.setNumber("89306562345");

        phone1.setModel("S23 Ultra");      //�� ����� ���� ��� �� ������
        phone2.setModel("Iphone 14 Pro");  //����� ����� ������ ��������
        phone3.setModel("Pixel 6a");

        phone1.setWeight(305); //�� ����� ���� ��� �� ���
        phone2.setWeight(285); //����� ����� ��� ��������� � �������
        phone3.setWeight(245);

        //����� ������
        System.out.printf("������� 1 ����� %s, ������ %s, ��� %s \n", phone1.getNumber(), phone1.getModel(), phone1.getWeight());
        System.out.printf("������� 2 ����� %s, ������ %s, ��� %s \n", phone2.getNumber(), phone2.getModel(), phone2.getWeight());
        System.out.printf("������� 3 ����� %s, ������ %s, ��� %s \n", phone3.getNumber(), phone3.getModel(), phone3.getWeight());

        //������� �������
        Person person1 = new Person("����",44);
        Person person2 = new Person();
        person2.setFullName("����");
        person2.setAge(28);
        System.out.println();

        //����� ������� move � talk ��� person
        person1.move();
        person2.move();
        System.out.println();


        person1.talk();
        person2.talk();
        System.out.println();

        phone1.receiveCall(person1);
        phone2.receiveCall(person2);
    }
}