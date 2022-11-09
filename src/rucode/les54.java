package rucode;

/*Реализуйте метод multiplyNumbersFromRange(), который перемножает числа в указанном диапазоне
включая границы диапазона. Пример вызова:
        App.multiplyNumbersFromRange(1, 5); // 1 * 2 * 3 * 4 * 5 = 120
        App.multiplyNumbersFromRange(2, 3); // 2 * 3 = 6
        App.multiplyNumbersFromRange(6, 6); // 6*/
public class les54 {
    public static int multiplyNumbersFromRange(int start, int finish) {
            // BEGIN (write your solution here)
            var i = start;
            var sum = 1;
            while (i <= finish) {
                sum = sum * i ;
                i = i + 1 ;
            }
            return sum;
            // END


    }

    public static void main(String[] args) {

    }
}
