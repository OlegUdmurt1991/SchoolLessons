package Klass;

class Dog extends Animal {
//    private String name = "Tuzik";
    public Dog(String name) {

        super(name);
    }
    @Override
    public void sayName() {
        super.sayName();
        System.out.println("Песик " + getName());
    }
}


