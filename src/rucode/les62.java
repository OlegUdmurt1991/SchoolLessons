package rucode;

//Задание
//        Сэмвелл обнаружил, что его сообщения перехватываются в замке «Близнецы» и там читаются.
//        Из-за этого их атаки перестали быть внезапными. Немного подумав, он разработал программу,
//        которая бы шифровала сообщения по следующему алгоритму.
//        Она бы брала текст и переставляла в нем каждые два подряд идущих символа.
//
//        App.encrypt("move"); // "omev"
//        App.encrypt("attack"); // "taatkc"
//// Если число символов нечётное
//// то последний символ остается на своем месте
//        App.encrypt("go!"); // "og!"
//        Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение
//        и возвращает зашифрованное.
public class les62 {
    public static void main(String[] args) {
    }

    public static String encrypt(String str) {
        var result = "";
        for (var i = 0; i < str.length(); i += 2) {
            var nextSymbol = (i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
        }

        return result;

    }
}
