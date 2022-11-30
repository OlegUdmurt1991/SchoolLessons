package exercises.File;

import java.io.*;
import java.nio.file.Files;

public class FileWrire {
    public static void main(String[] args) {
        File output = new File("output.txt");
        File myFail = new File("Texttt.txt");       //создаем отдельный экземпляр класса файл(путь к файлу)
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(myFail, true)));        // Создаем файл
            file.println("hi, brodyaga");                  //Записываем в документ текст
            file.println("hello worl");
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