package metanit.chapter2;
//������ 1
//� ������ XYZ ��������� ����� 10 ��������� �������. ����������� ���������� 14 ������� �� 1000 �������, ���������� - 8 �������. �����������, ����� ����������� ��������� ����� ����� 10 ���, �������� �� ��������, ��� ���������� ����������� � ���������� ���������.
public class Exe6 {
    public static void main(String[] args) {

        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
    }
}
