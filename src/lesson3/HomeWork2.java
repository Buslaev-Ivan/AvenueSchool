package lesson3;

public class HomeWork2 {
    public static void main(String[] args) {
        String text = "� ���� ������ �����";
        char[] symbols = text.toCharArray();

        //����� �� ����� � ��������� ������
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                System.out.println();
            } else System.out.print(symbols[i]);
        }
        System.out.println();

        //����� �� ����� �������� �������
        int kollProbell = 0;
        //��������� ����������� ��������, ��������� ���-�� ����, ��� �������� �������;
        //�� �������� ����� �������� �� �������� �������...
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == ' ') {
                kollProbell++;
            }
        }
        System.out.println("���-�� ����:" + (kollProbell + 1));
        // �������� ��������� ������ i-���-�� ����, j ���-�� �������� � c�����.
        char massivtext [][]=new char[(kollProbell + 1)][symbols.length];
        for (int i = 0; i < (kollProbell + 1); i++) {
            for (int j = 0; j < symbols.length; j++) {
                massivtext[i][j] = symbols[j];
            }
        }
        //������� ���������
        for (int i = 0; i < (kollProbell + 1); i++) {
            for (int j = 0; j < symbols.length; j++) {
                System.out.print(massivtext[i][j]+"_");
            }
            System.out.println();
        }

    }
}