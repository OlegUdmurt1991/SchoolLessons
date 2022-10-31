package exercises.interfake;

public class TV implements IPowerSwitch {
    private String name;
    private Boolean isOn;

    TV(String nameTV) {
        this.name = nameTV;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void model() {
        System.out.println("проверка" + this.name);
    }


    @Override
    public void powerOn() {
        if (!isOn) {
            this.isOn = true;
            System.out.println(this.name + "  включился");
        } else {
            System.out.println(this.name + "  включен");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            this.isOn = false;
            System.out.println(this.name + " выключился");
        } else {
            System.out.println(this.name + "  выключен");
        }
    }
}







//    public TV(String nameTV) { // Конструктор со строковым параметрам name
//        this.nameTV = nameTV;
//    }
//    public String getName() {
//        return nameTV;
//    }
//    public void setName(String nameTV) {
//
//        this.nameTV = nameTV;
//    }
//    public void sayNameTV() { // Объявляем метод
//        System.out.println("Телик" + this.nameTV ); // выводи значение из поля Name
//    }