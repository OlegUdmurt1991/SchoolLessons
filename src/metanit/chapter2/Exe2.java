package metanit.chapter2;

import java.util.Scanner;
//���������� 2
//�������� ���������� ���������, � ������� ������������ ������ � ���������� �����. ���� ����� ������������ ������ 9 � ������ 2, �� ��������� ������� "����� ������ 5 � ������ 10". ����� ��������� ������� ��������� "����������� �����".
public class Exe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������ �����: ");
        int Num = in.nextInt();
        if (Num < 9 && Num > 2) {
            System.out.println("����� ������ 5 � ������ 10");


        } else {
            System.out.println("����������� �����");
        }
in.close();

    }
}
