package exercises;

public class SixExercises {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Первый пункт а = " + a);
        changeNumber(a);
        System.out.println("Третий пункт a = " + a);
    }
    public static void changeNumber(int a) {
        a = 100;
        System.out.println("Изменили значение в методе. a = " + a);
    }
}






// numbere a = new numbere();
//        System.out.println("Значение переменной до вызова метода " + a.numberOne);
//numbere N = new numbere(8) ;
//        System.out.println("выполнение второго задания " + N.numberOne);
//    }
//static class numbere {
//        int numberOne = 15 ;
//
//    public int getNumberOne() {
//        return numberOne;
//    }
//    public void setNumberOne(int numberOne) {
//        this.numberOne = numberOne;
//    }
//    public numbere(int numberOne) {
//        this.numberOne = numberOne;
//    }
//    public numbere() {
//        this.numberOne = numberOne;
//    }
//}