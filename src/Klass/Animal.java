package Klass;

public abstract class Animal {
    private String name;  // Свойство имя животного

    public Animal(String name) { // Конструктор со строковым параметрам name
        this.name = name; // заполняем ПОЛЕ Name значением из параметра
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayName() { // Объявляем метод
        System.out.println("Животное " + this.name + " это."); // выводи значение из поля Name
    }

}




//
//    public Animal() {
//        System.out.println("вызов анимал ");
//    }

