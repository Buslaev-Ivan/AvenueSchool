package lesson5;

public class MathUtils {
    /**
     * �������� ������;
     * 1 - ����������� ������� (����� ������������ ������� ���������)
     * public - ������ ������ ����� �������
     * protected - �������� ������ ������ ������� �����, � ����������� �������� ������
     * ------- - �������� ������ ������ ������� �����
     * private - ������ ������ � ���� ������
     * <p>
     * ��� �������� ����������� �������:
     * - ����� �������;
     * - ����� ������� (��� ��� �������� �����);
     * -
     * -
     * 2 - static (����� ��� �� �����)
     * 3 - ��������� ������������ ��� (��� ����� void ���� ��� �����������)
     * 4 - �������� ������ (����������� ���������)
     * 5 - �������� ��������� (�� ��� ���� �� �������� ��������� ������ �����)
     * ������ ������������ � (), ����� �������, �������� ��� � �������� ����������
     * 6 - ���� ���������� ������ �������. ������� ������
     */

    // ������ - ������� �����, ������� ��������� ������� ������������ �� ���� �������� � ������� �� �� �������
    public static void squareTriangle(int a, int b, int c) {
        double p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    //����� ���������� �������� ������������ �� ���� ��������
    public static int perimetrTriangle(int a, int b, int c) {
        return a + b + c;
    }

    public static int squareBox(int a) {
        return a * a;
    }

    public static int perimetrBox(int a) {
        return a * 4;
    }

    public static double squareOval(int a, int b) {
        return Math.PI * a * b;
    }

    public static double perimetrOval(int a, int b) {
        return 2*Math.PI*Math.sqrt((a*a+b*b)/2);
    }

    public static double squareTrapezoid(int a, int b, int h) {
        return h*(a+b)/2;
    }

    public static double perimetrTrapezoid(int a, int b, int c, int d) {
        return a+b+c+d;
    }
}
