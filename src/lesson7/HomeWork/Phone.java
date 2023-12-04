package lesson7.HomeWork;

public class Phone {
    private String number;
    private String model;
    private int weight;

    //����������� ������ Phone c 3�� �������� �����������
    Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    //����������� ������ Phone � 2�� �������� �����������
    Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    //����������� ������ Phone ��� ����������
    Phone(){
    }

    //������� �������
    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //������� �������
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
        System.out.println(person.getFullName() +" (" +person.getAge()+" ���) ������ "+this.number);
        System.out.println("������ �������� "+this.model);
        System.out.println();
    }
}

