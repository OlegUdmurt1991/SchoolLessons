package exercises.Exception;

import java.util.Scanner;

public class Exceptionly {
    public static void main (String []args){

    }
    public static int getFactorial(int num){

        int result=1;
        try{
            if(num<1) throw new Exception("The number is less than 1");

            for(int i=1; i<=num;i++){

                result*=i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result=num;
        }
        return result;
    }









//    public static String getWord(String word){
//       String result = null;
//        try{
//            if(word.equals(result)) throw new Exception("The number is less than 1");
//
//            for(int i=1; i!=;i++){
//
//                result*=i;
//            }
//        }
//        catch(Exception ex){
//
//            System.out.println(ex.getMessage());
//            result=num;
//        }
//        return result;
//    }








}
//    public static void main(String[] args) throws Exception {
////        String[] arryName = new String[5];
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите слово: ");
//
////for (int j = 0; j<in.length; j++) {
//    if (in.equals("Хватит")) throw new Exception("сработало исключение");{
//
//        System.out.println("Test1: One and Two are equal");
//    } else {
//        System.out.println("Test1: One and Two are not equal");
//    }
//}
//
//    }
//
//}


//        if (in.equals("Хватит")) throw new Exception("сработало исключение");
//
//
//    }
//
//                System.out.println();
//
//            }


