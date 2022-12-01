package exercises.File;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class FileWrire {
    public static void main(String[] args) {
        File output = new File("output.txt");
        File myFail = new File("Texttt.txt");       //создаем отдельный экземпляр класса файл(путь к файлу)
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(myFail, true)));        // Создаем файл
            System.out.println("ВВедите текст");
            String [] arrayName = new String[5];
            Scanner in = new Scanner(System.in);
            for (int j = 0; j < arrayName.length; j++){
            String writeLine = in.next(); // Создаем переменную которая по строчно вводит текст
                file.println(writeLine); //Записываем в документ текст
            }
            file.close();                                    //Используем метод close для закрытия потока
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedReader myFailReader = new BufferedReader(new FileReader(myFail));        // Создаем буфер для чтения myFile
            PrintWriter outputWriter = new PrintWriter(new BufferedWriter(new FileWriter(output, true)));
            String line = myFailReader.readLine();
            while (line != null) {
                outputWriter.println(line.toUpperCase());
                line = myFailReader.readLine();
            }
            myFailReader.close();                                    //Используем метод close для закрытия потока
            outputWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



//
//Files.copy(myFail.toPath(), output.toPath()); //создаем второй файл, копируя его из первого