package metanit.chapter2;
// Упражнение 5
//Измените предыдущую программу. Пусть пользователь кроме номера операции вводит два числа, и в зависимости от номера операции с введенными числами выполняются определенные действия (например, при вводе числа 3 числа умножаются). Результат операции выводиться на консоль.
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.println("Введите номер операции: 1.Сложение  2.Вычитание  3.Умножение");
        int operation = in.nextInt();
        int result = 0;

        switch (operation)
        {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            default:
                System.out.println("Неизвестная операция");
        }
        if(operation >=1 && operation <= 3){
            System.out.printf("Результат операции: %d", result);
        }
        in.close();
    }
}