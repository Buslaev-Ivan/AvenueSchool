package lesson2;

public class Main {
    public static void main(String[] args) {
        int money = 1500;
        int costOfSnikers = 35;
        double costOfCandy = 3.5;

        int countCanSnikBay = money/costOfSnikers; //28��.
        int rest = money % costOfSnikers; // 20 ������

        //2 ���� ��������������
        //����������� (���������) ����� ���������� �������������
        // ������������ (����������) ������ �������
        int countCanCandyBay = (int) (rest / costOfCandy);
        double totalRest = rest - (countCanCandyBay*costOfCandy);

        System.out.println(countCanSnikBay);
        System.out.println(countCanCandyBay);
        System.out.println(totalRest);
    }
}
