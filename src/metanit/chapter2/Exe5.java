package metanit.chapter2;
// ���������� 5
//�������� ���������� ���������. ����� ������������ ����� ������ �������� ������ ��� �����, � � ����������� �� ������ �������� � ���������� ������� ����������� ������������ �������� (��������, ��� ����� ����� 3 ����� ����������). ��������� �������� ���������� �� �������.
import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("������� ������ �����: ");
        int num1 = in.nextInt();

        System.out.print("������� ������ �����: ");
        int num2 = in.nextInt();

        System.out.println("������� ����� ��������: 1.��������  2.���������  3.���������");
        int operation = in.nextInt();
        int result = 0;

        switch (operation)
        {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            default:
                System.out.println("����������� ��������");
        }
        if(operation >=1 && operation <= 3){
            System.out.printf("��������� ��������: %d", result);
        }
        in.close();
    }
}