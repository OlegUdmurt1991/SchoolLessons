package Klass;

public abstract class Animal {
    private String name;  // �������� ��� ���������

    public Animal(String name) { // ����������� �� ��������� ���������� name
        this.name = name; // ��������� ���� Name ��������� �� ���������
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void sayName() { // ��������� �����
        System.out.println("�������� " + this.name + " ���."); // ������ �������� �� ���� Name
    }

}




//
//    public Animal() {
//        System.out.println("����� ������ ");
//    }

