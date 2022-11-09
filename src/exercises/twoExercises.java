package exercises;

public class twoExercises {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double c = 2;
        System.out.println(a/b); //0 округляет до целого числа
        System.out.println(c/b); //0.6666666666666666 при делении если хоть одно число с плавающей точкой, то и ответ будет с плавающей точкой
        System.out.println(a%b); //2 остаток от деления
        System.out.println(++a); //3 префикс, сначала число увеличивают, потом выводит
        System.out.println(a++); //3 постфикс, сначала число вывели, потом увеличели
        System.out.println(a); // 4 Число увеличилось в предыдущей строке
    }
}
