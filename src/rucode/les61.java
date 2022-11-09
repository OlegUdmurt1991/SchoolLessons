package rucode;

//Задание
//        Реализуйте статический метод App.hasChar(), который проверяет (с учётом регистра),
//        содержит ли строка указанную букву. Метод принимает два параметра:
//
//        Строка
//        Буква для поиска
//        App.hasChar("Renly", 'R'); // true
//        App.hasChar("Renly", 'r'); // false
//        App.hasChar("Tommy", 'm'); // true
//        App.hasChar("Tommy", 'd'); // false
public class les61 {
    public static void main(String[] args) {
    }
    public static boolean hasChar(String str, char ch) {
        var i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == ch) {
                return true;
            }

            i += 1;
        }

        return false;
}
    }



