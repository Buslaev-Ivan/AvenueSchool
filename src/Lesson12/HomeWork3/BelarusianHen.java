package lesson12;

public class BelarusianHen extends Hen {
    final String countryName = "��������";

    @Override
    int getCountOfEggsPerMonth() {
        return 32;
    }

    String getDescription() {
        return super.getDescription() + "��� ������� " + countryName+ ", � ���� " + getCountOfEggsPerMonth() + " ��� � �����";
    }
}
