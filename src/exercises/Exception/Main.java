package exercises.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyExceptionClass pro = new MyExceptionClass();
        String str = pro.toString();
        int len1 = pro.length();

        for (int j = 0; j < 3; j = j++) {
            Scanner in = new Scanner(System.in);
            System.out.println("�������� �����������");
            String sentence = in.nextLine();
            int len2 = sentence.length();
            if (len1 > len2) {
            }
            System.out.println(str);
            if (!sentence.equals("������")) {
                continue;
            } else {

                System.out.print("����");
                break;
            }
        }
    }
}








//if (sentence.equals("������")) {  //indexOf ��������� ������� ���� �� � ��� ��, � > 0 ������� ���� ��� ��� ����
//        System.out.print(sentence);
////        System.out.println(pro);
//        }
//        else {
//        System.out.println("�������� ����������� ��� ��� ");
//        Scanner an = new Scanner(System.in);
//        String sentences = an.nextLine();
//        System.out.println(sentences);
//
//        }


//for (int i = 1; i <= 7; i++) {
//        System.out.println(i + ": � ���������� ����� continue!");
//        if (sentence.equals("������"))
//        continue;
//        System.out.println(sentence);
//        }