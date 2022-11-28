package exercises.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String sentence;

            do {
                System.out.println("Напиши предложение");
                sentence = in.nextLine();
                int len = sentence.length();
                try {
                    if (len > 7) {
                        throw new Exception("Сработало исключение!!!!!!!");
                    }
                } catch (Exception ex) {
                    ex.getMessage();
                    System.out.println("Слово не должно быть больше 7 букв");
                }}
                while (!sentence.equals("хватит")) ;
                System.out.println("Поздравляю! Ты угадал слово");

            }}









//        while (true) {
//
//
//            System.out.println("успех");
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
//        System.out.println("Напишите предложение");
//        String sentence = in.nextLine();
//        int len2 = sentence.length();
//        if (len1 > len2) {
//        }
//        System.out.println(str);
//        if (!sentence.equals("хватит")) {
//        continue;
//        } else {
//
//        System.out.print("харэ");
//        break;
//        }
//        }




