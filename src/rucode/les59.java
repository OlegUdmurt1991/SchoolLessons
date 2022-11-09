package rucode;//Задание
//        Реализуйте статический метод App.filterString(), принимающую на вход строку и символ,
//        и возвращающую новую строку, в которой удален переданный символ во всех его позициях.
//
//        Пример вызова:
//
//        var str = "If I look back I am lost";
//        App.filterString(str, 'I'); // "f  look back  am lost"
//        App.filterString(str, 'o'); // "If I lk back I am lst"

public class les59 {
    public static void main(String[] args) {
            }
    public static String filterString(String str, char ch) {
        // BEGIN (write your solution here)
        var i = 0;
        var result = "" ;
        while (i < str.length()) {
            var currentChar = str.charAt(i);
            if (currentChar != ch) {
                result += currentChar;
            }
            i += 1;
        }
        return result;
        // END

    }
}
