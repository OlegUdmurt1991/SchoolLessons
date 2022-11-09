package rucode;

//Задание
//        Реализуйте метод joinNumbersFromRange(), который объединяет все числа из диапазона в строку:
//
//        App.joinNumbersFromRange(1, 1); // "1"
//        App.joinNumbersFromRange(2, 3); // "23"
//        App.joinNumbersFromRange(5, 10); // "5678910"
public class Les55 {

    public static String joinNumbersFromRange(int start, int finish) {
        // BEGIN (write your solution here)

        var i = start;
        var result = "";

        while (i <= finish) {
            result = result + i;
            i = i + 1;
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
