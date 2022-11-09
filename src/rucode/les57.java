package rucode;

/*Метод из теории учитывает регистр букв. То есть A и a с его точки зрения разные символы.
Реализуйте вариант этого же метода, так чтобы регистр букв был не важен:

        App.countChars("HexlEt", 'e'); // 2
        App.countChars("HexlEt", 'E'); // 2
        Character.toLowerCase() – переводит символ в нижний регистр*/
public class les57 {
    public static void main(String[] args) {
            }
    public static int countChars (String str, char ch) {
        var i = 0;
        var count = 0;
               while (i < str.length()) {
                   var currentChar = Character.toLowerCase(str.charAt(i));
                   if (currentChar == Character.toLowerCase(ch)) {
                // Считаем только подходящие символы
                count = count + 1;
            }
            // Счетчик увеличивается в любом случае
            i = i + 1;
        }

        return count;
    }
}
