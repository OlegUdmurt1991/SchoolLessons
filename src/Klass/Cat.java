package Klass;

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void sayName() {
        super.sayName();

        System.out.println("кот " + getName());
    }
//
//    public Cat() {
//        System.out.println("Вызов кота ");
//    }
}




