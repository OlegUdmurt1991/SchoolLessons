//Арифметические операции
package metanit.chapter2;

public class five {
    public static void main(String[] args) {
        int x = 8;
        int y = x++;
        System.out.println(x);  // 9
        System.out.println(y);  // 8
        int a = 8;
        int b = 7;
        int c = a + 5 * ++b;
        System.out.println(c);  // 48
    }
}
