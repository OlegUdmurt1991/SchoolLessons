package metanit.chapter2;
// ���������� 1
//�������� ���������� ���������, � ������� ������������ � ���������� ������ ��� �����. � ��������� ��������� ��� ��������� ����� � ������� �� ������� ��������� ��������� (��� ����� �����, ������ ����� ������ ������� ��� ������ ����� ������ �������).
import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in) ;
        System.out.print("������ ������ �����: ");
        int firstNum = in.nextInt() ;
        System.out.print("������ ������ �����:  ");
        int secondNum = in.nextInt() ;
        if (firstNum > secondNum) {
            System.out.println("������ ����� ������ �������");
        }
        else if (firstNum < secondNum) {
            System.out.println("������ ����� ������ �������");
        }
        else{
            System.out.println("����� �����");
    }
        in.close();
}}
