package metanit.chapter2;
//Преобразования базовых типов данных
// byte -> short -> int -> long
//
//int -> double
//
//short -> float -> double
//
//char -> int
public class nine {
    public static void main(String[] args) {
        int a = 4;
        byte b = (byte)a;  // преобразование типов: от типа int к типу byte
        System.out.println(b); // 4

        short shortNum = 257;
        byte byteNum = (byte)shortNum;

        System.out.println(byteNum); //Программа выведет на консоль число 1. в двоичном представлении будет равно 0000000100000001
    }
}
