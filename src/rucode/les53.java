package rucode;

/*Задание
        Модифицируйте метод printNumbers() так, чтобы она выводила числа в обратном порядке.
        Для этого нужно идти от верхней границы к нижней. То есть счётчик должен быть инициализирован максимальным значением, а в теле цикла его нужно уменьшать до нижней границы.

        Пример вызова и вывода:

        printNumbers(4);*/
public class les53 {
    public static void main(String[] args) {

    }
    public static void printNumbers(int lastNumber) {
        var i = lastNumber;

        while (i >= 1){
            System.out.println(lastNumber);
            i = i - 1 ;
        }
        System.out.println("finished");
    }
   }
