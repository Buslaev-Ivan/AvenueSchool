package lesson4;

public class HomeWork45 {
    public static void main(String[] args) {
        String text = "� ���� ������ �����";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
            System.out.println(new StringBuilder(words[i]).reverse().toString());
        }
    }
}
