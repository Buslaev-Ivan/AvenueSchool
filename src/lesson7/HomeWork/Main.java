package lesson7.HomeWork;

public class Main {
    public static void main(String[] args) {

        //создаем 3 обьекта класса phone
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        //наполняем информацией объекты phone
        phone1.setNumber("89503984467");
        phone2.setNumber("89704546633");
        phone3.setNumber("89306562345");

        phone1.setModel("S23 Ultra");      //не очень ясно что за модель
        phone2.setModel("Iphone 14 Pro");  //пусть будет модель телефона
        phone3.setModel("Pixel 6a");

        phone1.setWeight(305); //не очень ясно что за вес
        phone2.setWeight(285); //пусть будет вес телефонов в граммах
        phone3.setWeight(245);

        //вывод данных
        System.out.printf("Телефон 1 Номер %s, модель %s, вес %s \n", phone1.getNumber(), phone1.getModel(), phone1.getWeight());
        System.out.printf("Телефон 2 Номер %s, модель %s, вес %s \n", phone2.getNumber(), phone2.getModel(), phone2.getWeight());
        System.out.printf("Телефон 3 Номер %s, модель %s, вес %s \n", phone3.getNumber(), phone3.getModel(), phone3.getWeight());

        //создаем персоны
        Person person1 = new Person("Саша",44);
        Person person2 = new Person();
        person2.setFullName("Анна");
        person2.setAge(28);
        System.out.println();

        //вызов методов move и talk для person
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