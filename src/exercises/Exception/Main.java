package exercises.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String sentence;

            do {
                System.out.println("������ �����������");
                sentence = in.nextLine();
                int len = sentence.length();
                try {
                    if (len > 7) {
                        throw new Exception("��������� ����������!!!!!!!");
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                    System.out.println("����� �� ������ ���� ������ 7 ����");
                }}
                while (!sentence.equals("������")) ;
                System.out.println("����������! �� ������ �����");

            }}









//        while (true) {
//
//
//            System.out.println("�����");
//            if (false)
//                System.out.println("yt elfxf");
//break;
//
//        }















//    MyExceptionClass pro = new MyExceptionClass();
//    String str = pro.toString();
//    int len1 = pro.length();
//
//        for (int j = 0; j < 3; j = j++) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("�������� �����������");
//        String sentence = in.nextLine();
//        int len2 = sentence.length();
//        if (len1 > len2) {
//        }
//        System.out.println(str);
//        if (!sentence.equals("������")) {
//        continue;
//        } else {
//
//        System.out.print("����");
//        break;
//        }
//        }




