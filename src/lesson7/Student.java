package lesson7;

public class Student {
    /** 1 - переменные или поля класса или свойства или характеристики
     * 2 - конструктора (особый метод который вызываются в момент создания обьекта после слова new)
     * 3 - методы
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

    //метод будет устанавливать студенту возраст
    public void setAge(int age){
        //this -- обращения "я", что бы работала связка age= age
        this.age = age;
    }

    //метод возврат возраст студента
    public  int getAge(){
        //this можно не писать так нет пересечения связки
        return age;
    }

}
