package Klass;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2]; //Создали массив длиной два
        animals[0] = new Cat("hbjk"); //Создаем объекты нашего класса
        animals[1] = new Dog("tuzik");
        for (int i = 0; i < animals.length; i++) {
            animals[i].sayName();
        }
//        new Tiger();
    }
}







// Альтернативный вариант решения
//        Animal[] animals = new Animal[]{
//                new Cat("Бориска"), //Создаем объекты нашего класса
//                new Dog("Надька")
//        }


//        for (var animalsdhgfj : animals) {
//            animalsdhgfj.sayName();
//        }