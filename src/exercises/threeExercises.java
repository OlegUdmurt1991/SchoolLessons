package exercises;

import java.util.Scanner;

public class threeExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("������� ���� ���, �������� �����? ");
        int age = in.nextInt();
        if (age >= 0 && age < 5) {
            System.out.println("��������");
        }
        else if (age >= 5 && age < 18) {
            System.out.println("������");
        }
        else if (age >= 18 && age < 30) {
            System.out.println("������ �����");
        }
        else {
            System.out.println("��� ������ � ������");
        }
    }
}
