//package metanit.chapter2;
////Вопрос 2
////        Что будет выведено на консоль в результате выполнения следующей программы и почему:
////
////public class Program {
////
////    public static void main(String[] args) {
////
////        int a = 5;
////        switch(a){
////            case 4:
////                a++;
////            case 5:
////                a++;
////            case 6:
////            case 7:
////            case 8:
////                a++;
////                break;
////            case 9:
////                a++;
////                break;
////            default:
////                a++;
////        }
////        System.out.println(a);
////    }
////}
////Ответ
////        Поскольку переменная a равна 5, то вначале будет выполняться блок
////
////        1
////        2
////        case 5:
////        a++;
////        Переменная станет равна 6. Этот блок не содержит оператора break, поэтому далее будет выполняться блок:
////
////        1
////        2
////        3
////        4
////        5
////        case 6:
////        case 7:
////        case 8:
////        a++;
////        break;
////        Переменная станет равна 7, и оператор break произведет выход из конструкции switch...case.
//public class вопрос {
//    public static void main(String[] args) {
//
//    }
//}
