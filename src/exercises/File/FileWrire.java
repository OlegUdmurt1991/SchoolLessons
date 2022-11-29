package exercises.File;

import java.io.*;
import java.nio.file.Files;

public class FileWrire {
    public static void main(String[] args) {
        File output = new File("output.txt");
        File myFail = new File("Texttt.txt");       //создаем отдельный экземпл€р класса файл(путь к файлу)
        try {
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter(myFail, true)));        // —оздаем файл
            file.println("hi, brodyaga");                  //«аписываем в документ текст
            file.println("hello worl");
            Files.copy(myFail.toPath(), output.toPath()); //создаем второй файл, копиру€ его из первого
            file.close();                                    //»спользуем метод close дл€ закрыти€ потока
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
