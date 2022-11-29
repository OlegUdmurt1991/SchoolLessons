package exercises.File;

import java.io.*;
import java.nio.file.Files;

public class FileWrire {
    public static void main(String[] args) {
        File output = new File("output.txt");
        File myFail = new File("Texttt.txt");       //������� ��������� ��������� ������ ����(���� � �����)
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(myFail, true)));        // ������� ����
            file.println("hi, brodyaga");                  //���������� � �������� �����
            file.println("hello worl");
            Files.copy(myFail.toPath(), output.toPath()); //������� ������ ����, ������� ��� �� �������
            file.close();                                    //���������� ����� close ��� �������� ������
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
