package rucode;

/*Задание
Реализуйте метод convertString(), который принимает на вход строку и,
если первая буква не заглавная,
возвращает перевернутый вариант исходной строки.
Если первая буква заглавная, то строка возвращается без изменений.
Если на вход передана пустая строка, метод должен вернуть пустую строку.

App.convertString("Hello"); // "Hello"
App.convertString("hello"); // "olleh"

// Не забудьте учесть пустую строку!
App.convertString(""); // ""
StringUtils.reverse() – переворот строки
Character.isUpperCase() – проверка символа на верхний регистр
Попробуйте написать два варианта функции: с обычным if-else, и с тернарным оператором.

 */
public class les51 {
    public static void main(String[] args) {
            }
    public static String convertString(String str) {
        if (str.equals("")) {
            return "";
        }
        les58 StringUtils = null; // этой строке не было в решении, её добавили идея
        return Character.isUpperCase(str.charAt(0)) ? str : StringUtils.reverse(str);
    }
}

