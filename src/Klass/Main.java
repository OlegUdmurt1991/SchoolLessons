package Klass;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2]; //������� ������ ������ ���
        animals[0] = new Cat("hbjk"); //������� ������� ������ ������
        animals[1] = new Dog("tuzik");
        for (int i = 0; i < animals.length; i++) {
            animals[i].sayName();
        }
//        new Tiger();
    }
}







// �������������� ������� �������
//        Animal[] animals = new Animal[]{
//                new Cat("�������"), //������� ������� ������ ������
//                new Dog("������")
//        }


//        for (var animalsdhgfj : animals) {
//            animalsdhgfj.sayName();
//        }