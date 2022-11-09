package metanit.chapter2;
// Упражнение 1
//Напишите консольную программу, в которой пользователь с клавиатуры вводит два числа. А программа сранивает два введенных числа и выводит на консоль результат сравнения (два числа равны, первое число больше второго или первое число меньше второго).
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in) ;
        System.out.print("Ввести первое число: ");
        int firstNum = in.nextInt() ;
        System.out.print("Ввести второе число:  ");
        int secondNum = in.nextInt() ;
        if (firstNum > secondNum) {
            System.out.println("Первое число больше второго");
        }
        else if (firstNum < secondNum) {
            System.out.println("Первое число меньше второго");
        }
        else{
            System.out.println("Числа равны");
    }
        in.close();
}}
