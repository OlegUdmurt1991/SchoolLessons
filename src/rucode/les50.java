package rucode;

//Задание
//        На электронной карте Вестероса, которую реализовал Сэм, союзники Старков отображены зеленым кружком,
//        враги — красным, а нейтральные семьи — серым.
//        Напишите для Сэма метод whoIsThisHouseToStarks(), который принимает на вход фамилию
//        семьи и возвращает одно из трех значений: "friend", "enemy", "neutral".
//        Правила определения:
//        Друзья ("friend"): "Karstark", "Tally"
//        Враги ("enemy"): "Lannister", "Frey"
//        Любые другие семьи считаются нейтральными
//        Примеры вызова:
//
//        App.whoIsThisHouseToStarks("Karstark"); // "friend"
//        App.whoIsThisHouseToStarks("Frey");     // "enemy"
//        App.whoIsThisHouseToStarks("Joar");     // "neutral"
//        App.whoIsThisHouseToStarks("Ivanov");   // "neutral"
public class les50 {

        public static String whoIsThisHouseToStarks(String houseName) {
            if ("Karstark".equals(houseName) || "Tally".equals(houseName)) {
                return "friend";
            } else if ("Lannister".equals(houseName) || "Frey".equals(houseName)) {
                return "enemy";
            }

            return "neutral";

    }
    public static void main(String[] args) {
        System.out.println("f");
    }

    }

