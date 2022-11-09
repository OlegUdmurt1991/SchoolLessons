package exercises;

import java.util.Scanner;

public class threeExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Ñêîëüêî òåáå ëåò, êîæàííûé ìåøîê? ");
        int age = in.nextInt();
        if (age >= 0 && age < 5) {
            System.out.println("Ùåãîë÷èê");
        }
        else if (age >= 5 && age < 18) {
            System.out.println("Äèò¸íûø");
        }
        else if (age >= 18 && age < 30) {
            System.out.println("Ëó÷øåå âğåìÿ");
        }
        else {
            System.out.println("Åùå ëó÷øåå â ïåğåäè");
        }
    }
}
