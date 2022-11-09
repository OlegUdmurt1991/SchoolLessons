package metanit.chapter2;

import java.util.Scanner;
//Упражнение 2
//Напишите консольную программу, в которой пользователь вводит с клавиатуры число. Если число одновременно меньше 9 и больше 2, то программа выводит "Число больше 5 и меньше 10". Иначе программа выводит сообщение "Неизвестное число".
public class Exe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввести число: ");
        int Num = in.nextInt();
        if (Num < 9 && Num > 2) {
            System.out.println("Число больше 5 и меньше 10");


        } else {
            System.out.println("Неизвестное число");
        }
in.close();

    }
}
