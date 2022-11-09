package rucode;

//Задание
//        Реализуйте статический метод App.makeItFunny(),
//        который принимает на вход строку и возвращает её копию,
//        у которой каждый n-ный элемент переведен в верхний регистр. n – задается на входе в функцию.
//        Для определения каждого n-ного элемента понадобится остаток от деления %.
//        Подумайте, как его можно использовать.
//
//        var text = "I never look back";
//// Каждый третий элемент
//        App.makeItFunny(text, 3); // "I NevEr LooK bAck"
public class les60 {
    public static void main(String[] args) {
    }

    public static String makeItFunny(String str, int n) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "";
        while (i < str.length()) {
            var current = str.charAt(i);
            if ((i + 1) % n == 0) {
                result = result + Character.toUpperCase(current);
            } else {
                result = result + current;
            }
            i++;
        }

        return result;
    }
}