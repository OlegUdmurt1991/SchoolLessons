package metanit.chapter2;
// �������� �����������
public class ten {
    public static void main(String[] args) {
       // if else
        int num1 = 6;
        int num2 = 8;
        if(num1>num2){
            System.out.println("������ ����� ������ �������");
        }
        else if(num1<num2){
            System.out.println("������ ����� ������ �������");
        }
        else{
            System.out.println("����� �����");
        }
        //switch case
        int num = 3;
        int output = 0;
        switch(num){

            case 1:
                output = 3;
                break;
            case 2:
            case 3:
            case 4:
                output = 6;
                break;
            case 5:
                output = 12;
                break;
            default:
                output = 24;
        }
        System.out.println(output);
        // ��������� ��������
        int x=3;
        int y=2;
        int z = x<y ? (x+y) : (x-y);
        System.out.println(z);
    }
}
