package Lesson18;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // ������� ��������������  ���������� ������� �����
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(System.in));
            // ���������� ����� PrintWriter ��� ������
            PrintWriter out = new PrintWriter (new FileWriter("data.txt"));
            // ���������� ������, ���� �� ������ ������ "stop"
            while (true) {
                String s = in.readLine();
                if (s.equals("stop"))
                    break;
                out.println(s);
            }
            out.close();
        } catch (IOException ex) {
            // ���������� ����������
        }

    }
}
