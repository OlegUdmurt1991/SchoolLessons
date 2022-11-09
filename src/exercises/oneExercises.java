package exercises;

public class oneExercises {


public static void main(String[] args) {
    //two
    byte b = 127 ;
    short s = 32767 ;
    int i = 24965019 ;
    long l = 928405198;
    char ch = 'h' ;
    double d = 9.5 ;
    float fl = 15.6F ;
    boolean bool = true ;
    String str = "hello" ;

    //three
    System.out.println(b + " " + s + " " + i + " " + l + " " + ch + " " + '\n'
                    + " " + d +" " + " " + fl + " " + bool + " " + "str" );

    //four
    int a = 1000 ;
    b = (byte) 1000; // я понимаю что максимальное значение байта =127 , но мне непонятно почему при печати выходит -24
    d = (double) 10.35 ;
    System.out.println("a = " + a + '\n' + "b = " + b +'\n' + "d = " + d);

    //five
    b = (byte) a;
    a = (int) d;
    System.out.println("b = " + b);
    System.out.println("a = " + a);



}



}
