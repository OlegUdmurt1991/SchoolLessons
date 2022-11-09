package metanit.chapter2;
//Поразрядные операции
public class six {
    public static void main(String[] args) {
        int a1 = 2; //010
        int b1 = 5;//101
        System.out.println(a1|b1); // результат 7 - 111
        int a2 = 4; //100
        int b2 = 5;//101
        System.out.println(a2 | b2); // результат 5 - 101
    }
}

