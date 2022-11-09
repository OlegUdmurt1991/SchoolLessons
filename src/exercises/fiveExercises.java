package exercises;

import java.util.Scanner;

public class fiveExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Напишите предложение");
        String sentence = in.nextLine(); //.toLowerCase()
        sentence = sentence.toLowerCase();
        if (sentence.indexOf("тестер") > 0) {  //indexOf проверяет наличие чего то в чем то, а > 0 говорит типо тру или фолс
            System.out.print(sentence.replace("тестер", "разраб"));
        }
    }
}
