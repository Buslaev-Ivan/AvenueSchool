package lesson12;

public class UkrainianHen extends Hen {
    final String countryName = "�������";

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    String getDescription() {
        return super.getDescription() + "��� ������� " + countryName+ ", � ���� " + getCountOfEggsPerMonth() + " ��� � �����";
    }
}
