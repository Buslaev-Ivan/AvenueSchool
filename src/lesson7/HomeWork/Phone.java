package lesson7.HomeWork;

public class Phone {
    private String number;
    private String model;
    private int weight;

    //конструктор класса Phone c 3мя входными параметрами
    Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //конструктор класса Phone с 2мя входными параметрами
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //конструктор класса Phone без параметров
    Phone(){
    }

    //создаем сеттеры
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //создаем геттеры
    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void receiveCall(Person person) {
        System.out.println(person.getFullName() +" (" +person.getAge()+" лет) звонит "+this.number);
        System.out.println("модель телефона "+this.model);
        System.out.println();
    }
}

