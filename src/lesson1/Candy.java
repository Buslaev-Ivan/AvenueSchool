package lesson1;

public class Candy {
    public static void main(String[] args) {
        int bigBank = 1000;
        int priceBigCandy = 35;
        double priceSmallCandy = 3.5;
        int lotBigCandy = bigBank / priceBigCandy; //�������� ������� �������� �� ��������� ��������� �������� ������ �����
        // �� �� ����� int �� int, � java ���� �������� ��� �������� �������� int � ������ ������������ ����������?
        int lotSmallCandy = (int) ((bigBank - lotBigCandy * priceBigCandy) / priceSmallCandy); // ����� � ������ ������ ����� int �� double
        // ��������� ������� double � ��������� �������� int �� �����? ��� ��� double ����� "�������" �������� ��� int?
        // ������� IJ ���������� �� ������ �������������� ������ ����� � int ��� ������ (int)?
        double smallBank = bigBank - lotSmallCandy * priceSmallCandy - lotBigCandy * priceBigCandy;

        System.out.println("������ " + bigBank + " ���.");
        System.out.println("��������� ������� " + priceBigCandy + " ���.");
        System.out.println("��������� ������� " + priceSmallCandy + " ���.");
        System.out.println("���-�� ������� " + lotBigCandy + " ��.");
        System.out.println("���-�� ������ " + lotSmallCandy + " ��.");
        System.out.println("������� " + smallBank + " ���.");

    }
}
