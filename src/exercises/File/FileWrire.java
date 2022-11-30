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
            file.close();                                    //���������� ����� close ��� �������� ������
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader myFailReader = new BufferedReader(new FileReader(myFail));        // ������� ����� ��� ������ myFile
            PrintWriter outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));
            String line = myFailReader.readLine();
            while (line != null) {
                outputWriter.println(line.toUpperCase());
                line = myFailReader.readLine();
            }
            myFailReader.close();                                    //���������� ����� close ��� �������� ������
            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//
//Files.copy(myFail.toPath(), output.toPath()); //������� ������ ����, ������� ��� �� �������