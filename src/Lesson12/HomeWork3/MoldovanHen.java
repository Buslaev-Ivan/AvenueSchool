package lesson12;

public class MoldovanHen extends Hen {
    final String countryName = "��������";

    @Override
    int getCountOfEggsPerMonth() {
        return 8;
    }

    String getDescription() {
        return super.getDescription() + "��� ������� " + countryName+ ", � ���� " + getCountOfEggsPerMonth() + " ��� � �����";
    }
}
