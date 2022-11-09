package rucode;//Реализуйте метод getNumberExplanation(), который принимает на вход число и возвращает
// объяснение этого числа. Если для числа нет объяснения, то возвращается null:

public class les52 {
    public static void main(String[] args) {

    }
    public static String getNumberExplanation(int num) {
        switch (num) {
            case 666:
                return "devil number" ;
            case 42:
                return "answer for everything";
            case 7:
                return "prime number";
            default:
                return "null" ;

        }
    }
}
