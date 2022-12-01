package exercises.File;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class FileWrire {
    public static void main(String[] args) {
        File output = new File("output.txt");
        File myFail = new File("Texttt.txt");       //������� ��������� ��������� ������ ����(���� � �����)
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(myFail, true)));        // ������� ����
            System.out.println("������� �����");
            String [] arrayName = new String[5];
            Scanner in = new Scanner(System.in);
            for (int j = 0; j < arrayName.length; j++){
            String writeLine = in.next(); // ������� ���������� ������� �� ������� ������ �����
                file.println(writeLine); //���������� � �������� �����
            }
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