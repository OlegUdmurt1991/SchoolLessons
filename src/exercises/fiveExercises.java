package exercises;

import java.util.Scanner;

public class fiveExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("�������� �����������");
        String sentence = in.nextLine(); //.toLowerCase()
        sentence = sentence.toLowerCase();
        if (sentence.indexOf("������") > 0) {  //indexOf ��������� ������� ���� �� � ��� ��, � > 0 ������� ���� ��� ��� ����
            System.out.print(sentence.replace("������", "������"));
        }
    }
}
