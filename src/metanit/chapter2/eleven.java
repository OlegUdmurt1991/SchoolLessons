package metanit.chapter2;

public class eleven {
    public static void main(String[] args) {
        // for
        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.println(i * j);
        }
        // do while
        int qwe = -1;
        do{
            System.out.println(qwe);
            qwe--;
        }
        while (qwe > 0); //Хотя переменная j изначально меньше 0, цикл все равно один раз выполнится.

        // while
        int qw = 6;
        while (qw > 0){

            System.out.println(qw);
            qw--;
        }
        //  break
        for (int zx = 0; zx < 10; zx++){
            if (zx == 5)
                break;
            System.out.println(zx);
        }
        //continue
        for (int con = 0; con < 10; con++){
            if (con == 5)
                continue;
            System.out.println(con);
        }
    }
}
