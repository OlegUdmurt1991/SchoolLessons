package exercises;

public class SevenExercises extends Human {
    public static void main(String[] args) {
        Human child = new Human("Oleg", 3);
        System.out.println(child);
        changeHuman(child);
        System.out.println(child);
    }}
class Human {
    private String name;    // ���
    private int age;        // �������
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human() {
    }
    @Override
    public String toString() {
        return ("���- " + name + " ��������- " + age);
    }
    public static void changeHuman(Human human) {
        human.setName("vova");
        human.setAge(19);
        System.out.println("���: " + human.getName() + "�������: " + human.getAge());
    }}


//    void displayInfo() {
//,


    //        child.setName("kolya"); ;
//          System.out.println("���- " + child.getName() + " ��������- " + child.getAge());
//          System.out.println(child);
//          child.displayInfo();


//
//        System.out.println(name + "ijsdf");
//    }




//        child.displayInfo();    (��� ���� ����� 6 � 7 ��������)


//    void edit () {
//        String name = "gleb";
//        int age = 15;
//        System.out.println(name, age);


