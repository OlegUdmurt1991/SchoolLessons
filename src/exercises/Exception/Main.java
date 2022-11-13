package exercises.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyExceptionClass pro = new MyExceptionClass();
        String str = pro.toString();
        int len1 = pro.length();

        for (int j = 0; j < 3; j = j++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Напишите предложение");
            String sentence = in.nextLine();
            int len2 = sentence.length();
            if (len1 > len2) {
            }
            System.out.println(str);
            if (!sentence.equals("хватит")) {
                continue;
            } else {

                System.out.print("харэ");
                break;
            }
        }
    }
}








//if (sentence.equals("хватит")) {  //indexOf проверяет наличие чего то в чем то, а > 0 говорит типо тру или фолс
//        System.out.print(sentence);
////        System.out.println(pro);
//        }
//        else {
//        System.out.println("Напишите предложение еще раз ");
//        Scanner an = new Scanner(System.in);
//        String sentences = an.nextLine();
//        System.out.println(sentences);
//
//        }


//for (int i = 1; i <= 7; i++) {
//        System.out.println(i + ": я выполянюсь перед continue!");
//        if (sentence.equals("хватит"))
//        continue;
//        System.out.println(sentence);
//        }